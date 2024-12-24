public class Refactor_2 <E> {
    public E a;
    public E b;
    public E c;

    public Refactor_2(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static <E extends Comparable<E>> E max_ref2(E a, E b, E c){
        E max = a;
        if(b.compareTo(max) > 0)    max = b;
        if(c.compareTo(max) > 0)    max = c;

        return max;
    }


}
