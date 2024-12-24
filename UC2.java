public class UC2 {
    public static Float float_max(Float a, Float b, Float c){
        Float max = a;
        if(b.compareTo(max) > 0)    max = b;
        if(c.compareTo(max) > 0)    max = c;
        return max;
    }
}
