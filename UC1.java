public class UC1 {
    public static Integer sample_max(Integer a, Integer b, Integer c){
        Integer max = a;
        if(b.compareTo(max) > 0)    max = b;
        if(c.compareTo(max) > 0)    max = c;

        return max;
    }
}
