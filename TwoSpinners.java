public class TwoSpinners{
 	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
 	public int spin(int min, int max)
 	{
     	    int result=0;
            result = (int) (Math.random() * (max-min))+min;
     	    //add code here
    	    return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
        int ComputerSpin1 = spin(2,8);
        int PlayerSpin1 = spin(1,10);
		int EarnedPoints = 0;

        if (ComputerSpin1 > PlayerSpin1) {
			EarnedPoints -= (Math.abs(ComputerSpin1 - PlayerSpin1));
            System.out.println("You lose. " + EarnedPoints + " points.");
			EarnedPoints = 0;
        }

        if (ComputerSpin1 < PlayerSpin1) {
			EarnedPoints += (Math.abs(ComputerSpin1 - PlayerSpin1));
			System.out.println("You win! " + EarnedPoints + " points.");
			EarnedPoints = 0;
        }

		else {
			int PlayerSpin2 = spin(1,10);
			int ComputerSpin2 = spin(2,8);

			if ((PlayerSpin2 + PlayerSpin1) > (ComputerSpin1 + ComputerSpin2)) {
				System.out.println("You win! 1 point.");
			}

			if ((PlayerSpin2 + PlayerSpin1) < (ComputerSpin1 + ComputerSpin2)) {
				System.out.println("You lose. -1 point.");
			}

			else {
				System.out.println("Tie. 0 points.");
			}
		}
   	    // add code here    	
	}

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
         		ds.playRound();
     	      }

 	  }

 }