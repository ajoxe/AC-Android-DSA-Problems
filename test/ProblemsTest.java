import nyc.c4q.Problems;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ProblemsTest {

    /////////// selectEvenNumber tests

    @Test
    public void selectEvenNumber_empty_array_returns_empty() {
        int[] input = new int[]{};
        assertArrayEquals(new int[]{}, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_single_even_number_returns_all() {
        int[] input = {2};
        assertArrayEquals(new int[]{2}, Problems.selectEvenNumbers(input));

    }

    @Test
    public void selectEvenNumber_single_odd_number_returns_nothing() {
        int[] input = new int[]{1};
        assertArrayEquals(new int[]{}, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_all_even_numbers_returns_all() {
        int[] input = new int[]{2,4,6,8};
        assertArrayEquals(new int[]{2,4,6,8}, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_duplicate_even_numbers_returns_all() {
        int[] input = new int[]{2,2,2,2};
        assertArrayEquals(new int[]{2,2,2,2}, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_zero_is_returned() {
        int[] input = new int[]{2,0,4,6};
        assertArrayEquals(new int[]{2,0,4,6}, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_negative_is_not_returned() {
        int[] input = new int[]{-3, -2, 1, 2};
        assertArrayEquals(new int[]{2}, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_null_input_returns_empty() {
        int[] input = null;
        assertArrayEquals(new int[]{}, Problems.selectEvenNumbers(input));
    }


    ///////// removeDupes test

    @Test
    public void removeDupes_empty_returns_empty() {
        int[] input = new int[]{};
        assertArrayEquals(new int[]{}, Problems.removeDupes(input));
    }

    @Test
    public void removeDupes_all_dupes_returns_empty() {
        int[] input = {2,2,2,2,4,4,4};
        assertArrayEquals(new int[]{}, Problems.removeDupes(input));
    }

    @Test
    public void removeDupes_no_dupes_returns_all() {

    }

    @Test
    public void removeDupes_4ples_returns_empty() {

    }

    @Test
    public void removeDupes_works_on_negative_nums() {

    }

    @Test
    public void removeDupes_works_on_zero() {

    }

    // countTheLetters


    @Test
    public void countTheLetters_works_on_empty_input() {
        String input = "";
        HashMap<String, Integer> expected = new HashMap<>();
        assertEquals(expected.size(), Problems.countTheLetters(input).size());
    }

    @Test
    public void countTheLetters_works_on_null_input() {
        String input = "";
        HashMap<String, Integer> expected = new HashMap<>();
        assertEquals(expected.size(), Problems.countTheLetters(input).size());

    }

    @Test
    public void countTheLetters_works_on_single_char() {

    }

    @Test
    public void countTheLetters_works_on_duplicate_char_word() {

    }

    @Test
    public void countTheLetters_works_on_multi_char_word() {

    }

    @Test
    public void countTheLetters_works_on_symbols() {

    }

}
