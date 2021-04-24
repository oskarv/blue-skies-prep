package ms_oa;

import java.util.Arrays;

public class SignOfTheProductOfAnArray_1822 {
    public static void main(String[] argv) {
        SignOfTheProductOfAnArray_1822 solution = new SignOfTheProductOfAnArray_1822();
        int[] array = new int[] { -1,-2,-3,-4,3,2,1 };
        System.out.println(Arrays.toString(array) + " - Sign is: " + solution.arraySign(array));
        array = new int[] { 1,5,0,2,-3 };
        System.out.println(Arrays.toString(array) + " - Sign is: " + solution.arraySign(array));
        array = new int[] { -1,1,-1,1,-1 };
        System.out.println(Arrays.toString(array) + " - Sign is: " + solution.arraySign(array));
    }

    public int arraySign(int[] nums) {
        int numOfNegatives = 0;
        for(Integer element : nums) {
            if(element == 0) {
                return 0;
            }
            if(element < 0) {
                numOfNegatives++;
            }
        }
        return (numOfNegatives % 2 == 0) ? 1 : -1;
    }
}
