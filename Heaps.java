// this is a very rough implemetation of heap the theory of which i learnt from here https://www.youtube.com/watch?v=HqPJF2L5h9U.. the implementation may or may not be the exact which is supposed to be in industry this is just for my learning purpose.
public class Heaps {
    public static void main(String[] args) {
        int heapvalue[] = { 50, 30, 20, 15, 10, 8, 16 };
        for (int i = 0; i < heapvalue.length; i++) {
            System.out.printf("The element in original array is  %d\n ", heapvalue[i]);
        }

        // first we duplicate it
        int elementtoinsert = 60;
        int position = heapvalue.length;
        int[] newArray = new int[heapvalue.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = elementtoinsert;
            } else {
                newArray[i] = heapvalue[j++];
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("The element in new array is  %d\n ", newArray[i]);
        }

        // now what we want to do is basically for max heap condition keep checking it
        // with parent and swap it

        int i = newArray.length - 1;
        while (i > 0) {
            // int parent = i / 2;
            int parent = (i - 1) / 2;
            if (newArray[i] > newArray[parent]) {
                int temp=newArray[i];
                newArray[i]=newArray[parent];
                newArray[parent]=temp;
                i=parent;

               
            } else {
                break;
            }

        }

        for (int h = 0; h< newArray.length; h++) {
            System.out.printf("The new max heap is %d\n", newArray[h]);
        }
    }

}
