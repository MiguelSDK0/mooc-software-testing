package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        // La solución es crear copias para no modificar las listas originales
        ArrayList<Integer> firstCopy = new ArrayList<>(first);
        ArrayList<Integer> secondCopy = new ArrayList<>(second);

        Collections.reverse(firstCopy);
        Collections.reverse(secondCopy);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.max(firstCopy.size(), secondCopy.size()); ++i) {
            int firstVal = i < firstCopy.size() ? firstCopy.get(i) : 0;
            int secondVal = i < secondCopy.size() ? secondCopy.get(i) : 0;
            int total = firstVal + secondVal + complement;
            complement = total / 10;
            result.add(total % 10);
        }

        if (complement > 0) {
            result.add(complement);
        }

        Collections.reverse(result);
        return result;
    }
}
