package sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SampleProjectApplication {

	Run|Debug
	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
	}

	@Getmapping("/")
	public welcomepage() {
		return "Welcome to my page";
	}
        
}