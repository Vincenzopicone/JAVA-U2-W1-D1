package it.vincenzopicone.epicode.Godfathers_Pizza;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.List;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Aggiunte extends Pizzeria{
	private String nome;
	private Long kcal;
	private Double prezzo;
}
