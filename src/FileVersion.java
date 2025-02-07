public class FileVersion {
    public static void main(String[] args) {
        String arr[] = {"file_1","file_3","file_22"};
        System.out.println(getLatestFile(arr));
    }
    // Get the latest file
    public static int getLatestFile(String arr[]){
        int LatestFile = -1;
        for(String s : arr){
            LatestFile = Math.max(Integer.valueOf(s.substring(5,s.length())),LatestFile);
        }
        return LatestFile;
    }
}
