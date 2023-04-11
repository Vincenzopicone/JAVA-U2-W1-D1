package it.vincenzopicone.epicode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import it.vincenzopicone.epicode.Godfathers_Pizza.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaU2W1D1Application {
	
	public static List <Pizzeria> ordine = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(JavaU2W1D1Application.class, args);
		System.out.println("Ciao Mondo, Hello World");
				
		creaNuovaPizza("Margherita", 10.99);
		creaNuovaBevanda("Coca-Cola", 3.50, 256l);
		creaNuovoArticolo("Cappellino", 5.25);
	}
	
	public static void creaNuovaPizza (String nome, Double prezzo) {
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(Pizzeria.class);
		
		Pizza P = (Pizza) appContext.getBean("creaPizza");
		P.setNome(nome);
		P.setPrezzo(prezzo);
		P.setAggiunte(addAggiunta());
		ordine.add(P);
		System.out.println("La pizza " + P.getNome() + " " + P.getAggiunte().toString() + " è stata aggiunta" );
		
		
		appContext.close();
	}
	
	public static void creaNuovaBevanda (String nome, Double prezzo, Long kcal) {
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(Pizzeria.class);
		
		Bevanda B = (Bevanda) appContext.getBean("creaBevanda");
		B.setNome(nome);
		B.setPrezzo(prezzo);
		B.setKcal(kcal);
		ordine.add(B);
		System.out.println("La bevanda " + B.getNome() + " è stata aggiunta");	
		
		appContext.close();
	}
	public static void creaNuovoArticolo (String nome, Double prezzo) {
		AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(Pizzeria.class);
		
		Articolo A = (Articolo) appContext.getBean("creaArticolo");
		A.setNome(nome);
		A.setPrezzo(prezzo);
		ordine.add(A);
		System.out.println("L'articolo " + A.getNome() + " è stata aggiunto");	
		
		appContext.close();
	}
	
	public static List<Aggiunte> addAggiunta() {
		int scelta;
		List <Aggiunte> ingredienti = new ArrayList<>();
		Aggiunte A1 = new Aggiunte("Mozzarella", 25l, 0d);
		ingredienti.add(A1);
		Aggiunte A2 = new Aggiunte("Pomodoro", 251l, 0d);
		ingredienti.add(A2);
		System.out.println("Vuoi aggiungere l'ananas? 1 si - 2 doppio - 3 avanti - 0 nulla");
		scelta = scanner.nextInt();
		Aggiunte A3 = new Aggiunte("Ananas", 12l, 1.34d);
		switch(scelta) {
		case 1: 
			ingredienti.add(A3);
		case 2:
			ingredienti.add(A3);
			ingredienti.add(A3);
		case 3:
			break;
			default: System.exit(0);
		}
		Aggiunte A4 = new Aggiunte("Cotto", 25l, 1.60d);
		System.out.println("Vuoi aggiungere il cotto? 1 si - 2 doppio - 3 avanti - 0 nulla");
		scelta = scanner.nextInt();
		switch(scelta) {
		case 1: 
			ingredienti.add(A4);
		case 2:
			ingredienti.add(A4);
			ingredienti.add(A4);
		case 3:
			break;
			default: System.exit(0);
		}
		Aggiunte A5 = new Aggiunte("Crudo", 25l, 1.78d);
		System.out.println("Vuoi aggiungere il crudo? 1 si - 2 doppio - 3 avanti - 0 nulla");
		scelta = scanner.nextInt();
		switch(scelta) {
		case 1: 
			ingredienti.add(A5);
		case 2:
			ingredienti.add(A5);
			ingredienti.add(A5);
		case 3:
			break;
			default: System.exit(0);
		}
		return ingredienti;
	}
	
	public static Long calcolaCalorie () {
		Long totaleCalorie = null;
		return totaleCalorie;
	}
	
	public static Double calcolaScontrino() {
		Double conto = 0D;
		//ordine.stream().map(x -> x.getPrezzo());
		return conto;
	}

}
