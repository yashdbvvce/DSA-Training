public class LCS_Longest_Comman_Sequence {
    public static void main(String[] args) {
        // Initiaze a matrix with len of strings
        System.out.println(longestCommonWithThree("abcd","acd","bcd"));
        System.out.println(getLargestCommonForTwo("abcde","abcde"));
        System.out.println(getLargestCommonForThree("abcdf","ae","acd"));
    }

    public static int longestCommonSequence(String s1, String s2){
        int arr[][] = new int[s1.length()][s2.length()];
        for(int i = 1; i < s1.length(); i++){
            for(int j  = 1; j < s2.length(); j++){
                // Match
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1] + 1;
                }

                // Mismtach Case
                else{
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        return 1+arr[s1.length()-1][s2.length()-1];
    }

    public static int longestCommonWithThree(String s1, String s2, String s3){
        int arr[][][] = new int[s1.length()][s2.length()][s3.length()];
        for(int i = 1; i < s1.length(); i++){
            for(int j  = 1; j < s2.length(); j++){
               for(int k = 1; k < s3.length(); k++){
                   if(s1.charAt(i-1) == s2.charAt(j-1) && s2.charAt(j-1) == s3.charAt(k-1)){
                       arr[i][j][k] = arr[i-1][j-1][k-1] + 1;
                   }
                   else{
                       arr[i][j][k] = Math.max(arr[i-1][j][k],Math.max(arr[i][j-1][k],arr[i][j][k-1]));
                   }
               }
            }
        }
        return 1+arr[s1.length()-1][s2.length()-1][s3.length()-1];
    }
    // My Approach
    public static int getLargestCommonForTwo(String s1, String s2){
        int maxLength = 0;
        for(int i = 0; i < s1.length(); i++){
            StringBuffer sb = new StringBuffer();
            for(int j = i; j < s1.length(); j++){
                sb.append(s1.charAt(j));
                if(s2.contains(sb.toString())){
                    maxLength = Math.max(sb.length(),maxLength);
                }
            }
        }
        return maxLength;
    }
    // My Approch
    public static int getLargestCommonForThree(String s1, String s2, String s3){
        int maxLength = 0;
        for(int i = 0; i < s1.length(); i++){
            StringBuffer sb = new StringBuffer();
            for(int j = i; j < s1.length(); j++){
                sb.append(s1.charAt(j));
                if(s2.contains(sb.toString()) && s3.contains(sb.toString())){
                    maxLength = Math.max(maxLength,sb.length());
                }
            }
        }
        return maxLength;
    }
}
