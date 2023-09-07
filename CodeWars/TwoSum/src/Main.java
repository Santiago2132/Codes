/* Two Sum

Write a function that takes an array of numbers (integers for the tests) and a target number.
It should find two different items in the array that, when added together, give the target value.
The indices of these items should then be returned in a tuple / list (depending on your language) like so: (index1, index2).

For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

The input will always be valid (numbers will be an array of length 2 or greater,
and all of the items will be numbers; target will always be the sum of two different items from that array).

Based on: http://oj.leetcode.com/problems/two-sum/

two_sum([1, 2, 3], 4) == {0, 2}

 */

public class Main {

    public static int[] twoSum(int[]  vector, int num){
        int[] nums = new int[vector.length];
        for(int i = 0; i < vector.length; i++){
            if(vector[i]<num){
                nums[i] = vector[i];
            }
        }
        for(int i = 0; i<nums.length;i++){
            int numtoSum = nums[i];
            for(int j=0; j < nums.length; j++ ){
                if((numtoSum + nums[j]) == num){
                    System.out.println("Se realizo la suma,\n "+numtoSum+","+nums[j]);
                    int[] result = {numtoSum,nums[j]};
                    return result;
                }
            }
        }
        System.out.println("No se realizo la suma");
        return null;
    }
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9};
        int numeroToSum = 9;
        twoSum(numeros,numeroToSum);
    }
}