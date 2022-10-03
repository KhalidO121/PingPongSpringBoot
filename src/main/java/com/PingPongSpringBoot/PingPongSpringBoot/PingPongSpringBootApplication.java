package com.PingPongSpringBoot.PingPongSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PingPongSpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(PingPongSpringBootApplication.class, args);
    }
	@GetMapping("/ping")
	public String sayPong() {
		return "pong";
	}

}
