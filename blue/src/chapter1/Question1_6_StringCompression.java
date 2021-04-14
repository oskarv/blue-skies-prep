package chapter1;

public class Question1_6_StringCompression {

    public static void main(String[] argv) {
        String input = "aabcccccaaa";
        System.out.println("Compressing '" + input + "' to -> " + compress(input));

        input = "abc";
        System.out.println("Compressing: '" + input + "' to -> " + compress(input));
    }

    private static String compress(String input) {
        char[] result = new char[input.length() * 2];
        int resultArrayIndex = 0;
        char currentChar = input.charAt(0);
        int sequenceLength = 1;
        for(int i = 1; i < input.length(); i++) {
            if(currentChar == input.charAt(i)) {
                sequenceLength++;
            } else {
                result[resultArrayIndex] = currentChar;
                resultArrayIndex++;
                result[resultArrayIndex] = (char) (sequenceLength + '0');
                sequenceLength = 1;
                resultArrayIndex++;
                currentChar = input.charAt(i);
            }
        }
        result[resultArrayIndex] = currentChar;
        resultArrayIndex++;
        result[resultArrayIndex] = (char) (sequenceLength + '0');
        String compressed = new String(result).trim().stripTrailing();
        return compressed.length() < input.length() ? compressed : input;
    }
}
