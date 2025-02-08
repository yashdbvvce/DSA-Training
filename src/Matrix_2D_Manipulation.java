import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Matrix_2D_Manipulation {
    public static void main(String[] args) {
        int n = 3;
        int arr[][] = new int[n][n];
        firstStep(arr,n);
    }

    public static void firstStep(int arr[][], int n){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j){
                    arr[i][j] = getDiagnolElement(arr,i,j);
                }
                else{
                    arr[i][j] = getNonDiagnolElement(arr,i,j,n);
                }
            }
        }
        secondStep(arr,deepCopyArr(arr));
    }

    public static int[][] deepCopyArr(int arr[][]){
        int newArr[][] = new int[arr.length][arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                newArr[i][j] = arr[i][j];
            }
        }
        return  newArr;
    }

    public static void secondStep(int arr[][], int clonedArr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == 0 || j ==0){
                    arr[i][j] = clonedArr[i][j] * 2;
                }
                else{
                    arr[i][j] = clonedArr[i][j] + clonedArr[i-1][j-1];
                }
            }
        }
        printArr(arr);
    }

    public static int getDiagnolElement(int arr[][], int i, int j){
        int diagnolElement = (int)Math.pow((i*j+2),2);
        return diagnolElement;
    }


    public static int getNonDiagnolElement(int arr[][], int i, int j, int n){
       int iCalculation = 1;
       int jCalculation = 1;
       for(int k = 1; k <= n; k++){
           if(i+k <= n){
               iCalculation *= (i+k);
           }
       }
        for(int k = 1; k <= n; k++){
            if(j + k <=n){
                jCalculation *= (j+k);
            }
        }
        return jCalculation + iCalculation;
    }

    public static void printArr(int arr[][]){
        for(int i = 0;i < arr.length; i++){
            for(int j  = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
