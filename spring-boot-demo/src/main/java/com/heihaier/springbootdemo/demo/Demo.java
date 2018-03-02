package com.heihaier.springbootdemo.demo;

import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.joda.time.Interval;

/**
 * @author heihaier@mmears.com
 * Date: 02/03/2018
 * Time: 16:04
 */
@Slf4j
public class Demo {

    public static void main(String[] args) {
        DateTime startTime = DateTime.now();
        DateTime endTime = startTime.withTimeAtStartOfDay().withDayOfWeek(1).plusWeeks(2);
        Interval interval = new Interval(startTime, endTime);
        log.info("interval: {}", interval);
    }
}
