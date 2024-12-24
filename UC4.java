import java.util.Arrays;

public class UC4 <E>{
    E[] my_array;

    public UC4(E[] my_array){
        this.my_array = my_array;
    }

    public static <E> E sample_UC4(E[] my_array){
        Arrays.sort(my_array);
        return my_array[my_array.length - 1];
    }

    public static void main(String args[]){
        Integer[] a = {1, 3, 2, 8, 0, 5};
        Integer ans1 = sample_UC4(a);
        System.out.println("Maximum Integer : " + ans1);

        Float[] b = {12.8f, 13.5f, 2.5f};
        Float ans2 = sample_UC4(b);
        System.out.println("Maximum Float: " + ans2);

        String[] c = {"Apple", "Peach", "Banana"};
        String ans3 = sample_UC4(c);
        System.out.println("Maximum String: " + ans3);

    }
}
