public class Count_Of_Trailing_zeros_in_fact_Value {
    public static void main(String[] args) {
        // 5 -> 1
        // 10 -> 2
        // 15 -> 3
        // 20 -> 4
        trailingZeros(150);
    }

    public static void trailingZeros(int n){
        int power = 5;
        int zeros = 0;
        while(power <= n){
            zeros  += n / power;
            power = power * 5;
        }
        System.out.println("No of zeros = "+zeros);
    }
}
