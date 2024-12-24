public class UC3 {
    public static String string_max(String a, String b, String c){
        String max = a;
        if(b.compareTo(max) > 0)    max = b;
        if(c.compareTo(max) > 0)    max = c;

        return max;
    }
}
