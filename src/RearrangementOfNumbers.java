public class RearrangementOfNumbers {
    public static void main(String[] args) {
        System.out.println(rearrangmentOfBits(10));
    }

    public static int rearrangmentOfBits(int n){
        int minimumValue = 0;
        int currentPower = 0;
        while(n > 0){
            int rem = n % 2;
            if(rem == 1) minimumValue += (int)Math.pow(2,currentPower++);
            n = n/2;
        }
        return minimumValue;
    }
}
