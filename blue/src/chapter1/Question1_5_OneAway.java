package chapter1;

public class Question1_5_OneAway {

    public static void main(String[] argv) {
        String input1 = "pale";
        String input2 = "ple";
        System.out.println("One away: { " + input1 + ", " + input2 + " } -> " + isOneOperationAway(input1, input2));

        input1 = "pales";
        input2 = "pale";
        System.out.println("One away: { " + input1 + ", " + input2 + " } -> " + isOneOperationAway(input1, input2));

        input1 = "pale";
        input2 = "bale";
        System.out.println("One away: { " + input1 + ", " + input2 + " } -> " + isOneOperationAway(input1, input2));

        input1 = "pale";
        input2 = "bake";
        System.out.println("One away: { " + input1 + ", " + input2 + " } -> " + isOneOperationAway(input1, input2));
    }

    private static boolean isOneOperationAway(String input1, String input2) {
        if(input1.equals(input2)) {
            return true;
        }

        if(input2.length() > input1.length() + 1 || input2.length() < input1.length() - 1) {
            return false;
        }

        int input2Index = 0;
        int numOfMutations = 0;
        for(Character character : input1.toCharArray()) {
            if (character.equals(input2.charAt(input2Index < input2.length() ? input2Index : input2.length() - 1))) {
                input2Index++;
            } else {
                numOfMutations++;
                if(input1.length() == input2.length()) {
                    input2Index++;
                }
            }
        }

        return numOfMutations <= 1;
    }

}
