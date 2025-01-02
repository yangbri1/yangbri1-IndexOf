
//

public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. if n does not exist in arr, return -1.
     */
    public int getIndex(int[] arr, int n){
        // iterate through given array of int 'arr'
        for(int i = 0; i < arr.length; ++i){
            // if given int 'n' is found within 'arr'
            if(arr[i] == n){
                // return the index (& exit out of loop -- ends function)
                return i;
            }
        }
        // otherwise return -1
        return -1;
    }
}
