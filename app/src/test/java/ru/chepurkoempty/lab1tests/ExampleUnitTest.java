package ru.chepurkoempty.lab1tests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        MainActivity main = new MainActivity();
        assertEquals(main.max(5, 10), 10);
        assertEquals(main.max(1, 2), 2);
        assertEquals(main.max(1, 1), 1);
        assertEquals(main.max(555, 1), 555);

        assertEquals(main.min(1, 2), 1);
        assertEquals(main.min(2, 2), 2);
        assertEquals(main.min(12, 5), 5);
        assertEquals(main.min(1, 555), 1);
    }
}