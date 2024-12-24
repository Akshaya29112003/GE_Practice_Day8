import java.util.Arrays;

public class UC5 <E extends Comparable<E>>{
    E[] my_array;
    public UC5(E[] my_array){
        this.my_array = my_array;
    }

    public void testMaximum(E[] my_array){
        printMax(my_array);
    }
    public static <E extends Comparable<E>> void printMax(E[] my_array){
        Arrays.sort(my_array);
        System.out.println("Maximum : " + my_array[my_array.length - 1]);
    }
}
