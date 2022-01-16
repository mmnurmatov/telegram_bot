package uz.gita.bot.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToDayRequestCountJob implements Job {
    private static final Logger LOGGER = LoggerFactory.getLogger(ToDayRequestCountJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // LOGGER.info("\n  -----------  AN NULL REQUEST_COUNT  ------------ ");
        // MainController.todayRequestCount = 0;
    }


}
