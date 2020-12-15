package algorithms.substring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringTest {
    private Substring words = new Substring();
    private String a, b;
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void showReturnValidNumberOfRepetitionsOfWord(){
        assertEquals(3, words.substring("abcd", "bcdabcda"));
    }

    @Test
    void shouldReturnMinus1WhenNoResultIsFound(){
        assertEquals(-1, words.substring("abcd1", "bcdabcda"));
    }
}