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
        int ComputerSpin = spin(2,8);
        int PlayerSpin = spin(1,10);
        int PlayerPoints = 0;
        int ComputerPoints = 0;

        if (ComputerSpin > PlayerSpin) {
            PlayerPoints -= (Math.abs(ComputerSpin - PlayerSpin));
            String s = "You lose. -" + PlayerPoints + "point"
        }

        if (ComputerSpin < PlayerSpin) {
            PlayerPoints += (Math.abs(ComputerSpin - PlayerSpin));
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
