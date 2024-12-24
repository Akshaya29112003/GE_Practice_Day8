public class TC5 {
    public static void main(String args[]){
        Integer a[] = {2, 6, 1, 9, 3, 2, 6, 7, 8};
        Float b[] = {1.2f, 5.3f, 1.1f};
        String c[] = {"Apple", "Mango", "Banana"};

        UC5<Integer> ans1 = new UC5<>(a);
        ans1.testMaximum(a);

        UC5<Float> ans2 = new UC5<>(b);
        ans2.testMaximum(b);

        UC5<String> ans3 = new UC5<>(c);
        ans3.testMaximum(c);
    }
}
