package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Automobile a1=new Automobile();
	Automobile a2=new Automobile();
	Automobile autoCorrente=a1;
	Scanner sc=new Scanner(System.in);
	a1.velocita=0;
	a1.carburante=30;
	a1.consumoMedio=20;	//km/l
	a1.totKmPercorsi=0;
	
	a2.velocita=0;
	a2.carburante=50;
	a2.consumoMedio=23;	//km/l
	a2.totKmPercorsi=0;
	
	String risposta;
	
	do {	
		System.out.println("\nAuto 1:");
		a1.mostraDati();
		
		System.out.println("\nAuto 2:");
		a2.mostraDati();
		
		System.out.println("\nChe auto vuoi guidare(1/2)?");
		risposta=sc.nextLine();
		
		if(risposta.equals("1"))
			autoCorrente=a1;
		else if(risposta.equals("2"))
			autoCorrente=a2;
		else if(!risposta.equals("1") && !risposta.equals("2")) 
			System.out.println("Auto non disponibile");
		else if(risposta.equals("nessuna"));
		else
			System.out.println("risposta non valida");
			
		if(risposta.equals("1")||risposta.equals("2"))
		{	
			System.out.println("\nVuoi accellerare o decellerare?");
			risposta=sc.nextLine();
			if(risposta.equals("accellerare"))
				autoCorrente.accellera();
			else if(risposta.equals("decellerare"))
				autoCorrente.decellera();
			else if(!risposta.equals("acccellerare") && !risposta.equals("decellerare"))
				System.out.println("Azione non disponibile");

		}
		a1.aggiorna();
		a2.aggiorna();
		
		System.out.println("\nVuoi guidare ancora(si/no)?");
		risposta=sc.nextLine();
	}
	while(risposta.equals("si"));
	
	sc.close();
	}

}
