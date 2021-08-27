public class bubblesort {
    void bubblesort(int arr[]){
        int n =  arr.length;
        for(int i =0;i < n-1;i++){
            for(int j=0;j<n-i-1;j++){     //  0 9 1 8 2 7  3 6 4 5 5 4
                if (arr[j]> arr[j+1]){   
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    void printarray(int arr[]){
        int n =  arr.length;
        for (int i =0;i<n;++i){
            System.out.print(arr[i] + " ");
        System.out.println();
        }
    }
    public static void main(String[] args) {
        bubblesort ob = new bubblesort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90,11,22,33};
        ob.bubblesort(arr);
        System.out.println("Sorted array");
        ob.printarray(arr);
    }
    
}
