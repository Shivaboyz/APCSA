public class MathEx{

    public static void main(String[] args){

        int last= swap(91);
        System.out.println(last);



    }

    public static int swap(int initial){

        int intialhundreds= initial/100; 
        int initialtens= initial/10;
        int initalones= initial%10;
        int last= initial*100 + initalones*10 + initialtens;
        return last;
    }
    
}