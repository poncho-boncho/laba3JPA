package ponchoboncho.labs.laba3JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ponchoboncho.labs.laba3JPA.services.AppService;

@SpringBootApplication
public class Laba3JpaApplication {

	@Autowired
	private AppService appService;


	public static void main(String[] args) {
		SpringApplication.run(Laba3JpaApplication.class, args);

		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		//		JavaConfig.class
		//);
	}

}
