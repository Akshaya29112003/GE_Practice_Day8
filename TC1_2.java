public class TC1_2 {
    public static void main(String args[]){
        Integer ans = UC1.sample_max(23, 67, 29);
        System.out.println("Maximum value at Pos-2 : "+ans);
        assert ans.equals(67) : "Test Case 1.2 Failed";
    }
}
