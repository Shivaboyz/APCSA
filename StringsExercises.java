public class StringsExercises {

    public String scroll(String word) {
        String fin = ((word.substring(1)) + (word.charAt(0)));
        return fin;
    }

    public String convertName(String name) {
        String ln = name.substring(0, name.indexOf(","));
        String fn = name.substring(1+name.indexOf(","));
        fn = fn.trim();
        ln = ln.trim();
        return (fn + " " + ln);
    }

    public String negative(String num) {
        String fin = num; 
        fin = fin.replace("1","2");
        fin = fin.replace("0", "1");
        fin = fin.replace("2", "0");
        return fin; 
    }

    public String dateString(String dateStr) {
        String mon = dateStr.substring(0,2);
        String day = dateStr.substring(3,5);
        String year = dateStr.substring(6);
        return (day + "-" + mon + "-" + year);
    }

    public String dateString2(String date2) {
        int firstSlash = date2.indexOf("/");
        int secondSlash = date2.lastIndexOf("/");
        String fin = ((date2.substring(0,firstSlash)) + "-" + (date2.substring(1+firstSlash, secondSlash)) + "-" + (date2.substring(1+secondSlash)));
        return fin; 
    }

    public boolean startsWith(String word, String prefix) {
        int prefixLength = prefix.length();
        if (word.length() <= prefixLength) return false; 
        String wordPrefix = word.substring(0, (prefixLength));
        if (prefix.equals(wordPrefix)) return true;
        else return false;
    }

    public boolean endsWith(String word, String suffix) {
        int suffixLength = suffix.length();
        if (word.length() <= suffixLength) return false;
        String wordSuffix = word.substring(word.length() - suffixLength);
        if (suffix.equals(wordSuffix)) return true;
        else return false;
    }

    public String removeTag(String s, String tag) {
        //String innerTag = tag.substring(tag.indexOf("<"), tag.indexOf(">"));
        String firstTag = s.substring(s.indexOf("<"), s.indexOf(">"));
        if (firstTag.equals(tag)) return s.substring(s.indexOf(">"), s.lastIndexOf("<"));
        else return s; 
    }

    public static void main(String[] args) {
        StringsExercises se = new StringsExercises();

        System.out.println(se.scroll("Hello World"));
        System.out.println(se.scroll("happy"));
        System.out.println(se.scroll("h"));
    
        System.out.println(se.convertName(" Reubenstein, Lori Renee  	"));
        System.out.println(se.convertName("Biden,Joe"));
        System.out.println(se.convertName("the Clown, Bozo"));
    
        System.out.println(se.negative("0010111001"));
        System.out.println(se.negative("11111111"));
    
        System.out.println("04/20/2014 becomes " + se.dateString("04/20/2014"));
        System.out.println("04/20/2014 becomes " + se.dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + se.dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + se.dateString2("04/2/2014"));
        System.out.println("4/2/2024 becomes " + se.dateString2("4/2/2024"));
    
        System.out.println("\nstartsWith");
        System.out.println(se.startsWith("architecture", "arch"));
        System.out.println(se.startsWith("architecture", "a"));
        System.out.println(se.startsWith("arch", "architecture"));
        System.out.println(se.startsWith("architecture", "rch"));
        System.out.println(se.startsWith("architecture", "architecture"));
    
        System.out.println("\nendsWith");
        System.out.println(se.endsWith("astronomy", "nomy"));
        System.out.println(se.endsWith("astronomy", "y"));
        System.out.println(se.endsWith("astronomy", "nom"));
        System.out.println(se.endsWith("nomy", "astronomy"));
        System.out.println(se.endsWith("astronomy", "astronomy"));
    
        System.out.println("\nremoveTag");
        System.out.println(se.removeTag("<b>Hello World</b>", "b"));
        System.out.println(se.removeTag("<b>Hello World</b>", "head"));
        System.out.println(se.removeTag("Hello World</b>", "b"));
        System.out.println(se.removeTag("<b>Hello World", "b"));
        System.out.println(se.removeTag("</img>Hello World<img>", "img"));
        System.out.println(se.removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(se.removeTag("<title>Hello World</title> Happy Birthday", "title"));
        System.out.println(se.removeTag("Happy <b>Hello World</b> Birthday", "b"));
        
    }

}