package net.blurblah.bservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BServiceApplication.class, args);
	}
}

@RestController
class BServiceController {

	@RequestMapping("/")
	String serviceName() {
		return "Service B";
	}
}