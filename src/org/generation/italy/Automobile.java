package org.generation.italy;

public class Automobile {

	int velocita;
	float carburante, consumoMedio,totKmPercorsi;
	
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
		System.out.println("KM percorsi:    "+totKmPercorsi+" km");
	}
	
	public void aggiorna()
	{
		int kmPercorsi1h=velocita;
		carburante=carburante-velocita/consumoMedio;
		totKmPercorsi+=velocita;
		System.out.println("Velocita:       "+velocita + " km/h");
		System.out.println("Carburante:     "+carburante + " litri");
		System.out.println("Consumo Medio:  "+consumoMedio+ " km/l");
		System.out.println("KM percorsi:    "+totKmPercorsi+ " km");
	}
}
