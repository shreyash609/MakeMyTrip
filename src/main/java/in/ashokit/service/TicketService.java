package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;

@Service 
public class TicketService {

	public Ticket bookTicket(Passenger p) {
		
		String apiUrl="http://51.20.122.67:8080/bookTicket";
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Ticket> postForEntity = rt.postForEntity(apiUrl,p,Ticket.class);
		
		Ticket body = postForEntity.getBody();
		
		return body;
		
	}
	
	public List<Ticket> getTickets(){
		
		String apiUrl="http://51.20.122.67:8080/tickets";
		
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<Ticket[]> forEntity = rt.getForEntity(apiUrl,Ticket[].class);
		
		Ticket[] body = forEntity.getBody();
		
		List<Ticket> asList = Arrays.asList(body);
		
		return asList;
	}
}
