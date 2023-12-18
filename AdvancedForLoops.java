public class AdvancedForLoops {

    public void eights() {

        for(int i = 0; i<4; i++) {
            
            for(int j = i; j>0; j--) {
                System.out.print(" ");
            }

            for(int k = 8-(2*i); k>0; k--) {
                System.out.print((8-(2*i)));
            }

            for(int m = i; m>0; m--) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }


    public void alternate(int n) {

        for (int g = n; g>0; g--) {

            if ((g%2) == 0) {

        for (int i = n; i>0; i--) {
            System.out.print(i);
        }
        System.out.println();
        }

            else {

        for (int j = 1; j<=n; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

    }
}


public static void main(String[]args) {
    AdvancedForLoops afl = new AdvancedForLoops();
    System.out.println("eights method");
    afl.eights();
    System.out.println("alternate method");
    afl.alternate(6);
    afl.alternate(5);

}

}