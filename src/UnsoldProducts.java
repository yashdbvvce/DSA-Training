import java.util.ArrayList;

public class UnsoldProducts {
    public static void main(String[] args) {
        int arr[] = {5, 2, 0, 8, 0};
        getUnSoldProducts(arr);
    }

    public static void getUnSoldProducts(int arr[]) {
        ArrayList<Integer> newList = new ArrayList<>();
        int nonIntegerIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) newList.add(nonIntegerIndex++, arr[i]);
            else newList.add(newList.size(), arr[i]);
        }
        System.out.print(newList);
    }
}
