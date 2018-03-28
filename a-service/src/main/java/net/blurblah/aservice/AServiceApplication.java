package net.blurblah.aservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AServiceApplication.class, args);
	}
}

@RestController
class AServiceController {

	@RequestMapping("/")
	String serviceName() {
		return "Service A";
	}
}