package bg.tuvarna.usp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NeedForCarsSpringApplication {

//	private final UserService userService;
//
//	public NeedForCarsSpringApplication(UserService userService) {
//		this.userService = userService;
//	}
//	@Bean
//	public TransactionManager transaction() {
//		TransactionManager tm = new JpaTransactionManager();
//	}

	public static void main(String[] args) {
		SpringApplication.run(NeedForCarsSpringApplication.class, args);
	}

}
