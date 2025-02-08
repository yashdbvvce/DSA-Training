import java.util.ArrayList;

public class CountedRepeatedStrings {
    public static void main(String[] args) {
        String s = "cat batman latt matter cat matter cat matter matter";
    }

    public static void getRepeatedWords(String s) {
        StringBuffer currString = new StringBuffer("");
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                currString.append(s.charAt(i));
            } else {
                if (s.substring(i, s.length()).contains(currString.toString())) {
                    if (!arr.contains(currString.toString())) {
                        arr.add(currString.toString());
                    }
                }
                currString = new StringBuffer("");

            }
        }
        System.out.println(arr);
    }
}