public class Poem {
    private int Liness; 

    public Poem(){
        Liness = 0;
    }

    public Poem(int num) {
        this.Liness = num;
    }

    public int getNumLines(){
        return Liness;
    }

    public void printRhythm() {
        System.out.println("Free Verse!");
    }
}

