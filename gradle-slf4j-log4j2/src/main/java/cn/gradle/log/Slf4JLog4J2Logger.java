package cn.gradle.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: codefans
 * @Date: 2020-07-10 18:33
 */

public class Slf4JLog4J2Logger {

    private Logger log = null;

    public static void main(String[] args) {

        Slf4JLog4J2Logger slf4JLog4J2Logger = new Slf4JLog4J2Logger();
        slf4JLog4J2Logger.print();

    }

    public void print() {
        try {

            String fileName = "log4j2_async_logger.xml";

            //初始化方式1
            System.setProperty("log4j.configurationFile", "classpath:" + fileName);

            log = LoggerFactory.getLogger(Slf4JLog4J2Logger.class);

            log.info("hello world!");
            log.debug("hello world from debug info");

            System.out.println("马上结束了，不知道日志输出有没有问题呢");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
