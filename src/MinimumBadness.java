public class MinimumBadness {
    public static void main(String[] args) {
        minimumBadness(new StringBuilder("WWB"));
    }

    public static void minimumBadness(StringBuilder s){
        int badness = 0;
        for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) == 'W'){
               if(s.charAt(i-1) != s.charAt(i+1)){
                   s.setCharAt(i,s.charAt(i-1));
               }
           }
        }
        System.out.println(s.toString());
        System.out.println(badness);
    }
}
