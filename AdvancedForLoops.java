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

    public void isosceles(int h) {

        for (int m = 1; m<=h; m++) {

            for (int i = (1+(h-m)); i>1; i--) {
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

            for (int k = (1+(h-m)); k>1; k--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public void upSideDown(int a, int b) {

        for (int i = 0; i<=(a-b); i++) {

            for (int d = i; d>0; d--) {
                System.out.print(" ");
            }

            for (int j = (a-(0+i)); j>b; j--) {
                System.out.print(j);
            }

            for (int k = b; k>(b-1); k--) {
                System.out.print(k);
            }

            for (int m = (b+1); m<=(a-i); m++) {
                System.out.print(m);
            }
            
            for (int z = (a-(0+i)); z>b; z--) {
                System.out.print(" ");
            }

            for (int g = i; g>0; g--) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    public static void main(String[]args) {
        AdvancedForLoops afl = new AdvancedForLoops();
        System.out.println("eights method");
        System.out.println();
        afl.eights();
        System.out.println();
        System.out.println("alternate method");
        afl.alternate(6);
        afl.alternate(5);
        afl.alternate(3);
        afl.alternate(9);
        System.out.println();
        System.out.println("isosceles method");
        System.out.println();
        afl.isosceles(5);
        System.out.println();
        afl.isosceles(9);
        System.out.println();
        System.out.println("upSideDown method");
        System.out.println();
        afl.upSideDown(9,5);
        System.out.println();
        afl.upSideDown(8,6);
        System.out.println();
        afl.upSideDown(7,3);

    }

}