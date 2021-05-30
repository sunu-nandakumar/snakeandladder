
public class snakeandladder {
	public static void main(String[] args) {

		int dice = 0;
		int[] arr = new int[] { 0, 0, 0 };

		while (arr[0] < 100 && arr[1] < 100)

		{

			int diceroll = (1 + (int) (Math.random() * 6));
			int option = (int) ((Math.random() * 10) % 3);

			switch (option) {
			case 1:
				// ladder
				if (arr[2] == 0) {
					arr[0] = arr[0] + diceroll;
					if(arr[0] > 100) {
						arr[0]= arr[0] - diceroll;
					}
					System.out.println("current position is : " + arr[0]);
				} else if (arr[2] == 1) {

					arr[1] = arr[1] + diceroll;
					if(arr[1] > 100) {
						arr[1]= arr[1] - diceroll;
					}
					System.out.println("current position is : " + arr[1]);
				}

				System.out.println("currentplayer is :" + arr[2]);
				dice++;

				break;

			case 2:
				// snake

				if (arr[2] == 0) {
					if (arr[0] > diceroll) {
						arr[0] = arr[0] - diceroll;
						arr[2] = 1;
						

					} else if (arr[0] < diceroll) {
						arr[0] = 0;
						arr[2] = 1;
					}

				}

				else if (arr[2] == 1) {
					if (arr[1] > diceroll) {
						arr[1] = arr[1] - diceroll;
						arr[2] = 0;
					} else if (arr[1] < diceroll) {
						arr[1] = 0;
						arr[2] = 0;
					}
				}
				System.out.println("currentplayer is :" + arr[2]);
				dice++;

				break;

			default:
				// no play

				if (arr[2] == 0) {
					arr[0] = arr[0];
					arr[2] = 1;
					System.out.println("current position is : " + arr[2]);

				} else if (arr[2] == 1) {
					arr[1] = arr[1];
					arr[2] = 0;
				}
				System.out.println("currentplayer is :" + arr[2]);
				dice++;

			}
			System.out.println(+option);
			System.out.println(+diceroll);
		}
		System.out.println(" the no. of times the dice was rolled : " + dice);
		System.out.println(" position of player0 is :" + arr[0]);
		System.out.println(" position of player1 is : " + arr[1]);
}

}




