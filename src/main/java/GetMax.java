public class GetMax {
    /**
     * This method returns the max value of arr (the largest int).
     * This problem requires using a for loop.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        // Initialize the max value as the first element of the array
        int maxValue = arr[0];
        
        // Loop through the array to find the maximum value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        
        return maxValue;
    }
}
