public class Quick_Sort {
    static int[] myArray = {5,7,4,5,2,9,0,1,3};
    static int[] quickSort(int[] myArray, int low, int hight ){

        if(low < hight){
            int left = low;
            int right = hight - 1;
            int middle = low + (hight - low)/2;
            while (left <= right){
                while (myArray[left] < myArray[middle]){
                    left++;
                }
                while (myArray[right] > myArray[middle]){
                    right--;
                }
                if(left <= right){
                    int token = myArray[left];
                    myArray[left] = myArray[right];
                    myArray[right] = token;
                    left++;
                    right--;
                }
            }
            if(low < right){
                quickSort(myArray, low, right);
            }
            if (hight > left){
                quickSort(myArray, left, hight);
            }
        }

        return myArray;
    }
    static void swap (int element1, int element2){
        int token = element1;
        element1 = element2;
        element2 = token;
    }
    static void print(int[] myArray){
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] myNewArray = quickSort(myArray, 0, myArray.length);
        print(myNewArray);
    }
}
