public class StringsExercises {

    public String scroll(String word) {
        String fin = new String();
        fin += ((word.substring(1)) + (word.charAt(0)));
        return fin;
    }

    public String convertName(String name) {
        String trimmed = new String();
        String fin = new String();
        trimmed = name.trim();
        fin += (trimmed.substring(0, trimmed.indexOf(",")));
        int spaces = trimmed.indexOf(" ");
        if (spaces == -1) {
            fin += trimmed.substring(1+(trimmed.indexOf(",")));
        }

        else {
            fin += trimmed.substring((spaces+1));
        }
        return fin; 
    }

    public static void main(String[] args) {
        StringsExercises se = new StringsExercises();
        System.out.println(se.scroll("Hello World"));
        System.out.println(se.scroll("happy"));
        System.out.println(se.scroll("h"));
        System.out.println(se.convertName(" Reubenstein, Lori Renee "));
        System.out.println(se.convertName("Biden,Joe"));
        System.out.println(se.convertName("the Clown, Bozo"));
    }

}