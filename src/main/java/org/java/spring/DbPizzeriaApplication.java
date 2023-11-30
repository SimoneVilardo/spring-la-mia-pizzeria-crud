package org.java.spring;

import org.java.spring.pojo.Pizza;
import org.java.spring.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbPizzeriaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DbPizzeriaApplication.class, args);
	}
	
	@Autowired
	private PizzaService pizzaService;

	@Override
	public void run(String... args) throws Exception {
		
		pizzaService.save(new Pizza("Margherita", "Descrizione 1", "https://picsum.photos/400/400", 9.3));
		pizzaService.save(new Pizza("Pepperoni", "Descrizione 2", "https://picsum.photos/400/400", 10.5));
		pizzaService.save(new Pizza("Siciliana", "Descrizione 3", "https://picsum.photos/400/400", 11.7));
		pizzaService.save(new Pizza("Quattro Stagioni", "Descrizione 4", "https://picsum.photos/400/400", 12.9));
		pizzaService.save(new Pizza("Capricciosa", "Descrizione 5", "https://picsum.photos/400/400", 13.1));
		pizzaService.save(new Pizza("Marinara", "Descrizione 6", "https://picsum.photos/400/400", 8.2));
		pizzaService.save(new Pizza("Napoletana", "Descrizione 7", "https://picsum.photos/400/400", 9.4));
		
	}

}
