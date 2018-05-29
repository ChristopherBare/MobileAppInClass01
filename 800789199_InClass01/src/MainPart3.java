import java.util.HashSet;

/*
In Class Assinment 1
MainPart1.java
Christopher Bare
800789199
*/
public class MainPart3 {
    /*
     * Question 3:
     * - This is a simple programming question that focuses on finding the
     * longest increasing subarray. Given the array A = {1,2,3,2,5,2,4,6,7} the
     * longest increasing subarray is {2,4,6,7}, note that the values have to be
     * contiguous.
     * */

    public static void main(String[] args) {
        //example call
        //int[] input = {}; // output {}
        //int[] input = {1}; // output {1}
        //int[] input = {1,2,3,4}; // output {1,2,3,4}
        //int[] input = {1,2,3,4,4,4,4,4,5,6}; // output {1,2,3,4}
        //int[] input = {1,2,3,-1,4,5,8,20,25,1,1,4,6}; // output {-1,4,5,8,20,25}
        //int[] input = {1,2,3,1,1,1,2,3,4,1,1,2,4,6,7}; // output{1,2,4,6,7}
        int[] input = {1, 2, 3, 2, 5, 2, 4, 6, 7}; // output {2,4,6,7}
        int[] result = printLongestSequence(input);

        for (int i : result) {
            if(i == result[result.length-1])
                System.out.print(i);
            else {
                System.out.print(i + ", ");
            }
        }
    }

    public static int[] printLongestSequence(int[] input) {
        int[] result = {};

        int max = 1, len = 1, maxIndex = 0;

        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1])
                len++;
            else {
                if (max < len) {
                    max = len;
                    maxIndex = i - max;
                }
                len = 1;
            }
        }

        if (max < len) {
            max = len;
            maxIndex = input.length - max;
        }

        result = new int[max];
        int count = 0;

        for (int i = maxIndex; i < max + maxIndex; i++) {
           result[count++] = input[i];
        }
        return result;
    }
}

