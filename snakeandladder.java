
public class snakeandladder {
	public static void main(String[] args) {

		// playerPosition array stores position of both players and the current player
		int dice = 0;
		int[] playerPosition = new int[] { 0, 0, 0 };

		while (playerPosition[0] < 100 && playerPosition[1] < 100)

		{ 

			int diceroll = (1 + (int) (Math.random() * 6));
			int option = (int) ((Math.random() * 10) % 3);
			int player1 = 0;
			int player2 = 1;

			switch (option) {
			case 1:
				// ladder
				if (playerPosition[2] == player1) {
					playerPosition[player1] = playerPosition[player1] + diceroll;
					if(playerPosition[player1] > 100) {
						playerPosition[player1]= playerPosition[player1] - diceroll;
					}
					System.out.println("current position is : " + playerPosition[0]);
				} else if (playerPosition[2] == player2) {

					playerPosition[1] = playerPosition[1] + diceroll;
					if(playerPosition[1] > 100) {
						playerPosition[1]= playerPosition[1] - diceroll;
					}
					System.out.println("current position is : " + playerPosition[1]);
				}

				System.out.println("currentplayer is :" + playerPosition[2]);
				dice++;

				break;

			case 2:
				// snake

				if (playerPosition[2] == player1) {
					if (playerPosition[0] > diceroll) {
						playerPosition[0] = playerPosition[0] - diceroll;
						playerPosition[2] = 1;
						

					} else if (playerPosition[0] < diceroll) {
						playerPosition[0] = 0;
						playerPosition[2] = 1;
					}

				}

				else if (playerPosition[2] == player2) {
					if (playerPosition[1] > diceroll) {
						playerPosition[1] = playerPosition[1] - diceroll;
						playerPosition[2] = 0;
					} else if (playerPosition[1] < diceroll) {
						playerPosition[1] = 0;
						playerPosition[2] = 0;
					}
				}
				System.out.println("currentplayer is :" + playerPosition[2]);
				dice++;

				break;

			default:
				// no play

				if (playerPosition[2] == player1) {
					playerPosition[0] = playerPosition[0];
					playerPosition[2] = 1;
					System.out.println("current position is : " + playerPosition[2]);

				} else if (playerPosition[2] == player2) {
					playerPosition[1] = playerPosition[1];
					playerPosition[2] = 0;
				}
				System.out.println("currentplayer is :" + playerPosition[2]);
				dice++;

			}
			System.out.println(+option);
			System.out.println(+diceroll);
		}
		System.out.println(" the no. of times the dice was rolled : " + dice);
		System.out.println(" position of player0 is :" + playerPosition[0]);
		System.out.println(" position of player1 is : " + playerPosition[1]);
}

}




