package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.binding.Ticket;
import in.ashokit.service.TicketService;

@SpringBootApplication
public class MakeMyTripAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(MakeMyTripAppApplication.class, args);
	}
}
