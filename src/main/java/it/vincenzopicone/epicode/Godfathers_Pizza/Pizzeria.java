package it.vincenzopicone.epicode.Godfathers_Pizza;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Pizzeria {
	
	@Bean
	@Scope("prototype")
	public Pizza creaPizza() {
		return new Pizza();		
	}
	@Bean
	@Scope("prototype")
	public Bevanda creaBevanda() {
		return new Bevanda();
	}
	@Bean
	@Scope("prototype")
	public Articolo creaArticolo() {
		return new Articolo();
	}
	
}
