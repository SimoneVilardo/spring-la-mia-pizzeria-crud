package org.java.spring.controller;

import java.util.List;
import org.java.spring.pojo.Pizza;
import org.java.spring.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PizzaController {

	@Autowired
	private PizzaService pizzaService;
	
	@GetMapping
	public String getPizzas(Model model, @RequestParam(required = false) String q) {
		
		List<Pizza> pizzas = q == null  
				? pizzaService.findAll()
				: pizzaService.findByNome(q);
		
		model.addAttribute("pizzas", pizzas);
		model.addAttribute("q", q == null ? "" : q);
		
		return "pizza_index";
	}
	
	@GetMapping("/pizzas/{id}")
	public String getPizza(Model model, @PathVariable int id) {
		
		Pizza pizza = pizzaService.findById(id);
		
		model.addAttribute("pizza", pizza);
		
		return "pizza_show";
	}
}
