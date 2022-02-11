package SelectionSort;

public class SelectionSort {
    int arr[];
    int size;
    SelectionSort(int size,int[] arr){
        this.arr = new int[size];
        this.arr = arr;
    }
    void sort(){
        for(int i = 0; i< arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

    }

    void display(){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {11,2,12,5,1,6};
        SelectionSort selectionSort = new SelectionSort(arr.length, arr);
        System.out.println("Before sorting");
        selectionSort.display();
        System.out.println("After sorting");
        selectionSort.sort();
        selectionSort.display();
    }
}
