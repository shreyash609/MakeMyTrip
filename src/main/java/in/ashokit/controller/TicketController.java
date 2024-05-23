package in.ashokit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Passenger;
import in.ashokit.binding.Ticket;
import in.ashokit.service.TicketService;

@Controller
public class TicketController {

	private TicketService service;

	public TicketController(TicketService service) {
		this.service=service;
	}

	@GetMapping("/tickets")
	public String index (Model model) {
		
		List<Ticket> tickets = service.getTickets();
		
		model.addAttribute("tickets",tickets);
		
		return "index";
	}
	
	@GetMapping("/bookTicket")
	public String book(Model model) {
		model.addAttribute("p",new Passenger());
		return "form";
	}
	
	@PostMapping("/book")
	public String bookTicket(@ModelAttribute("p")Passenger p, Model model) {
		
		Ticket bookTicket = service.bookTicket(p);
		
		model.addAttribute("msg","Ticket Booked Succesfully..");
		
		return "form";
	}
}











