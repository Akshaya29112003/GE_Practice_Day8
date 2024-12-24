public class TC1_3 {
    public static void main(String args[]) {
        Integer ans = UC1.sample_max(56, 98, 156);
        System.out.println("Maximum value at Pos-3 : " + ans);
        assert ans.equals(156) : "Test Case 1.3 Failed";
    }
}
