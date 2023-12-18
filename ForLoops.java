public class ForLoops {

    public int addEvens(int n) {
        int sum = 0;
        for(int i = 2; i<=n; i+=2){
            sum += i;
        }
        return sum;
    }

    public void printSquaresBack(int n) {
        for(int i = n; i > 1; i--) {
            System.out.print(((int)Math.pow(i,2)) + ", ");
        }
        System.out.println(1);
    }

    public void sillyNumbers(){
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<10; j++) {
                for(int k = 0; k<3; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public void sillyNumbers2(){
        for(int i = 4; i>0; i--) {
            for(int j = 9; j>0; j--) {
                for(int k = 0; k<j; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public void dollarsAndStars() {
        for(int i = 0; i<7; i++) {

            for(int j = (2*i); j>0; j--) {
                System.out.print("*");
            }

            for(int k = (7-i); k>0; k--) {
                System.out.print("$");
            }

            for(int m = (2*(7-i)); m>0; m--) {
                System.out.print("*");
            }

            for(int r = (7-i); r>0; r--) {
                System.out.print("$");
            }

            for(int z = (2*i); z>0; z--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        ForLoops fl = new ForLoops();
        System.out.println("addEvens method");
        System.out.println(fl.addEvens(815));
        System.out.println(fl.addEvens(8561));
        System.out.println(fl.addEvens(745));
        System.out.println("printSquaresBack method");
        fl.printSquaresBack(8);
        fl.printSquaresBack(10);
        fl.printSquaresBack(5);
        System.out.println("sillyNumbers method");
        fl.sillyNumbers();
        System.out.println("sillyNumbers2 method");
        fl.sillyNumbers2();
        System.out.println("dollarsAndStars Method");
        fl.dollarsAndStars();



    }

}

