package org.generation.italy;

public class Automobile {

	private int velocita;
	private float carburante, consumoMedio,totKmPercorsi;
	
	public Automobile (float consumoMedio, float carburante) {
		
		this.consumoMedio=consumoMedio;
		velocita=0;
		totKmPercorsi=0;
		
		if(carburante>0)
			this.carburante=carburante;
		else
		{
			System.out.println("errore");
			carburante=0;
		}
			
	}
	
	public void accelera()
	{
		if(velocita<=190 && carburante>0)
			velocita+=10;
		else
			System.out.println("Carburante finito");
	}
	
	public void decelera()
	{
		if(velocita>=10)
			velocita-=10;
	}
	
	public void mostraDati()
	{
		System.out.println("Velocita:       "+velocita+" km/h");
		System.out.println("Carburante:     "+carburante+" litri");
		System.out.println("Consumo Medio:  "+consumoMedio+" km/l");
		System.out.print("KM percorsi:   ");
		for(int i=0;i<totKmPercorsi;i++)
			System.out.print("-");
	}
	
	public void aggiorna()
	{
		int kmPercorsi1h=velocita;
		carburante=carburante-kmPercorsi1h/consumoMedio;
		totKmPercorsi+=velocita;
		if(carburante<=0)
			velocita=0;
	}
}
