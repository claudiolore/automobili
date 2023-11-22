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
		if(velocita>0)
			velocita-=10;
	}
	
	public void mostraDati()
	{
		System.out.println("velocita: "+velocita);
		System.out.println("Carburante: "+carburante);
		System.out.println("consumo Medio: "+consumoMedio);
		System.out.println("KM percorsi"+kmPercorsi);
	}
	
	public void aggiorna()
	{
		kmPercorsi+=velocita;
		System.out.println("velocita: "+velocita);
		System.out.println("Carburante: "+carburante);
		System.out.println("consumo Medio: "+consumoMedio);
		System.out.println("KM percorsi"+kmPercorsi);
		
	}
	
}
