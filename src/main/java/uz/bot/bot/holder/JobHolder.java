package uz.gita.bot.holder;

import org.quartz.*;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;
import org.quartz.impl.triggers.CronTriggerImpl;
import uz.gita.bot.controller.MainController;
import uz.gita.bot.job.AdminNotifMessageJobListener;
import uz.gita.bot.job.ToDayRequestCountJob;

import java.text.ParseException;

public class JobHolder {


    public JobHolder(MainController mainController) {

        this.adminMessageSender(mainController);
//        this.userRequestJob();

    }


    private void userRequestJob() {
        /* USER REQUEST COUNT */

        try {

            JobDetailImpl job = new JobDetailImpl();
            job.setName("REQUEST COUNT JOB");
            job.setJobClass(ToDayRequestCountJob.class);

            CronTriggerImpl trigger = new CronTriggerImpl();
            trigger.setName("REQUEST TRIGGER COUNT");
            //  trigger.setCronExpression("0 0/1 * * * ?");

            trigger.setCronExpression("0 0 23 * * ?");

            Scheduler scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start();
            scheduler.scheduleJob(job, trigger);

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    private void adminMessageSender(MainController mainController) {
        try {

            JobKey jobKey = new JobKey("adminNotif", "group1");

            JobDetail job = JobBuilder.newJob(ToDayRequestCountJob.class)
                    .withIdentity(jobKey).build();

            Trigger trigger = TriggerBuilder
                    .newTrigger()
                    .withIdentity("dummyTriggerName", "group1")
                    .withSchedule(
                            CronScheduleBuilder.cronSchedule("0 0 */1 ? * *"))
                    .build();


            // CronScheduleBuilder.cronSchedule("0 0 */2 ? * *"))
            //  CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))

            Scheduler scheduler = new StdSchedulerFactory().getScheduler();

            //Listener attached to jobKey
            scheduler.getListenerManager().addJobListener(
                    new AdminNotifMessageJobListener(mainController), KeyMatcher.keyEquals(jobKey)
            );

            //Listener attached to group named "group 1" only.
            //scheduler.getListenerManager().addJobListener(
            //	new HelloJobListener(), GroupMatcher.jobGroupEquals("group1")
            //);

            scheduler.start();
            scheduler.scheduleJob(job, trigger);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
