package com.example.scheduler.scheduler;


import lombok.RequiredArgsConstructor;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CronScheduler {
    @Scheduled(cron = "0 * * * * *")
    @SchedulerLock(name = "cronTest", lockAtLeastFor = "PT1M", lockAtMostFor = "PT5M")
    public void cronTest(){
        System.out.println("Cron task executed");
    }


}

