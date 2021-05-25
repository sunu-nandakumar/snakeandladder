public class snakeandladder{

public static void main(String args[])
{
int player1;
int position = 0;
int dice = 0;
int sum0=0;
int sum1=0;
int currentplayer=0;

while ( sum0 < 100 && sum1 <100 )

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
	if ( currentplayer == 0)
        {
        sum0= sum0 + diceroll;
        
        }
        else if ( currentplayer == 1 )
        {
        sum1= sum1 + diceroll;
        
        }

	System.out.println( "currentplayer is :" + currentplayer );
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
	dice++;
	if ( currentplayer == 0)
	{
	sum0= sum0 - diceroll;
	currentplayer=1;
	}
	else if ( currentplayer == 1 )
	{
	sum1= sum1 - diceroll;
	currentplayer = 0;
	}
	 System.out.println( "currentplayer is :" + currentplayer );

	break;
	 
	default:
	//no play
	position = position;
	System.out.println("current position is : " + position);
	dice++;
	 if ( currentplayer == 0)
        {
        sum0= sum0 ;
        currentplayer=1;
        }
        else if ( currentplayer == 1 )
        {
        sum1= sum1 ;
        currentplayer = 0;
        }
	 System.out.println( "currentplayer is :" + currentplayer );



}
System.out.println( + option);
System.out.println(+ diceroll );
}
System.out.println(" the no. of times the dice was rolled : " + dice );
System.out.println(" position of player0 is :" + sum0 );
System.out.println(" position of player1 is : " + sum1 );

}
}


