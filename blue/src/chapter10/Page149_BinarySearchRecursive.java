package chapter10;

public class Page149_BinarySearchRecursive {
    public static void main(String[] argv) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0, right = array.length - 1;
        int element = 8;
        System.out.println("Finding element '" + element + "' - " + binarySearchRecursive(array, element, left, right));
        element = 1;
        System.out.println("Finding element '" + element + "' - " + binarySearchRecursive(array, element, left, right));
        element = 5;
        System.out.println("Finding element '" + element + "' - " + binarySearchRecursive(array, element, left, right));
        element = 10;
        System.out.println("Finding element '" + element + "' - " + binarySearchRecursive(array, element, left, right));
        element = 2;
        System.out.println("Finding element '" + element + "' - " + binarySearchRecursive(array, element, left, right));
        element = 0;
        System.out.println("Finding element '" + element + "' - " + binarySearchRecursive(array, element, left, right));
        element = 11;
        System.out.println("Finding element '" + element + "' - " + binarySearchRecursive(array, element, left, right));
    }

    private static String binarySearchRecursive(int[] array, int element, int left, int right) {
        if(left > right) {
            return "Not found!";
        }

        int mid = (left + right) / 2;
        if(element == array[mid]) {
            return "Element found!";
        } else if(element <= array[mid]) {
            return binarySearchRecursive(array, element, left, right - 1);
        } else  {
            return binarySearchRecursive(array, element, left + 1, right);
        }
    }
}
