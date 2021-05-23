package com.leon.hellojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HelloJenkinsApplication extends SpringBootServletInitializer {


//    /**
//     * jar 方式启动
//     *
//     * @param args
//     */
//    public static void main(String[] args) {
//        SpringApplication.run(HelloJenkinsApplication.class, args);
//    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }

    /**
     * war 启动
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloJenkinsApplication.class, args);
    }

}
