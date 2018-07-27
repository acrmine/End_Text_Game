package GamePack;

public class roomBuildParts 
{
	int amountOfChoices;

	public static void newRoomDescriptor (int amountOfChoices, String roomDescription, String choiceOne, 
										 String choiceTwo, String choiceThree, String choiceFour) 
	{
		if (amountOfChoices == 0)
		{
			System.out.println("");
			System.out.println(roomDescription);
			System.out.println("");
		}
		if (amountOfChoices == 1)
		{
			System.out.println("");
			System.out.println(roomDescription);
			System.out.println("");
			System.out.println("1) " + choiceOne);
			System.out.println("");
		}
		if (amountOfChoices == 2) 
		{
			System.out.println("");
			System.out.println(roomDescription);
			System.out.println("");
			System.out.println("1) " + choiceOne);
			System.out.println("");
			System.out.println("2) " + choiceTwo);
			System.out.println("");	
		}
		if (amountOfChoices == 3) 
		{
			System.out.println("");
			System.out.println(roomDescription);
			System.out.println("");
			System.out.println("1) " + choiceOne);
			System.out.println("");
			System.out.println("2) " + choiceTwo);
			System.out.println("");
			System.out.println("3) " + choiceThree);
			System.out.println("");
		}
		if (amountOfChoices == 4) 
		{
			System.out.println("");
			System.out.println(roomDescription);
			System.out.println("");
			System.out.println("1) " + choiceOne);
			System.out.println("");
			System.out.println("2) " + choiceTwo);
			System.out.println("");
			System.out.println("3) " + choiceThree);
			System.out.println("");
			System.out.println("4) " + choiceFour);
			System.out.println("");
		}
	}
}
