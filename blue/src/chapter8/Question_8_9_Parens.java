package chapter8;

import java.util.HashSet;
import java.util.Set;

public class Question_8_9_Parens {
    public static void main(String[] argv) {
        int parens = 3;
        System.out.println(generateAllValidExpressions(parens));
    }

    public static Set<String> generateAllValidExpressions(int parens) {
        Set<String> set = new HashSet<>();
        if(parens == 0) {
            set.add("");
            return set;
        }

        Set<String> currentIteration = generateAllValidExpressions(parens - 1);
        for(String expression : currentIteration) {
            for(int i = 0; i < expression.length(); i++) {
                if(expression.charAt(i) == '(') {
                    String beginning = expression.substring(0, i + 1);
                    String ending = expression.substring(i + 1);
                    set.add(beginning + "()" + ending);
                }
            }
            set.add("()" + expression);
        }

        return set;
    }
}
