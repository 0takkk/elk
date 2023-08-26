package com.example.elkspring3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ElkSpring3Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ElkSpring3Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		int i = 0;
		while(true) {
			Thread.sleep(3000);
			log.info("[elk-spring3] {}", ++i);
		}
	}
}
