public class Poem {
    private int liness; 

    public Poem(){
        liness = 0;
    }

    public Poem(int num) {
        this.liness = num;
    }

    public int getNumlines(){
        return liness;
    }

    public void printRhythm() {
        System.out.println("Free Verse!");
    }

    public void funRhythm(int num) {
        for(int i = 1; i<=num; i++) {
            if(i == num) System.out.println("ta");
            else System.out.print("ta-");
        }
    }
}

