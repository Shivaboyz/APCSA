public class MathEx{

    public static void main(String[] args){


        System.out.println(swap(49));
        System.out.println(swap(298));
        System.out.println(swap(17359));
        System.out.println(swap(1762));

        timeLeft(2,56,7,20);
        timeLeft(5,26,9,29);
        timeLeft(1,40,3,19);

        System.out.println(dayOfWeek(6,12));
        System.out.println(dayOfWeek(0,17));
        System.out.println(dayOfWeek(3,25));


    }

    public static int swap(int initial){

        int numbrrr= initial - (10*((initial%100)/10)) - (initial%10) + ((10*(initial%10)) + ((initial%100)/10)); 
        return numbrrr; 

    }
    

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){

        int totalTime = ((depHour*60) + depMin) - ((curHour*60) + curMin);
        System.out.println(totalTime/60 + " hours and " + totalTime%60 + " minutes.");

    }


    public static int dayOfWeek(int JanUno, int datee){

       int doww = ((JanUno - 1) + datee)%7;
       return doww;  

    }

}