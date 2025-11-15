package com.springboot2.internalworkingofspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalworkingofspringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InternalworkingofspringbootApplication.class, args);

	}
	//@Autowired
	private final PaymentService paymentService;

	public InternalworkingofspringbootApplication(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@Override
	public void run(String... args) throws Exception {
		String payment= paymentService.pay();
		System.out.println("Payment Done! "+payment);
	}

}
