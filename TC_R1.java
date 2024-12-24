public class TC_R1 {
    public static void main(String args[]){
        Integer int_ans = Refactor_1.sample_ref1(20, 56, 17);
        System.out.println("Maximum Integer : "+int_ans);
        assert int_ans.equals(56) : "Test Case Failed for Integers";

        Float float_ans = Refactor_1.sample_ref1(120.5f, 320.5f, 220.5f);
        System.out.println("Maximum Float: " + float_ans);
        assert float_ans.equals(320.5f) : "Test Case Failed for Floats";

        // Test Case 3: Strings
        String string_ans = Refactor_1.sample_ref1("Apple", "Peach", "Banana");
        System.out.println("Maximum String: " + string_ans);
        assert string_ans.equals("Peach") : "Test Case Failed for Strings";
    }
}
