/*
     Number - Binary Representation - Convert (1-2) & (0-1) - Sum of the number
*/


public class MagicalNumbers {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        for(int i  =1; i <=n; i++){
            if(getMagicalNumberForN(i) % 2  != 0){
                count++;
            }
        }
        System.out.println(count);
    }

    public static int getMagicalNumberForN(int n){
        StringBuffer binaryFormat = new StringBuffer(decimalToBinary(Integer.toString(n,10)));
        int magicNumber = 0;
        char []requiredChars = binaryFormat.toString().toCharArray();
        for(char c: requiredChars){
            int numericValue = Character.getNumericValue(c);
            if(numericValue == 1) {
                magicNumber += 2;
            }
            else{
                magicNumber+=1;
            }
        }
        return magicNumber;
    }
    public static String decimalToBinary(String s){
        int number = Integer.valueOf(s);
        String binaryNumber = "";
        while(number > 0){
            int rem = number % 10;
            rem = rem % 2;
            binaryNumber = binaryNumber + Character.forDigit(rem,10);
            number = number / 2;
        }
        return new StringBuilder(binaryNumber).reverse().toString();
    }
}
