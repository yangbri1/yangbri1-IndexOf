
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
        // for(int i = 0; i < arr.length; ++i){
        //     // if given int 'n' is found within 'arr'
        //     if(arr[i] == n){
        //         // return the index (& exit out of loop -- ends function)
        //         return i;
        //     }
        // }
        // // otherwise return -1
        // return -1;

        // declare empty String to later append values of 'arr' in String format
        String emptyStr = "";

        // initialize i to be iterator for loop below
        int i = 0;
        // iterate through given array of int 'arr'
        while(i < arr.length){
            // https://www.geeksforgeeks.org/different-ways-for-integer-to-string-conversions-in-java/
            // used Java.util package built-in String.valueOf() method to type-cast from int to String
            // alternative: use wrapper class Integer.toString() method
            emptyStr += String.valueOf(arr[i]);
            // increment by 1
            ++i;
        }
        // type-cast int 'n' to String type as .indexOf() parameter does NOT take in int type for comparison itself
        String nStr = Integer.toString(n);
        // employ built-in String.indexOf() method to index of first instance where given  
        return(emptyStr.indexOf(nStr));

    }
}
