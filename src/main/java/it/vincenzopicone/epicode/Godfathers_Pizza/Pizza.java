package it.vincenzopicone.epicode.Godfathers_Pizza;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pizza extends Pizzeria {
	private String nome;
	private Double prezzo;
	private List<Aggiunte> aggiunte;
	private Long kcal;	

}
