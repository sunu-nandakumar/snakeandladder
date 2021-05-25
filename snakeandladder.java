public class snakeandladder{

public static void main(String args[])
{
int player1;
int position = 0;

int diceroll = (1 + (int)(Math.random () * 6 ));

int option = (int)((Math.random () * 10) % 3 ) ;

	System.out.println( + option);

switch (option)
{
	case 1:
	//ladder
	position = position + diceroll;
	System.out.println("current position is : " + position);
	break;

	case 2:
	//snake
	if (position > diceroll)

	{
	position = position - diceroll ;
	System.out.println("current position is : " + position);
	}
	break;
	 
	default:
	//no play
	position = position;
	System.out.println("current position is : " + position);

}

System.out.println(+ diceroll );

}
}
