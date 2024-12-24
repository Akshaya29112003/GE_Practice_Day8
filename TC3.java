public class TC3 {
    public static void main(String args[]){
        String ans = UC3.string_max("Apple", "Peach", "Banana");
        System.out.println("Maximum value at Pos-2 : "+ans);
        assert ans.equals("Peach") : "Test Case 3.2 Failed";
    }
}
