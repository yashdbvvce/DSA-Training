import java.nio.charset.CharsetEncoder;
import java.sql.SQLSyntaxErrorException;

public class DecimalToBinary {
    public static void main(String[] args) {
        decimalToBinary("1");
        recursiveDecimalToBinary(1);
    }

    public static void decimalToBinary(String s){
        int number = Integer.valueOf(s);
        String binaryNumber = "";
        while(number > 0){
            int rem = number % 10;
            rem = rem % 2;
            binaryNumber = binaryNumber + Character.forDigit(rem,10);
            number = number / 2;
        }
        System.out.println(new StringBuilder(binaryNumber).reverse().toString());
    }

    public static void recursiveDecimalToBinary(int n){
        if(n == 0){
            return;
        }
        recursiveDecimalToBinary(n/2);
        System.out.print(n%2);
    }
}
