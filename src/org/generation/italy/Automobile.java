package org.generation.italy;

public class Automobile {

	int velocita;
	float carburante, consumoMedio,kmPercorsi;
	
	public void accellera()
	{
		if(velocita<=190)
			velocita+=10;
	}
	
	public void decellera()
	{
		if(velocita>=10)
			velocita-=10;
	}
	
	public void mostraDati()
	{
		System.out.println("Velocita:       "+velocita+ " km/h");
		System.out.println("Carburante:     "+carburante+" litri");
		System.out.println("Consumo Medio:  "+consumoMedio+" km/l");
		System.out.println("KM percorsi:    "+kmPercorsi+" km");
	}
	
	public void aggiorna()
	{
		carburante=carburante-kmPercorsi/consumoMedio;
		kmPercorsi+=velocita;
		System.out.println("Velocita:       "+velocita + " km/h");
		System.out.println("Carburante:     "+carburante + " litri");
		System.out.println("Consumo Medio:  "+consumoMedio+ " km/l");
		System.out.println("KM percorsi:    "+kmPercorsi+ " km");
	}
}
