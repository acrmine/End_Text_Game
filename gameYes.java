package GamePack;

import java.util.Scanner;
import GamePack.roomBuildParts;

public class gameYes 
{
	static boolean possesionOfIpAddress = false;
	
	public static void main(String[] args) 
	{
		desktopStart();
	}
	
	@SuppressWarnings("resource")
	public static void desktopStart() 
	{
		roomBuildParts.newRoomDescriptor(2, "You are Bob the trash computer because Mac is trash, world knows this, u know this. To not be trash you must "
				+ "go on adventure, if you, trash boi, choose\nto accept it", "Think of why you are trash boi", "go on internet search to not "
						+ "be Macintosh trash", "", "");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		if (answer == 1)
		{
			deadBoi("You waited to long and were instead overtaken by shame of trash boi, you decided you probably should have moved to not"
					+ " be trash boi");
		}
		if (answer == 2)
		{
			beginSurfInternet();
		}
	}
	
	@SuppressWarnings("resource")
	public static void beginSurfInternet() 
	{
		roomBuildParts.newRoomDescriptor(3, "In deciding to think of how to not be trash boi you settle for consulting your main desktop. "
		+ "Though you are aware of what your applications are,\nbecause of your status as trash boi, you are worried that your adventure will"
		+ " leave you vulnerable.", "Check out your meager steam games", "Play portal from the desktop", "use your secret browser to "
		+ "teleport to interline city (humans reffer to it as the internet)", "");
		System.out.println("<<< GO BACK (4)");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();

		//Go back room
		if (answer == 1) 
		{
			checkSteam();
		}
		//Go back room
		else if (answer == 2)
		{
			
		}
		else if (answer == 3)
		{
			interlineCity();
		}
		else if (answer == 4)
		{
			desktopStart();
		}
	}
	
	@SuppressWarnings("resource")
	public static void checkSteam ()
	{
		roomBuildParts.newRoomDescriptor(0, "Just observing your own Steam collection is enough to shame even you and your noticeable lack of "
		+ "taste. You own a wide collection of obscure anime games along with multiple Dragon Ball Z and Naruto games. The only game you own "
		+ "that you are proud of is Portal, and you cant even do that when you're not on your desktop. Now that you think about it. Why did you"
		+ " come here in the first place?", "", "", "", "");
		System.out.println("<<< GO BACK (1)");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		if (answer == 1)
		{
			beginSurfInternet();
		}
	}
	
	public static void playPortal()
	{
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("<<< GO BACK (1)");
		System.out.println("");

	}
	
	@SuppressWarnings("resource")
	public static void interlineCity()
	{
		roomBuildParts.newRoomDescriptor(4, "Interline city is a bussling place where super computers zoom through the air pulling data from "
		+ "stores and buildings as they pass just to disappear\nagain as they leave with their protocols fulfilled. You as Bob the trash boi "
		+ "are aware of this, but since you are old, and don't contain the software\nto successfully deal with any application other than "
		+ "yourself. you are left to walk along the streets with other trash bois. It doesn't bug you that\nmuch though because you feel the "
		+ "city resembles a type of Neo New York City. Suddenly it hits you, the perfect way to be not trash boi would be to\nupgrade you "
		+ "operating system, the source of all your problems in the first place. after thinking for a short while you settle on Widows 10. "
		+ "But because\nyou the trash boi dont want to spend money, you're just going to go find a free copy or something.", 
		"Go down to Nintendo town", "Go out of the city to VR Junction", "Continue to 42nd street", "Search nearby alleys");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		//Reference room
		if (answer == 1) 
		{
			
		}
		//Reference room
		if (answer == 2)
		{
			
		}
		//continue room
		if (answer == 3) 
		{
			downFortySecondStreet();
		}
		//Part of finding IP address
		if (answer == 4)
		{
			searchAlleys(possesionOfIpAddress);
		}
	}
	
	@SuppressWarnings("resource")
	public static void searchAlleys(boolean possesionOfIpAddress)
	{
		roomBuildParts.newRoomDescriptor(3, "You float down a dark looking nearby street and find 3 dark looking alleys before the street "
		+ "suddenly ends in a coldisac.", "Go down alley one", "go down alley two", "go down alley three", "");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		//IP address location
		if (answer == 1)
		{
			System.out.println("You travel down the first alley and discover a bit of text sitting against the wall with bags of trash from "
			+ "some store, it appears that the text is a IP address. It might be useful info");
			System.out.println("");
			System.out.println("1) Pick up the and store the IP address?");
			System.out.println("");
			System.out.println("2) Or leave it their and go back out of this alley");
			System.out.println("");
			System.out.println("<<< GO BACK (3)");
			System.out.println("");
			
			int secondAnswer = keyboard.nextInt();
			
			if (secondAnswer == 1)
			{
				System.out.println("You pick up the IP address and leave the alley");
				possesionOfIpAddress = true;
				interlineCity();
			}
			if (secondAnswer == 2)
			{
				System.out.println("You decide you don't need it and leave the alley");
				interlineCity();
			}
			if (secondAnswer == 3)
			{
				searchAlleys(possesionOfIpAddress);
			}

		}
		//location of virus monster
		if (answer == 2)
		{
			deadBoi("A giant mass of blackness sits at the back of the alley, just seeing it fills your heart with fright. Sadly, it acts quicker"
			+ " then you and shoots to encompass you and tear you opperating system and hard drives to pieces");
		}

		if (answer == 3)
		{
			System.out.println("");
			System.out.println("You walk in to an empty alley with a few trash cans and open garbage bags leaning against the virtual clean cut"
			+ " brick wall. Danger is near, your trash boi senses are tingling... wait... no... it's just a bad movie refference");
			System.out.println("");
			System.out.println("<<< GO BACK (1)");
			System.out.println("");
			
			int thirdAnswer = keyboard.nextInt();
			
			if (thirdAnswer == 1)
			{
				searchAlleys(possesionOfIpAddress);
			}
		}
	}
	
	@SuppressWarnings("resource")
	public static void downFortySecondStreet()
	{
		roomBuildParts.newRoomDescriptor(2, "You float along 42nd street and look down at the different stores wondering where you might find"
		+ " Windows 10, only two shops appear before your virtual trash boi eyes.", "Go to the restruant called THE HITCHHIKERS GUIDE TO "
		+ "CHINESE FOOD", "Go to the building called the mean green dank meme machine. The developer lazieness and the stores horrid name"
		+ " threatens to overload your CPU", "", "");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		//reference room
		if (answer == 1)
		{
			
		}
		if (answer == 2)
		{
			dankMemeMachine();
		}
	}
	
	@SuppressWarnings("resource")
	public static void dankMemeMachine ()
	{
		Scanner keyboard = new Scanner(System.in);		
		
		if (possesionOfIpAddress == true) 
		{
			roomBuildParts.newRoomDescriptor(1, "You walk back into the room with the black monster... wait a minute.. or this is the first "
			+ "time you have ever been here, you cant remember. Either way, as you observe the giant mass that looks like the space between "
			+ "stars. Its smile that sits in its very middle suddenly widens impossibly large. The air infront of you suddenly pulls together"
			+ " to form words, they read, YOU HAVE IT, YOU CAN COLLECT IT, having nothing left to do. ", "use the IP address and collect the "
			+ "copy of windows 10", "", "", "");
			
			int sAnswer = keyboard.nextInt();
			
			if (sAnswer == 1)
			{
				roomBuildParts.newRoomDescriptor(4, "You use the IP address and an invisible barrier before you seems to shatter, just when that happens, your"
				+ " senses are overwhelmed and you feel yourself suddenly diappear and then reappear above Interline City. It feels like you "
				+ "can here laughter echoing from all over the city and it feels like a pain you could never have imagined. You want it to stop", 
				"MAKE", "IT", "STOP", "");
				
				int tAnswer = keyboard.nextInt();
				
				//all rooms do the same thing
				if (tAnswer == 1)
				{
					endPart();
				}
				if (tAnswer == 2)
				{
					endPart();
				}
				if (tAnswer == 3)
				{
					endPart();
				}
			}
		}
		
		roomBuildParts.newRoomDescriptor(4, "You stand in a room where the door back seems to have suddently disappeared, when you turn to "
		+ "observe the rest of the room a shadow stands over all and seems to encompass the space, as sullen smile sits in the middle of the"
		+ " blackness that resembles space itself. Seeming to have just noticed, you words form in the air that appear to be made from the "
		+ "fabric of what keeps the world intact. They read YOU ARE NOT READY. The door reappears in the back wall. having nothing else to "
		+ "do you", "LeAvE" , "LeAvE", "LeAvE", "LeAvE");
		
		int answer = keyboard.nextInt();
		
		if(answer == 1)
		{
			downFortySecondStreet();
		}
		if(answer == 2)
		{
			downFortySecondStreet();
		}
		if(answer == 3)
		{
			downFortySecondStreet();
		}
		if(answer == 4)
		{
			downFortySecondStreet();
		}
	}
	
	@SuppressWarnings("resource")
	public static void endPart ()
	{
		for (int i = 1; i <= 20; i++)
		{
			System.out.println("");
		}
		
		System.out.println("You are back on your desktop like nothing happened. for a few seconds you are slightly confused as"
		+ " to what happened. But when you look to your side, you see the shattered copy of windows 10 and it all comes flooding back. The biggest"
		+ " question that came to mind was what was that creature? After pondering this for a while you decide that it's a question thats better"
		+ " left a mystery. With this experience in mind, you feel alot better about yourself and who you are as a computer. Maybe next time "
		+ "you want an upgrade you'll just buy it yourself............................ freeloader");
		
		System.out.println("");
		System.out.println("");
		System.out.println("YOU WIN!");
		System.out.println("");
		System.out.println("Would You Like To Play Again?    y/n");
		
		Scanner keyboard = new Scanner(System.in);		
		String answer = keyboard.nextLine();
		
		if(answer.equals("y"))
		{
			desktopStart();
		}
		if(answer.equals("n"))
		{
			
		}
	}
	
	
	public static void deadBoi(String deathDescription)
	{
			System.out.println("");
	        System.out.println(deathDescription);
	        System.out.println("");
	        System.out.println("Sit in dead trash boi corner and think of why you trash boi");
	}
}
