package robot.models.dailytask;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import robot.api.DailyApi;

import java.io.IOException;

public class MyJob implements Job {

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        DailyApi dailyApi = new DailyApi();
        try {
            dailyApi.getDaily();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
