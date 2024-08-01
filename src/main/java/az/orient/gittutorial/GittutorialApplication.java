package az.orient.gittutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GittutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(GittutorialApplication.class, args);
		System.out.println("TEST branch");
		System.out.println("Ali's branch");
	}

}
