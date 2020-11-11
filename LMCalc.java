package  trialPackage;

import java.util.Scanner;

import trialPackage.trialClass;

public class LMCalc {
	
	public static void main(String[] args) {
		
		
		System.out.println("This program can currently calculate time required for a research/construction/training session");
		System.out.println("using user-provided info for realistic and hypothetical situations using the variables of:");
		System.out.println("  > Titles (any curently available title that can be given and that affects the aforementioned actions ~ 27/07/2019 ~ )");
		System.out.println("  > Free speedup (depending on VIP level)");
		System.out.println("  > Kingdom boosts");
		System.out.println("  > Turf boosts");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("In later updates we'll add the ability to use helps, gear, castle skins, familiars, even turfclubs.");
		System.out.println("Made with <3 by xXnikosXx wiith the help of *placeholder*"); //add in-game names of testers here
;		
		Scanner sc = new Scanner(System.in); //general scanner
		Scanner scStr = new Scanner(System.in); //String scannner ( to avoid issues when scanning string values with .nextLine
		
		String type; // What boost to calculate?
		
		
		System.out.println("Enter the type of boost you want to calculate (research/construction/training)(More to come...)");
		
		type = scStr.nextLine();
		
		// Checks if "type" value is valid..
		while( !type.equals("research") && !type.equals("construction") && !type.equals("training") ) {
			
			System.out.println("Invalid input, please try again");
			type = scStr.nextLine();
		}

		
		System.out.println("Enter % boost when proper gear is equipped and with economy talents (DON`T USE \"%\" SIGN)...");
		float boost;	//initial boost
		boost = sc.nextLong();
		
		// Checks if "boost" value is valid...
				while (boost < 0) {
					System.out.println("Value out of bounds! Please enter boost % (>= 0) (DON'T USE THE \"%\" SIGN)...");
					boost = sc.nextLong();
				}
		
		System.out.println("Enter VIP level...");
		byte VIPlvl;	//VIP level (to calculate free speedup)
		VIPlvl = sc.nextByte();
		
		// Checks if "VIPlvl" value is valid...
		while (VIPlvl < 2 || VIPlvl > 15) {
			System.out.println("Value out of bounds! Please enter VIP level (2 - 15)..");
			VIPlvl = sc.nextByte();
		}
		
		//Title table
		
		System.out.println("   ");
		System.out.println("WARNING \\\\ IF IN THE  \"BOOST FIELD\"  YOU`VE ENTERED THE TOTAL BOOST WITH ALL OF THE OTHER BOOSTS INCLUDED (TITLES, BOOST ITEMS etc.), ENTER  \"na\"  IN THE FIELDS BELOW");
		System.out.println("WARNING \\\\ IF IN THE  \"BOOST FIELD\"  YOU`VE ENTERED THE TOTAL BOOST WITH ALL OF THE OTHER BOOSTS INCLUDED (TITLES, BOOST ITEMS etc.), ENTER  \"na\"  IN THE FIELDS BELOW");
		System.out.println("WARNING \\\\ IF IN THE  \"BOOST FIELD\"  YOU`VE ENTERED THE TOTAL BOOST WITH ALL OF THE OTHER BOOSTS INCLUDED (TITLES, BOOST ITEMS etc.), ENTER  \"na\"  IN THE FIELDS BELOW");
		System.out.println("   ");
		
		System.out.println("                                                         ~~~ TITLES TABLE ~~~                                                                            ");
		
		System.out.println("=========================================================================================================================================================");
		
		System.out.println("    OVERLORD TITLES:                BARON TITLES:                          EMPEROR TITLES:                             KINGDOM TITLES:                   ");
		System.out.println("---------------------------- || ---------------------------- || ---------------------------------------- || ---------------------------------------------");
		System.out.println(" |1|CHIEF       |4|SLOB      || |1|BARONET      |3|ARCHITECT ||  |1|HIGH PRIEST     |2|CHIEF INSTRUCTOR  ||  |1|SUPER SOLDIERS      |3|EFFICIENT WORKERS ");
		System.out.println(" |2|ENGINEER    |5|BUM       || |2|PROFESSOR    |4|SERGEANT  || ---------------------------------------- ||  |2|MASTER BUILDERS     |4|CLEVER RESEARCHERS");
		System.out.println(" |3|SCHOLAR     |6|FOOL      || ---------------------------- || ---------------------------------------- || ---------------------------------------------");
		System.out.println("       |7|SCOUNDREL          || ---------------------------- || ---------------------------------------- || ---------------------------------------------");
		System.out.println("=========================================================================================================================================================");
		
		//Read title values to calculate new boost
		System.out.println("Enter title assigned by the Overlord..");
		String OvTit = scStr.nextLine(); //Title given by the Overlord
		
		//checks if "OvTIt" value is valid..
		while( !OvTit.equals("chief") && !OvTit.equals("engineer") && !OvTit.equals("scholar") && !OvTit.equals("scoundrel") && !OvTit.equals("slob") && !OvTit.equals("bum") && !OvTit.equals("fool") && !OvTit.equals("na") ) { 
			
			System.out.println("Invalid input, please try again");
			OvTit = scStr.nextLine();
		}
		
		System.out.println("Enter title assigned by the Baron..");
		String BarTit; //Title given by the Baron
		BarTit = scStr.nextLine();
		
		//checks if "BarTIt" value is valid..
		while( !BarTit.equals("baronet") && !BarTit.equals("professor") && !BarTit.equals("architect") && !BarTit.equals("sergeant") && !BarTit.equals("na") ) { 
			
			System.out.println("Invalid input, please try again");
			BarTit = scStr.nextLine();
		}
		
		
		System.out.println("Enter title assigned by the Emperor..");
		String EmpTit; //Title given by the Emperor
		EmpTit = scStr.nextLine();
		
		//checks if "EmpTIt" value is valid..
		while( !EmpTit.equals("high priest") && !EmpTit.equals("chief instructor") && !EmpTit.equals("na") ) { 
			
			System.out.println("Invalid input, please try again");
			EmpTit = scStr.nextLine();
		}
		
		System.out.println("Enter your Kingdom\'s title assigned by the Emperor..");
		String KdTit; //Kingdom title - given by the Emperor -
		KdTit = scStr.nextLine();
		
		//checks if "KdTit" value is valid..
		while( !KdTit.equals("super soldiers") && !KdTit.equals("master builders") && !KdTit.equals("efficient workers") && !KdTit.equals("clever researchers") && !KdTit.equals("na") ) { 
			
			System.out.println("Invalid input, please try again");
			KdTit = scStr.nextLine();
		}
		
		
		
		//Calculate new boost *with titles* depending on "type" value.
		if( type.equals("research") ) { //research
			
			//overlord titles
			if( OvTit.equals("scholar") ) {
				boost = (boost + 10); //overlord title buff (rsrch)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( OvTit.equals("FOOL") ) {
				boost = (boost - 10); //overlord title nerf (rsrch)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( OvTit.equals("na") ) {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			
			//baron titles
			if(BarTit == "professor") {
				boost = (boost + 10); //baron title buff (rsrch)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if(BarTit == "na") {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			
			//emperor titles
			if( EmpTit.equals("high priest") ) {
				boost = (boost + 12); //emperor title buff (rsrch)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( EmpTit.equals("na") ) {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			
			//kingdom titles
			if( KdTit.equals("efficient workers") ) {
				boost = (boost + 3); //kingdom title buff #1 (rsrch)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( KdTit.equals("clever researchers") ) {
				boost = (boost + 5); //kingdom title buff #2 (rsrch)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( KdTit.equals("na") ) {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			
		}
		else if( type.equals("construction") ) { //construction
			
			//test
			System.out.print("new boost : ");
			System.out.println(boost);
			
			//overlord titles
			if( OvTit.equals("engineer") ) {
				boost = (boost + 10); //overlord title buff (const)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( OvTit.equals("bum") ) {
				boost = (boost - 10); //overlord title nerf (const)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( OvTit.equals("na") ) {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			
			//baron titles
			if(BarTit == "architect") { 
				boost = (boost + 10); //baron title buff (const)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if(BarTit == "na") {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			
			//emperor titles
			if( EmpTit.equals("high priest") ) {
				boost = (boost + 10); //emperor title buff (const)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( EmpTit.equals("na") ) {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			
			//kingdom titles
			if( KdTit.equals("master builders") ) {
				boost = (boost + 10); //kingdom title buff (const)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( KdTit.equals("na") ) {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
		}
		else if( type.equals("training") ) { //training
			
			//overlord titles
			if( OvTit.equals("chief") ) {
				boost = (boost + 5); //overlord title buff (tr)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( OvTit.equals("scoundrel") ) {
				boost = (boost - 8); //overlord title nerf #1 (tr)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( OvTit.equals("slob") ) {
				boost = (boost - 5); //overlord title nerf #2 (tr)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( OvTit.equals("na") ) {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			
			//baron titles
			if(BarTit == "baronet") {
				boost = (boost + 5); //baron title buff #1 (tr)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if(BarTit == "sergeant") { 
				boost = (boost + 8); //baron title buff #2 (tr)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if(BarTit == "na") {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			
			//emperor titles
			if( EmpTit.equals("archduke") ) {
				boost = (boost + 5); //emperor title buff #1 (tr)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( EmpTit.equals("chief instructor") ) {
				boost = (boost + 10); //emperor title buff #2 (tr)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( EmpTit.equals("na") ) {
				System.out.println("no change"); //na
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			
			//kingdom titles
			if( KdTit.equals("super soldiers") ) {
				boost = (boost + 5); //kingdom title buff #1 (tr)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( KdTit.equals("efficient workers") ) {
				boost = (boost + 3); //kingdom title buff #2 (tr)
				
				//test
				System.out.print("new boost : ");
				System.out.println(boost);
			}
			else if( KdTit.equals("na") ) {
				System.out.println("no change"); //na
			}
		}
		
		//print new boost
		System.out.print("Boost with title(s) : ");
		System.out.println(boost);
		
		
		//used "if"because forgot about switch-case and this piece of code took me about 1hr to write, aint gonna dump it yet
		//(its a small program (for now, atleast) so using switch-case wont make a significant difference in length or speed.... i think?)
		//will change soon into a switch-case method to make code shorter and less repetitive, and make the program run faster (maybe?)
		
		
		//scan turf boost value
		System.out.println("Enter % of turf boost, if applicable. if not applicable or calculated with initial boost, enter 0...");
		byte trfBoost = sc.nextByte();
		
		//check if "trfBoost" value is valid
		while ( trfBoost != 10 && trfBoost != 20 && trfBoost != 0) {
			System.out.println("Value out of bounds; please enter a valid turf boost (10/20) or 0..." );
			trfBoost = sc.nextByte();
		}
		
		//calculate new boost
		boost = (boost + trfBoost);
		
		//scan kingdom boost
		System.out.println("Is there an active Kingdom Boost? (y/n)");
		char kdBoost = sc.next().charAt(0);
		
		//check if "kdBoost" value is valid
		while (kdBoost != 'y' && kdBoost != 'n') {
			System.out.println("Value out of bounds; please type \"y\" or \"n\": Is there an active Kingdom Boost?");
			kdBoost = sc.next().charAt(0);
		}
		
		if (kdBoost == 'y') {
			boost = (boost + 10);
		}
		
		
		//print current boost
		System.out.println("New " + type + " boost is: " + boost + "!");
		
		//scan initial time
		System.out.println("Enter #INITIAL# time required for the " + type + "...");
		
		System.out.println("DAYS");
		short initDays = sc.nextShort();
		
		System.out.println("HOURS");
		byte initHrs = sc.nextByte();
		
		System.out.println("MINUTES");
		byte initMins = sc.nextByte();
		
		System.out.println("SECONDS");
		byte initSecs = sc.nextByte();
		
		//convert times into hours and sum for total initial time.
		float initTime = (initDays * 24 ) + (initHrs) + (initMins / 60) + ( (initSecs / 60) / 60 );
		System.out.println( "Initial time in #HOURS#" + initTime); // JUST FOR TESTING
		
		//Time after boost w/o free speedup.
		double boostTime;
		boostTime = initTime / ( 1 + (boost / 100) );
		System.out.println("Time required to complete " + type + " without the free speedup is: " + boostTime);
		
		//convert boostTime from hrs to DD/HH/MM/SS and print
		double BoostDays;
		double BoostHrs;
		double BoostMins;
		double BoostSecs;
		
		BoostDays = boostTime / 24;
		System.out.println("days " + (long)BoostDays );
		BoostHrs = (boostTime % 24);
		
		BoostMins = (BoostHrs / 60);
		
		
		sc.close();
		scStr.close();
	}
	
}
//i REALLY dislike writing anything and having to see the bottom of a page, so here are some random empty lines that noone but me cares about =)













































