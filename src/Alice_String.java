public class Alice_String {
    public static void main(String[] args) {
        System.out.println(LongestString(".........."));
        // Eg abc.a.b -> 3 (Max length without interuption is 3 i.e abc)
    }

    public static int LongestString(String s){
        int max = Integer.MIN_VALUE;
        int currLength = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '.'){
                currLength++;
                max = Math.max(max,currLength);
            }
            else if(s.charAt(i) == '.'){
                currLength = 0;
            }
        }
        return Math.max(max,0);
    }
}
