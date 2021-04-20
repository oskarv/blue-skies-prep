package chapter10;

public class Page149_BinarySearch {
    public static void main(String[] argv) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 8;
        System.out.println("Finding element '" + element + "' - " + binarySearch(array, element));
        element = 1;
        System.out.println("Finding element '" + element + "' - " + binarySearch(array, element));
        element = 5;
        System.out.println("Finding element '" + element + "' - " + binarySearch(array, element));
        element = 10;
        System.out.println("Finding element '" + element + "' - " + binarySearch(array, element));
        element = 2;
        System.out.println("Finding element '" + element + "' - " + binarySearch(array, element));
        element = 0;
        System.out.println("Finding element '" + element + "' - " + binarySearch(array, element));
        element = 11;
        System.out.println("Finding element '" + element + "' - " + binarySearch(array, element));
    }

    private static String binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;
        int mid;

        while(left <= right) {
            mid = (left + right) / 2;
            if(array[mid] == element) {
                return "Element found!";
            } else if(element > array[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return "Not found!";
    }
}
