public class conditionals {

    public static boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }


    public static boolean negPos(int num1, int num2, boolean neg){
        if (neg && num1*num2 > 0) {
            return num1 < 0 && num2 < 0;
        }

    }

    public static void main(String[] args){
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(true,false));
        System.out.println(chimpTrouble(false,false));
        System.out.println(chimpTrouble(false,true));
        System.out.println(negPos(1,-1,false));

    }

}