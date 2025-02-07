public class ProductIDs {
    public static void main(String[] args) {
        // Count the number of consonents in a given string (Both Upper case and Lower Case)
        System.out.println(getConsonents("a e i o u b y s a"));
    }

    public static int getConsonents(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i+=2){
            if(Character.toUpperCase(s.charAt(i)) != 'A' && Character.toUpperCase(s.charAt(i)) != 'E' && Character.toUpperCase(s.charAt(i)) != 'I' && Character.toUpperCase(s.charAt(i)) != 'O' && Character.toUpperCase(s.charAt(i)) != 'U'){
                count++;
            }
        }
        return count;
    }
}
