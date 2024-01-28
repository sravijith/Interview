package coding.excercises.java.algorithms;

/*
 * Selection sort involves two things. One is the SELECTION – selecting the lowest (or highest) element
 * and another one is the PLACEMENT – placing the element selected in the first step in an appropriate position.
 * Selection sort first selects the lowest (or highest) element and exchanges it with the element in the first position.
 * Then, again selects lowest (or highest) element in the remaining elements i.e in the elements between inputArray[1]
 * and inputArray[n-1] and exchanges it with the element in the second position. This selection and placement
 * is continued until all the elements are in the sorted order.
 *
 */
public class SelectionSortInJava {

    public static void main(String[] args) {
        selectionSort(new int[]{45, 84, 101, 62, 12, 45});

        selectionSort(new int[]{62, -45, 14, 8, -52, 45});

        selectionSort(new int[]{21, 12, 56, -48, 15, 45});
    }

    static void selectionSort(int[] inputArray) {
        int temp, pos;

        for (int i = 0; i < inputArray.length - 1; i++) {
            pos = i;

            //finding the position of smallest element between (i+1)th element and last element

            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[pos]) {
                    pos = j;
                }
            }

            //Swapping inputArray[i] and inputArray[pos]

            temp = inputArray[i];

            inputArray[i] = inputArray[pos];

            inputArray[pos] = temp;
        }

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }

        System.out.println();
    }

}
