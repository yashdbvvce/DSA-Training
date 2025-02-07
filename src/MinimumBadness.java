public class MinimumBadness {
    public static void main(String[] args) {
        minimumBadness(new StringBuilder("RWBWBWR"));
    }

    public static void minimumBadness(StringBuilder s){
        int badness = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'W'){
               if(i-1 >= 0) s.setCharAt(i,s.charAt(i-1));
               if(i-1 >= 0 && i+1 <= s.length()-1){
                   if(s.charAt(i-1) != s.charAt(i+1)) badness++;
               }
               else if(i+1 >=s.length()){
                   if(s.charAt(i-1) != s.charAt(i)){
                       badness++;
                   }
               }
               else if(i - 1 < 0){
                   if(s.charAt(i+1) != s.charAt(i)){
                       badness++;
                   }
               }
            }
        }
        System.out.println(s.toString());
        System.out.println(badness);
    }
}
