package robot;


import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import robot.models.dailytask.MyJob;

import java.sql.SQLException;

public class DailyTaskApplication {

    public static void main(String[] args) throws SQLException, SchedulerException {
        ///轮询方法  定时执行 一秒一次
        //创建任务
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("job1", "group1").build();
        //创建触发器 每10秒钟执行一次
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group3")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(60).repeatForever())
                .build();
        //创建调度器
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        //将任务及其触发器放入调度器
        scheduler.scheduleJob(jobDetail, trigger);
        //调度器开始调度任务
        scheduler.start();
    }
}
