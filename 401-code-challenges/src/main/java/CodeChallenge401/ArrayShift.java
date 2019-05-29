/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CodeChallenge401;

public class ArrayShift {
    public int[] arrayShift(int[] inputArray, int numToInsert){

        int[] result = new int[inputArray.length + 1];
        int mid = (int) (inputArray.length / 2);

        if(inputArray.length == 0){
            return new int[]{numToInsert};
        }
        else if( inputArray.length == 1){
            result = new int[]{inputArray[0], numToInsert};
            return result;
        }

        for(int i = 0; i < result.length; i++){
            if(i < inputArray.length / 2){
                result[i] = inputArray[i];
            } else if (i == mid){
                result[mid] = numToInsert;
            } else {
                result[i] = inputArray[i - 1];
            }
        }
        return result;
    }
}