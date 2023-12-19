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

        for (int g = 0; g<=n; g++) {

            if ((g%2) == 0) {

        for (int i = g; i>0; i--) {
            System.out.print(i);
        }
        System.out.println();
        }

            else {

        for (int j = 1; j<=g; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

    }
}

    public void isosceles(int n) {
        for (int m = 1; m<=n; m++) {
        for (int i = (n-m); i>1; i--) {
            System.out.print(" ");
        }
        for (int j = 1; j<= (m-1); j++) {
            System.out.print(j);
        }
        for (int v = m; v>(m-1); v--) {
            System.out.print(v);
        }
        for(int z = (m-1); z>=1; z--) {
            System.out.print(z);
        }
        for (int k = (n-m); k>1; k--) {
            System.out.print(" ");
        }
        System.out.println();
    }
    }

public static void main(String[]args) {
    AdvancedForLoops afl = new AdvancedForLoops();
    System.out.println("eights method");
    afl.eights();
    System.out.println("alternate method");
    afl.alternate(6);
    afl.alternate(5);
    afl.alternate(3);
    afl.alternate(9);
    System.out.println("isosceles method");
    afl.isosceles(7);
    afl.isosceles(5);
    afl.isosceles(9);

}

}