package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Automobile a1=new Automobile();
	Automobile a2=new Automobile();
	Scanner sc=new Scanner(System.in);
	a1.velocita=0;
	a1.carburante=30;
	a1.consumoMedio=20;	//km/l
	a1.kmPercorsi=0;
	System.out.println("Automobile 1");
	a1.mostraDati();
	
	a2.velocita=0;
	a2.carburante=50;
	a2.consumoMedio=23;	//km/l
	a2.kmPercorsi=0;
	System.out.println("\nAutomobile 2");
	a2.mostraDati();
	int autoScelta;
	String risposta;

do {	
	System.out.println("\nChe auto vuoi guidare(1/2)?");
	autoScelta=Integer.parseInt(sc.nextLine());
	
	if(autoScelta!=1 && autoScelta!=2)
	{
		System.out.println("\nAuto non disponibile, inserire (1/2)");
	}
	else if(autoScelta==1)
	{
		System.out.println("\nCosa vuoi fare (accellerare/decellerare)?");
		risposta=sc.nextLine();
		switch(risposta)
		{
		case "accellerare":
			a1.accellera();
			break;
		case "decellerare":
			a1.decellera();
			break;
		}
	}
	else if(autoScelta==2)
	{
		System.out.println("\nCosa vuoi fare (accellerare/decellerare)?");
		risposta=sc.nextLine();
		switch(risposta)
		{
		case "accellerare":
			a2.accellera();
			break;
		case "decellerare":
			a2.decellera();
			break;
		}
	}

	System.out.println("\nAutomobile 1");
	a1.aggiorna();
	
	System.out.println("\nAutomobile 2");
	a2.aggiorna();
	
	System.out.println("Vuoi guidare ancora(si/no)?");
	risposta=sc.nextLine();
}
while(risposta.equals("si"));
	
	
	}

}
