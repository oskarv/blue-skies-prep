package ms_oa;

public class MinAdjSwapsToMakePalindrome {
    public static void main(String[] argv) {
        String input = "mamad";
        System.out.println(input + ": " + findMinimumSwaps(input));
        input = "asflkj";
        System.out.println(input + ": " + findMinimumSwaps(input));
        input = "aabb";
        System.out.println(input + ": " + findMinimumSwaps(input));
        input = "ntiin";
        System.out.println(input + ": " + findMinimumSwaps(input));
        input = "aabcb";
        System.out.println(input + ": " + findMinimumSwaps(input));
    }

    private static int findMinimumSwaps(String input) {
        int result = 0;
        char[] inputArray = input.toCharArray();
        int leftIndex = 0;
        int rightIndex = inputArray.length - 1;
        boolean firstNotFound = false;

        while(leftIndex <= rightIndex) {
            char left = inputArray[leftIndex];
            char right = inputArray[rightIndex];
            if(left == right) {
                leftIndex++;
                rightIndex--;
                continue;
            }

            int currentIndex = findChar(left, inputArray, leftIndex, rightIndex);
            if(currentIndex == -1) {
                if(firstNotFound) {
                    return -1;
                }
                result += (inputArray.length / 2) - leftIndex;
                adjacentSwap(inputArray, inputArray.length / 2, leftIndex);
                leftIndex++;
                rightIndex--;
                firstNotFound = true;
                continue;
            }
            result += rightIndex - currentIndex;
            adjacentSwap(inputArray, rightIndex, currentIndex);
            leftIndex++;
            rightIndex--;
        }
        return result;
    }

    private static void adjacentSwap(char[] inputArray, int rightIndex, int currentIndex) {
        char temp = inputArray[currentIndex];
        for(int i = currentIndex; i < rightIndex; i++) {
            inputArray[i] = inputArray[i + 1];
        }
        inputArray[rightIndex] = temp;
    }

    private static int findChar(char left, char[] inputArray, int leftIndex, int rightIndex) {
        for(int i = rightIndex - 1; i > leftIndex; i--) {
            if(inputArray[i] == left) {
                return i;
            }
        }
        return -1;
    }
}
