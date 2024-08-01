package az.orient.gittutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GittutorialApplication {

	public static void main(String[] args) {

		SpringApplication.run(GittutorialApplication.class, args);
		System.out.println("Nurlan's changes");
		System.out.println("TEST branch");
	}

}
