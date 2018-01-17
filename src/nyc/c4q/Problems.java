package nyc.c4q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Problems {

    public static void main(String[] args) {
        int[] test = {2,2,3,4,4,3};
        removeDupes(test);
    }


    /**
     * Create a function `selectEvenNumbers` that will take in an array of numbers and return an array of only even numbers.
     * If there are no even numbers, return the empty array.
     */
    public static int[] selectEvenNumbers(int[] numbers) {
        if(numbers == null){
            return new int[]{};
        }
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i< numbers.length; i++){

            if (numbers[i]%2 == 0 && numbers[i]>=0){
               evenNumbers.add(numbers[i]);
            }
        }

        int[] newNumbers= evenNumbers.stream().mapToInt(i->i).toArray();

        return newNumbers;

        //if(numbers == null) return new int[]{};
        //return Arrays.stream(numbers).filter(n-> n>= 0 && n%2 ==0).toArray();// -> is a lambda expression
    }





    /**
     Given an array of integers, write a method called int[] removeDupes(int[] input) that returns a new array of just the unique values.

     You may use additional data structures in your solution.

     ```
     removeDupes(new int[]{1, 2, 3, 4, 5, 1, 2, 3});

     // returns {4, 5}

     removeDupes(new int[]{7, 7, 7, 7, 7}}

     // returns {}
     ```
     */
    public static int[] removeDupes(int[] numbers) {
        /*ArrayList<Integer> duplicates = new ArrayList<>();
        if(numbers.length == 0){
            return new int[]{};
        }
        ArrayList<Integer> noDupes = new ArrayList<>();

        for (int number: numbers) {
            noDupes.add(number);
        }
        for (int number: numbers) {

            for(int i =0; i < numbers.length; i++){
                if (numbers[i] == number){
                    duplicates.add(number);
                }
            }
        }
        noDupes.removeAll(duplicates);
        return makeArray(noDupes);*/

        if(numbers.length == 0){
            return new int[]{};
        }

        HashMap<Integer, Integer> removeDupes = new HashMap<>();

        for(int i =0; i < numbers.length; i++){
            int count = 0;
            if(removeDupes.get(numbers[i]) == null) {
                removeDupes.put(numbers[i], count);
            }else {
                removeDupes.put(numbers[i], removeDupes.get(numbers[i]) +1);
                System.out.println(numbers[i]);
                System.out.println(removeDupes.get(numbers[i]));
            }
        }

        ArrayList<Integer> noDupes = new ArrayList<>();

        for (int a: removeDupes.keySet()){
            if (removeDupes.get(a) < 0){
                noDupes.add(a);
            }
        }

        noDupes.addAll(removeDupes.keySet());
        return makeArray(noDupes);



        //Justice's solution-
        //Map of Number to count//for each each element//add it if it doesnt exist, increase it's count if it exists.
    }

    public static int[] makeArray(ArrayList<Integer> arrayList){
        if (arrayList.size() == 0){
            return new int[]{};
        }
        int[] arr = new int[arrayList.size()];
        for (int i =0; i<arrayList.size(); i++){
            arr[i] = arrayList.get(i);
        }
        return arr;
    }


    /**
    Alternative form of removeDupes is getDistinct() that returns the distinct elements in the array.
     */
        // hashmap, for each element, add it to the map , and increase the count


    /**
     Given a string, write a method called countTheLetters takes a string input and returns a map containing a count for each of the letters in the string.

     ```
     countTheLetters("dog");
     // returns a map containing the pairs {d: 1, o: 1, g: 1}

     countTheLetters("elephant");
     // returns a map containing the pairs {e: 2, l: 1, p: 1, h: 1, a: 1, n: 1, t: 1}

     countTheLetters("llama");
     // returns a map containing the pairs {l: 2, a: 2, m: 1}
     ```
     */
    public static HashMap<String, Integer> countTheLetters(String input) {

        HashMap<String, Integer> lettersCount= new HashMap<>();

        for(int i =0; i<input.length(); i++){
            String letter = String.valueOf(input.charAt(i));
            if(lettersCount.get(letter) == null) {
                lettersCount.put(String.valueOf(input.charAt(i)), 1);
            }else {
                lettersCount.put(letter, lettersCount.get(letter)+ 1);
            }
        }
        return lettersCount;
    }
}
