public class ChasePrep {


    public static void main(String[] args) {
      int[] array = new int[] {1, 1, 1, 2, 2, 2, 3, 3, 3}; //9
      int[] array2 = new int[] {1, 1, 1, 2, 2, 2, 12, 12, 23}; //24
      int[] array3 = new int[] {1}; //1
      int[] array4 = new int[] {1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1000}; //1000


        System.out.println(findLargestSum(array4));
    }

    private static String helloWorld() {
        String string = "Hello World!";
        return string;
    }

    /**  given an array of numbers find the largest sum of continuous numbers.
     * */
    private static int findLargestSum(int[] array) {
        int length = array.length;
        int largestSum = 0;
        int currentSum = 0;
        //loop through the array, check if the previous number is the same as the current number
        for (int i = 0; i <= length - 1; i++) {
            if (length == 1) {
                largestSum = array[i];
                break;
            }
            //if i == 0, add that number to the largestSum
            if (i == 0) {
                currentSum = array[i];
                //check if we are at the end of the array
            } else if (i == length - 1) {
                if (array[i] == array[i - 1]) {
                    currentSum += array[i];
                }
                if (currentSum > largestSum) {
                    largestSum = currentSum;
                }
            } else if (array[i] == array[i - 1]) { //if i - 1 is the same as i, add that number to the largestSum
                currentSum += array[i];
            } else { //if they are NOT the same
                //if currentSum is greater than largestSum, make largestSum currentSum
                if (currentSum > largestSum) {
                    largestSum = currentSum;
                }
                //make currentSum equal to the currentNumber
                currentSum = array[i];
            }
        }
        return largestSum;
    }

}
