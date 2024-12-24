public class Refactor_1{

    public static <E extends Comparable<E>> E sample_ref1(E a, E b, E c){
        E max = a;
        if(b.compareTo(max) > 0)    max = b;
        if(c.compareTo(max) > 0)    max = c;

        return max;
    }
}
