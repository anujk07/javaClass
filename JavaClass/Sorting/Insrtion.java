public class Insrtion {
    public static void main(String args[]) {

        int arr[] = {1, 7, 9, 5, 8, 2};

        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int j = i-1;

            while(j>=0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        for(int i: arr){
            System.out.print(i+" ");
        } 
}
}
