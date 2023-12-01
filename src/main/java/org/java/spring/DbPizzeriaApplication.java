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
		
		pizzaService.save(new Pizza("Margherita", "Pizza classica con pomodoro, mozzarella e basilico.", "https://images.prismic.io/eataly-us/ed3fcec7-7994-426d-a5e4-a24be5a95afd_pizza-recipe-main.jpg?auto=compress,format", 9.3));
		pizzaService.save(new Pizza("Diavola", "Pizza piccante con salame pizzante e formaggio fuso.", "https://www.lucianopignataro.it/wp-content/uploads/2023/02/Elementi-Pizzeria-Diavola-480x480.png", 10.5));
		pizzaService.save(new Pizza("Siciliana", "Pizza in stile siciliano con pomodori, olive e capperi.", "https://italianspizza.it/wp-content/uploads/2022/06/FAMILY-PIZZA-SICILIANA-online-pizza-sconti-eventi-feste-delivery-consegna-a-domicilio-san-colombano-al-lambro-lambrinia-monteleone-lodi-milano-italia.jpg", 11.7));
		pizzaService.save(new Pizza("Quattro Stagioni", "Pizza con vari ingredienti rappresentanti le quattro stagioni.", "https://i0.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2016/07/3017_Pizza.jpg?resize=895%2C616&ssl=1", 12.9));
		pizzaService.save(new Pizza("Capricciosa", "Carciofi, prosciutto, funghi e olive rendono questa pizza saporita.", "https://i0.wp.com/www.pizzeriagirasole.net/wp-content/uploads/2021/02/WhatsApp-Image-2021-02-10-at-12.40.27.jpeg?fit=1188%2C1135&ssl=1", 13.1));
		pizzaService.save(new Pizza("Marinara", "Pizza semplice con pomodoro, aglio, origano e olio d'oliva.", "https://it.ooni.com/cdn/shop/articles/marinara-for-web.jpg?crop=center&height=800&v=1635275961&width=800", 8.2));
		pizzaService.save(new Pizza("Napoletana", "Pizza napoletana tradizionale con pomodoro, mozzarella e basilico.", "https://www.saporinostri.it/wp-content/uploads/2020/10/le-origini-della-pizza-napoletana-e1601990439881.jpg", 9.4));

		
	}

}
