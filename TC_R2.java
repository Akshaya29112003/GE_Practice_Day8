public class TC_R2 {
    public static void main(String args[]){

        Integer ans1 = Refactor_2.max_ref2(10, 20, 30);
        System.out.println("Maximum Integer: " + ans1);
        assert ans1.equals(30) : "Test Case Failed for Integer";

        Float ans2 = Refactor_2.max_ref2(12.8f, 13.5f, 2.5f);
        System.out.println("Maximum Float: " + ans2);
        assert ans1.equals(13.5) : "Test Case Failed for Float";

        String ans3 = Refactor_2.max_ref2("Apple", "Peach", "Banana");
        System.out.println("Maximum String: " + ans3);
        assert ans3.equals("Peach") : "Test Case Failed for String";
    }
}
