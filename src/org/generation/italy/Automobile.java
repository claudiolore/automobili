package org.generation.italy;

public class Automobile {

	int velocita;
	float carburante, consumoMedio,totKmPercorsi;
	
	public void accellera()
	{
		if(velocita<=190 && carburante>0)
			velocita+=10;
		else
			System.out.println("Carburante finito");
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
		System.out.print("KM percorsi:   ");
		for(int i=0;i<totKmPercorsi;i++)
			System.out.print("-");
	}
	
	public void aggiorna()
	{
		int kmPercorsi1h=velocita;
		carburante=carburante-velocita/consumoMedio;
		totKmPercorsi+=velocita;
		if(carburante<=0)
			velocita=0;
	}
}
