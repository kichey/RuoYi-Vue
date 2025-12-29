package com.ruoyi.quartz.task;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyTask {
    public void doTask() {
        System.out.println("定时任务开始执行: "+new Date());
    }
}
