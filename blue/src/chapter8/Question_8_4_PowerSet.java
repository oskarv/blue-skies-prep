package chapter8;

import java.util.ArrayList;

public class Question_8_4_PowerSet {
    public static void main(String[] argv) {
        ArrayList<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        ArrayList<ArrayList<Integer>> allSubsets = getAllSubsets(set, 0);
        allSubsets.forEach(System.out::println);
    }

    public static ArrayList<ArrayList<Integer>> getAllSubsets(ArrayList<Integer> set, int index) {
        ArrayList<ArrayList<Integer>> allSubsets;
        if(set.size() == index) {
            allSubsets = new ArrayList<>();
            allSubsets.add(new ArrayList<>());
        } else {
            allSubsets = getAllSubsets(set, index + 1);
            int element = set.get(index);
            ArrayList<ArrayList<Integer>> currentIterationSubsets = new ArrayList<>();
            for(ArrayList<Integer> subset : allSubsets) {
                ArrayList<Integer> newSubset = new ArrayList<>(subset);
                newSubset.add(element);
                currentIterationSubsets.add(newSubset);
            }
            allSubsets.addAll(currentIterationSubsets);
        }

        return allSubsets;
    }
}
