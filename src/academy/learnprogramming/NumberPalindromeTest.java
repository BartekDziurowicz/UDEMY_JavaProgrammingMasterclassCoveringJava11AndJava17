package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static academy.learnprogramming.NumberPalindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

    @ParameterizedTest(name="{index} => number {0} is palindrome")
    @ValueSource(ints={-1221, 707, 666, 3})
    void shouldReturnTrue(int number){
        assertTrue(isPalindrome(number));
    }

    @ParameterizedTest(name="{index} => number {0} is not palindrome")
    @ValueSource(ints={11212, 708, 667, 13})
    void shouldReturnFalse(int number){
        assertFalse(isPalindrome(number));
    }

}