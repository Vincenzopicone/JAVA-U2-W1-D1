package it.vincenzopicone.epicode.Godfathers_Pizza;

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
public class Articolo extends Pizzeria {
	private String nome;
	private Double prezzo;

}
