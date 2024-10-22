package ayush.project.sourcecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class SourcecodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SourcecodeApplication.class, args);
	}

}
