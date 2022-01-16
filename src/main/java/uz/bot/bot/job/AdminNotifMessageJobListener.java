package uz.gita.bot.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uz.gita.bot.controller.MainController;

public class AdminNotifMessageJobListener implements JobListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminNotifMessageJobListener.class);

    public static final String LISTENER_NAME = "adminNotifJobLister";
    private MainController mainController;


    public AdminNotifMessageJobListener(MainController mainController) {
        this.mainController = mainController;
    }

    @Override
    public String getName() {
        return LISTENER_NAME;
    }

    // Run this if job is about to be executed.
    @Override
    public void jobToBeExecuted(JobExecutionContext jobExecutionContext) {
//        LOGGER.info("Admin_Notification_Message_Job_Listener executed");
//
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.setChatId();
//        sendMessage.setText("Assalomu alaykum. code uz bot serverda ishlab turibdi. A'lo kayfiyat bilan ishingizni davom eting. ");
//        sendMessage.setParseMode("HTML");
//        this.mainController.sendMsg(sendMessage);
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext jobExecutionContext) {

    }

    @Override
    public void jobWasExecuted(JobExecutionContext jobExecutionContext, JobExecutionException e) {

    }
}
