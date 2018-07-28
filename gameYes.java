package gamePackage;

import java.util.Scanner;
import gamePackage.roomBuildParts;

public class gameYes 
{
	
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
			playPortal();
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
		roomBuildParts.newRoomDescriptor(0, "Just observing your own Steam collection is enough to bring shame to even you and your noticeable lack of "
		+ "taste. You own a wide collection of obscure\nanime games along with multiple Dragon Ball Z and Naruto games. The only game you own "
		+ "that you are proud of is Portal, and you cant even do that when\nyou're not on your desktop. Now that you think about it. Why did you"
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
	
	@SuppressWarnings("resource")
	public static void playPortal()
	{
		System.out.println("");
		System.out.println("Portal is the one game you seriously enjoy out of your entire collection. Your by far favorite character is GLaDOS. You "
		+ "always play it because you can never\nget enough of her smooth, emotionless, heavily automated voice.");
		System.out.println("");
		System.out.println("<<< GO BACK (1)");
		System.out.println("");

		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		if (answer == 1)
		{
			beginSurfInternet();
		}
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
		System.out.println("<<< GO BACK (5)");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		//Reference room
		if (answer == 1) 
		{
			nintendoTown();
		}
		//Reference room
		if (answer == 2)
		{
			vrJunction();
		}
		//continue room
		if (answer == 3) 
		{
			downFortySecondStreet();
		}
		//hint room
		if (answer == 4)
		{
			searchAlleys();
		}
		if (answer == 5)
		{
			beginSurfInternet();
		}
	}
	
	@SuppressWarnings("resource")
	public static void nintendoTown()
	{
		System.out.println("");
		System.out.println("While floating around Nintendo Town. The only thing you can detect about it is that it contains mystery and extremely"
		+ " inspirational qualities, nothing\nelse can really be said. Nintendo is G.");
		System.out.println("");
		System.out.println("<<< GO BACK (1)");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		if (answer == 1)
		{
			interlineCity();
		}
	}
	
	@SuppressWarnings("resource")
	public static void vrJunction()
	{
		System.out.println("");
		System.out.println("VR Junction is actually called google maps by the humans. If you follow the road signs, it can actually allow you "
		+ "to observe any place that exists on\nplanet earth. The reason why computers call it VR Junction is because of the fact that like "
		+ "whenever humans experience VR, the only thing computers can\nthink of when traveling through the junction is how insanely realistic"
		+ " it looks. But unlike in the real world, you dont have to pay over two grand to\nexperience it");
		System.out.println("");
		System.out.println("<<< GO BACK (1)");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		if (answer == 1)
		{
			interlineCity();
		}
	}
	
	@SuppressWarnings("resource")
	public static void searchAlleys()
	{
		roomBuildParts.newRoomDescriptor(3, "You float down a dark looking nearby street and find 3 dark looking alleys before the street "
		+ "suddenly ends in a brick wall.", "Go down alley one", "go down alley two", "go down alley three", "");
		System.out.println("<<< GO BACK (4)");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		//IP address location
		if (answer == 1)
		{
			System.out.println("");
			System.out.println("You ravel down the first alley and are hit with a sudden sensation of emptieness. "
			+ "Feeling confused you look down to the back of the alley where it seems\nno different than any other boring brick wall, "
			+ "yet something feels like its missing, even though it couldn't possibly exist in the first place. "
			+ "Since\nit was but a fleeting thought though, you quickly shrug off the idea.");
			System.out.println("");
			System.out.println("<<< GO BACK (1)");
			System.out.println("");
			
			int secondAnswer = keyboard.nextInt();
			
			if (secondAnswer == 1)
			{
				searchAlleys();
			}
		}
		//location of virus monster
		if (answer == 2)
		{
			deadBoi("A giant mass of blackness sits at the back of the alley, just seeing it fills your heart with fright. Sadly, it acts quicker"
			+ " then you and shoots\nforward to encompass you and tear you opperating system and hard drives to pieces");
		}

		if (answer == 3)
		{
			System.out.println("");
			System.out.println("You walk in to an empty alley with a few trash cans and open garbage bags leaning against the virtual clean cut"
			+ " brick wall. Danger is near,\nyour trash boi senses are tingling... wait... no... it's just a bad movie refference");
			System.out.println("");
			System.out.println("<<< GO BACK (1)");
			System.out.println("");
			
			int thirdAnswer = keyboard.nextInt();
			
			if (thirdAnswer == 1)
			{
				searchAlleys();
			}
		}
		if (answer == 4)
		{
			interlineCity();
		}
	}
	
	@SuppressWarnings("resource")
	public static void downFortySecondStreet()
	{
		roomBuildParts.newRoomDescriptor(2, "You float along 42nd street and look down at the different stores wondering where you might find"
		+ " Windows 10, only two shops appear before your virtual\ntrash boi eyes.", "Go to the restruant called THE HITCHHIKERS GUIDE TO "
		+ "CHINESE FOOD", "Go to the building called the mean green dank meme machine. The developer lazieness and the stores horrid name"
		+ " threatens to overload your CPU", "", "");
		System.out.println("<<< GO BACK (3)");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		//reference room
		if (answer == 1)
		{
			fortyTwoChinese();
		}
		if (answer == 2)
		{
			dankPrecursor();
		}
		if (answer == 3)
		{
			interlineCity();
		}
	}
	
	@SuppressWarnings("resource")
	public static void fortyTwoChinese ()
	{
		roomBuildParts.newRoomDescriptor(0, "As you enter the resturant you are hit with many amazing smells that almost"
		+ " imediately make you hungry. But among the orchestra of beutiful senses you smell something different. It "
		+ "Smells to be a half baked book refference. You aren't complaining though.", "", "", "", "");
		System.out.println("<<< GO BACK (1)");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		if (answer == 1)
		{
			downFortySecondStreet();
		}
	}
	
	public static void dankPrecursor()
	{
		vSearchAlleys();
	}
	
	@SuppressWarnings("resource")
	public static void dankMemeMachine ()
	{
		Scanner keyboard = new Scanner(System.in);		
		
			roomBuildParts.newRoomDescriptor(1, "The IP address glows and suddenly you are in a room with a black monster... wait a minute.. or this is the first "
			+ "time you have ever been here, you can't\nremember. Either way, as you observe the giant mass that looks like the space between "
			+ "stars. Its smile that sits in its very middle suddenly widens\nimpossibly large. The air infront of you suddenly pulls together"
			+ " to form words, they read, YOU HAVE IT, YOU CAN COLLECT IT, having nothing left to do. ", "use the IP address and collect the "
			+ "copy of windows 10", "", "", "");
			
			int answer = keyboard.nextInt();
			
			if (answer == 1)
			{
				roomBuildParts.newRoomDescriptor(3, "You use the IP address and an invisible barrier before you seems to shatter, just when that happens, your"
				+ " senses are overwhelmed and you feel yourself\nsuddenly diappear and then reappear above Interline City. It feels like you "
				+ "can here laughter echoing from all over the city and it feels like a pain\nyou could never have imagined. You want it to stop", 
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
	
	@SuppressWarnings("resource")
	public static void endPart ()
	{
		for (int i = 1; i <= 20; i++)
		{
			System.out.println("");
		}
		
		System.out.println("You are back on your desktop like nothing happened. for a few seconds you are slightly confused as"
		+ " to what happened. But when you look to your side,\nyou see the shattered copy of windows 10 and it all comes flooding back. The biggest"
		+ " question that came to mind was what was that creature? After\npondering this for a while you decide that it's a question thats better"
		+ " left a mystery. With this experience in mind, you feel alot better about\nyourself and who you are as a computer. Maybe next time "
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
	
	@SuppressWarnings("resource")
	public static void vSearchAlleys()
	{
		roomBuildParts.newRoomDescriptor(3, "You float down a dark looking nearby street and find 3 dark looking alleys before the street "
		+ "suddenly ends in a brick wall. Hold up a second. you feel\na severe sense of deja vu. This place exists in "
		+ "interline city doesn't it. Only one way to find out", "Go down alley one", "go down alley two", "go down alley three", "");
		System.out.println("<<< GO BACK (4)");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		//IP address location
		if (answer == 1)
		{
			System.out.println("");
			System.out.println("You travel down the first alley and discover a bit of text sitting against the wall with bags of trash from "
			+ "some store, it appears that the text is a IP\naddress. It might be useful info. Maybe this has to do with that gap you sensed in"
			+ " the space around that alley earlier.");
			System.out.println("");
			System.out.println("1) Pick up and store the IP address?");
			System.out.println("");
			System.out.println("2) Or leave it there and exit the alley");
			System.out.println("");
			System.out.println("<<< GO BACK (3)");
			System.out.println("");
			
			int secondAnswer = keyboard.nextInt();
			
			if (secondAnswer == 1)
			{
				System.out.println("");
				System.out.println("You pick up the IP address and leave the alley");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				alleySearched();
			}
			if (secondAnswer == 2)
			{
				System.out.println("");
				System.out.println("You decide you don't need it and leave the alley");
				vSearchAlleys();
			}
			if (secondAnswer == 3)
			{
				vSearchAlleys();
			}
		}
		//location of virus monster
		if (answer == 2)
		{
			deadBoi("A giant mass of blackness sits at the back of the alley, just seeing it fills your heart with fright. Sadly, it acts quicker"
			+ " then you and shoots\nforward to encompass you and tear you opperating system and hard drives to pieces. This feels awfully familiar.");
		}

		if (answer == 3)
		{
			System.out.println("");
			System.out.println("You walk in to an empty alley with a few trash cans and open garbage bags leaning against the virtual clean cut"
			+ " brick wall. Danger is near,\nyour trash boi senses are tingling... wait... no... it's just a bad movie refference. Guess there isn't much"
			+ "this virtual generation gets wrong.");
			System.out.println("");
			System.out.println("<<< GO BACK (1)");
			System.out.println("");
			
			int thirdAnswer = keyboard.nextInt();
			
			if (thirdAnswer == 1)
			{
				vSearchAlleys();
			}
		}
		if (answer == 4)
		{
			downFortySecondStreet();
		}
	}
	
	@SuppressWarnings("resource")
	public static void alleySearched()
	{
		roomBuildParts.newRoomDescriptor(3, "You float down a dark looking nearby street and find 3 dark looking alleys before the street "
		+ "suddenly ends in a brick wall. Hold up a second. you feel\na severe sense of deja vu. This place exists in "
		+ "interline city doesn't it. Only one way to find out", "Go down alley one", "go down alley two", "go down alley three", "");
		System.out.println("<<< LEAVE AND FORGET THE IP (4)");
		System.out.println("");
		System.out.println("(5) CONTINUE >>>");
		System.out.println("");
		
		Scanner keyboard = new Scanner(System.in);		
		int answer = keyboard.nextInt();
		
		//IP address location
		if (answer == 1)
		{
			System.out.println("");
			System.out.println("You already have the IP address, there is no need to try and get it again");
			System.out.println("");
			System.out.println("<<< GO BACK (1)");
			System.out.println("");
			
			int secondAnswer = keyboard.nextInt();
			
			if (secondAnswer == 1)
			{
				alleySearched();
			}
		}
		//location of virus monster
		if (answer == 2)
		{
			deadBoi("A giant mass of blackness sits at the back of the alley, just seeing it fills your heart with fright. Sadly, it acts quicker"
			+ " then you and shoots\nforward to encompass you and tear you opperating system and hard drives to pieces. This feels awfully familiar.");
		}

		if (answer == 3)
		{
			System.out.println("");
			System.out.println("You walk in to an empty alley with a few trash cans and open garbage bags leaning against the virtual clean cut"
			+ " brick wall. Danger is near,\nyour trash boi senses are tingling... wait... no... it's just a bad movie refference. Guess there isn't much"
			+ "this virtual generation gets wrong.");
			System.out.println("");
			System.out.println("<<< GO BACK (1)");
			System.out.println("");
			
			int thirdAnswer = keyboard.nextInt();
			
			if (thirdAnswer == 1)
			{
				alleySearched();
			}
		}
		if (answer == 4)
		{
			downFortySecondStreet();
		}
		if (answer == 5)
		{
			dankMemeMachine();
		}

	}
	
	public static void deadBoi(String deathDescription)
	{
			System.out.println("");
	        System.out.println(deathDescription);
	        System.out.println("");
	        System.out.println("Sit in dead trash boi corner and think of why you trash boi");
	        System.out.println("");
	        System.out.println("GAME OVER");
	}
}
