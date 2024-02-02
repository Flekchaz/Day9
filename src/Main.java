import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*

        int[] numbers = {5, 12, 8, 3, 10};


        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);


        int max = findMax(numbers);
        System.out.println("Maximum value: " + max);


        int min = findMin(numbers);
        System.out.println("Minimum value: " + min);


        reverseAndPrint(numbers);
    }


    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    private static void reverseAndPrint(int[] array) {
        System.out.print("Reversed array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        } */
//////////////////////////////////////////////////////////////////////////////////////////////////
        /*

                ArrayList<String> stringList = new ArrayList<>();
                stringList.add("Apple");
                stringList.add("Banana");
                stringList.add("Orange");
                stringList.add("Grapes");


                System.out.println("Initial ArrayList: " + stringList);


                stringList.add("Mango");
                System.out.println("ArrayList after adding 'Mango': " + stringList);


                stringList.remove("Banana");
                System.out.println("ArrayList after removing 'Banana': " + stringList);


                String searchElement = "Orange";
                System.out.println("'" + searchElement + "' exists in the ArrayList: " + stringList.contains(searchElement));


                System.out.println("Final ArrayList: " + stringList);

                */

            ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*

                Queue<Integer> myQueue = new LinkedList<>();


                myQueue.offer(1);
                myQueue.offer(2);
                myQueue.offer(3);


                System.out.println("Queue: " + myQueue);


                int dequeuedItem = myQueue.poll();
                System.out.println("Dequeued: " + dequeuedItem);
                System.out.println("Queue after dequeue: " + myQueue);


                int peekedItem = myQueue.peek();
                System.out.println("Peeked: " + peekedItem);


                System.out.println("Is Queue empty? " + myQueue.isEmpty());
                */
        //////////////////////////////////////////////////////////////////////////////////////////////
        /*

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("Original Linked List:");
        printList(linkedList);

        System.out.println("Length of the Linked List: " + linkedList.size());

        linkedList.remove(Integer.valueOf(2));

        System.out.println("Linked List after removing node with data 2:");
        printList(linkedList);

        Collections.reverse(linkedList);

        System.out.println("Reversed Linked List:");
        printList(linkedList);
    }

    private static void printList(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        */
        /*

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetElement = 5;

        int result = Arrays.binarySearch(sortedArray, targetElement);

        if (result >= 0) {
            System.out.println("Element " + targetElement + " is present at index " + result + ".");
        } else {
            System.out.println("Element " + targetElement + " is not present in the array.");
        }

         */

        int[][] matrix = {{3,5,6},{9,2,7},{1,4,8}};

        int [][] swappedMatrix = new int[matrix.length][matrix[0].length];

        System.out.println(Arrays.deepToString(matrix));

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                swappedMatrix [i][j]= matrix[j][i];
            }

        }System.out.println(Arrays.deepToString(swappedMatrix));
            }
        }


