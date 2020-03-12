package cn.enjoy.jobs.xxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cn.enjoy.jobs.business","cn.enjoy.jobs.xxl"})
public class XxlJobApp {

	public static void main(String[] args) {
        SpringApplication.run(XxlJobApp.class, args);
	}

}