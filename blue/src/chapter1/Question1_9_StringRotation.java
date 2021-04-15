package chapter1;

public class Question1_9_StringRotation {
    public static void main(String[] argv) {
        String input = "waterbottle";
        String possibleRotation = "erbottlewat";
        System.out.println("Is '" + possibleRotation + "' rotation of '" + input +"' -> " + isRotation(input, possibleRotation));
        possibleRotation = "erbottlewa";
        System.out.println("Is '" + possibleRotation + "' rotation of '" + input +"' -> " + isRotation(input, possibleRotation));
        possibleRotation = "waterbottla";
        System.out.println("Is '" + possibleRotation + "' rotation of '" + input +"' -> " + isRotation(input, possibleRotation));
    }

    private static boolean isRotation(String input, String possibleRotation) {
        if(input.length() != possibleRotation.length() && !input.isEmpty()) {
            return false;
        }
        return (input + input).contains(possibleRotation);
    }
}
