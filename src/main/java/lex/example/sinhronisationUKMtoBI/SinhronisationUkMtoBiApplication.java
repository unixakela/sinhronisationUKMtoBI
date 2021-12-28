package lex.example.sinhronisationUKMtoBI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SinhronisationUkMtoBiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinhronisationUkMtoBiApplication.class, args);
	}

}
