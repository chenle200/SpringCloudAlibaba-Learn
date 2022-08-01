package com.atguigu.springcloud.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println("zbj = " + zbj);

        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
        System.out.println("zny = " + zny);

//        zbj = 2022-07-28T10:45:07.428+08:00[Asia/Shanghai]
//        zny = 2022-07-27T22:45:07.428-04:00[America/New_York]
    }
}
