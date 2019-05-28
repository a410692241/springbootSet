package com.wei.scheduled;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Configuration  //开启之后默认添加到springBoot中,启动就会开始执行
//@Component //开启之后默认添加到springBoot中,启动就会开始执行
@EnableScheduling
public class MyScheduled {

    @Scheduled(cron = "0/2 * * * * ?")
    public void runScheduled() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String timeStr = simpleDateFormat.format(new Date());
        System.out.println("run schedule " + timeStr);
    }

    @Scheduled(fixedDelay = 5000)
    public void fixedDelay() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String timeStr = simpleDateFormat.format(new Date());
        System.out.println("run schedule " + timeStr);
    }
}
