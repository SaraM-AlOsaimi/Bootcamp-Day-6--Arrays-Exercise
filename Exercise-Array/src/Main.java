import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /*1.Write a Java program to test if the first and the last element of an array of
integers are same. The length of the array must be greater than or equal to 2 */

//        int[] array = { 50, -20, 0, 30, 40, 60, 50};
//
//        int first = array[0];
//        int last = array[array.length-1];
//
//        boolean result = false ;
//        if (array.length > 2 && first == last){
//            result = true;
//            System.out.println(result);
//        } else System.out.println(result);

//-------------------------------------------------------------------------------------------
       /* 2.Write a Java program to find the numbers greater than the average of the
        numbers of a given array.*/
//
//        int [] findGreater = {1, 4, 17, 7, 25, 3, 100};
//
//        int sum = 0;
//
//        for (int num : findGreater) {
//            sum += num;
//        }
//        double average = sum/findGreater.length;
//
//        System.out.println("The Average : "+ average);
//
//        System.out.println("The numbers in the said array that are greater than the average are:" );
//        for(int l :findGreater){
//            if(l>average){
//                System.out.println(l);
//            }
//        }


//-------------------------------------------------------------------------------------------
        /*3.Write a Java program to get the larger value between first and last
element of an array of integers.*/
//        ArrayList<Integer> larger = new ArrayList<>();
//
//        larger.add(20);
//        larger.add(30);
//        larger.add(40);
//
//        System.out.println("ArrayList: " + larger);
//
//        int first = larger.get(0);
//        int last = larger.get(larger.size() - 1);
//
//        if(first > last){
//            System.out.println("Larger value between first and last element: " + first);
//        } else System.out.println("Larger value between first and last element: " + last);


//-------------------------------------------------------------------------------------------
       /* 4.Write a Java program to swap the first and last elements of an array and
        create a new array.*/
// Original Array:
//[20, 30, 40]
//Sample Output:
//New array after swapping the first and last elements: [40, 30, 20]

        int [] numbers = {20,30,40};

        System.out.println("Before Swapping : " + Arrays.toString(numbers));

        int sw = numbers[0];
        numbers[0] = numbers[numbers.length-1];
        numbers[numbers.length-1] = sw;

        int[] afterSwap = new int[numbers.length];

        afterSwap[0] = sw;
        afterSwap[afterSwap.length - 1] = numbers[0];

         System.arraycopy(numbers, 1, afterSwap, 1, numbers.length - 2);
        System.out.println("New Array after Swapping: " + Arrays.toString(afterSwap));

//-------------------------------------------------------------------------------------------
        /* 5.Write a program that places the odd elements of an array before the
even elements.*/

//        int[] arrayOdd = {2,3,40,1,5,9,4,10,7} ;
//
//        int[] result = new int[arrayOdd.length];
//
//        int i = 0;
//
//        for (int n : arrayOdd) {
//            if (n % 2 != 0) {
//                result[i++] = n;
//            }
//        }
//        for (int n : arrayOdd) {
//            if (n % 2 == 0) {
//                result[i++] = n;
//            }
//        }
//        System.out.println("Array with odd elements before even elements: " + Arrays.toString(result));

//-------------------------------------------------------------------------------------------
       /* 6. Write a program that test the equality of two arrays.*/

//        int[] arr1 = {2,3,6,6,4};
//        int[] arr2 = {2,3,6,6,4};
//
//        boolean equality = true;
//
//        if(arr1.length != arr2.length) {
//            equality = false;
//        } else {
//            for (int i = 0; i < arr1.length; i++) {
//                if (arr1[i] != arr2[i]) {
//                    equality = false;
//                    break;
//                }
//            }
//        }
//        System.out.println("Arrays are equal: " + equality);


    }
}