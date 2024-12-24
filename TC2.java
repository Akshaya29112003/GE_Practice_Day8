public class TC2 {
    public static void main(String args[]) {
        Float ans = UC2.float_max(12.9f, 11.8f, 10.6f);
        System.out.println("Maximum value at Pos-1 : " + ans);
        assert ans.equals(12.9f) : "Test Case 2.1 Failed";

        Float ans1 = UC2.float_max(12.9f, 110.8f, 10.6f);
        System.out.println("Maximum value at Pos-2 : " + ans1);
        assert ans1.equals(110.8f) : "Test Case 2.2 Failed";

        Float ans2 = UC2.float_max(12.9f, 11.8f, 110.6f);
        System.out.println("Maximum value at Pos-3 : " + ans2);
        assert ans2.equals(110.6f) : "Test Case 2.3 Failed";
    }
}
