
public class TC1_1 {
    public static void main(String args[]){
        Integer ans = UC1.sample_max(120, 53, 47);
        System.out.println("Maximum value at Pos-1 : "+ ans);
        assert ans.equals(120) : "Test Case 1.1 Failed";
    }
}
