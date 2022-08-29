package academy.learnprogramming;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static academy.learnprogramming.PlayingCat.isCatPlaying;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;;

class PlayingCatTest {

    @ParameterizedTest
    @ValueSource(ints={44, 45, 25, 26})
    void shouldReturnTrueWhenIsSummer(int temperature){
        assertTrue(isCatPlaying(true, temperature));
    }

    @ParameterizedTest
    @ValueSource(ints={34, 35, 25, 26})
    void shouldReturnTrueWhenIsNotSummer(int temperature){
        assertTrue(isCatPlaying(false, temperature));
    }

    @ParameterizedTest
    @ValueSource(ints={46, 24})
    void shouldReturnFalseWhenIsSummer(int temperature){
        assertFalse(isCatPlaying(false, temperature));
    }

    @ParameterizedTest
    @ValueSource(ints={36, 24})
    void shouldReturnFalseWhenIsNotSummer(int temperature){
        assertFalse(isCatPlaying(false, temperature));
    }

}