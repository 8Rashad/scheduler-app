package com.example.scheduler.scheduler;

import lombok.RequiredArgsConstructor;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FixedDelayString {
    @Scheduled(fixedDelayString = "PT1M")
    @SchedulerLock(name = "test", lockAtLeastFor = "PT1M", lockAtMostFor = "PT5M")
    public void test() {
    System.out.println("Fixed Delay String task executed ");

    }
}
