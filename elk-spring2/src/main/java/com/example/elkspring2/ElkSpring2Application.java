package com.example.elkspring2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ElkSpring2Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ElkSpring2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		int i = 0;
		while(true) {
			Thread.sleep(2000);
			log.info("[elk-spring2] {}", ++i);
		}
	}
}
