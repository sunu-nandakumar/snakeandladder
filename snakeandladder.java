public class snakeandladder{

public static void main(String args[])
{
int player1;
int position = 0;
int dice = 0;

while ( position < 100)

{

int diceroll = (1 + (int)(Math.random () * 6 ));
int option = (int)((Math.random () * 10) % 3 ) ;

switch (option)
{
	case 1:
	//ladder
	position = position + diceroll;
	System.out.println("current position is : " + position);
	if(position > 100)
	{
	position = position - diceroll;
	}
	dice++;
	break;

	case 2:
	//snake
	if (position > diceroll)

	{
	position = position - diceroll ;
	System.out.println("current position is : " + position);
	}
	else if (position < diceroll )
	{
	position = 0;
	}
	dice++
	break;
	 
	default:
	//no play
	position = position;
	System.out.println("current position is : " + position);
	dice++
}
System.out.println( + option);
System.out.println(+ diceroll );
}
System.out.println(" the no. of times the dice was rolled : " + dice )
}
}
