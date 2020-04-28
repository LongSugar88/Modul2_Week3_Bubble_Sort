public class Bubble_Sort<T extends Comparable> {
    int count = 1;

    T[] sort(T[] myArray){
        boolean check = true;
        for(int i=1; i< myArray.length && check; i++){
            check = false;
            for(int j=0; j<myArray.length-i; j++){
                if( myArray[j].compareTo(myArray[j+1]) < 0){
                    T token = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = token;
                    check = true;
                }
            }
            print(myArray);
        }
        return myArray;
    }
    void print(T[] myArray){
        System.out.println("Lần " + count);
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        count++;

    }
}
