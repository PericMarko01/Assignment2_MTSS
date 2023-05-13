package it.unipd.mtss;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void testTooSmallNumber() {
        try
        {
            IntegerToRoman.convert(0);
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("Invalid number", e.getMessage());
        }
    }
    @Test
    public void testTooBigNumber() {
        try
        {
            IntegerToRoman.convert(1001);
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("Invalid number", e.getMessage());
        }
    }
    @Test
    public void test_3()
    {
        String number = IntegerToRoman.convert(3);
        assertEquals("III", number);
    }
    @Test
    public void test_6()
    {
        String number = IntegerToRoman.convert(6);
        assertEquals("VI", number);
    }
    @Test
    public void test_10()
    {
        String number = IntegerToRoman.convert(10);
        assertEquals("X", number);
    }
    @Test
    public void test_20()
    {
        String number = IntegerToRoman.convert(20);
        assertEquals("XX", number);
    }
    @Test
    public void test_50()
    {
        String number = IntegerToRoman.convert(50);
        assertEquals("L", number);
    }
    @Test
    public void test_100()
    {
        String number = IntegerToRoman.convert(100);
        assertEquals("C", number);
    }
    @Test
    public void test_500()
    {
        String number = IntegerToRoman.convert(500);
        assertEquals("D", number);
    }
    @Test
    public void test_667()
    {
        String number = IntegerToRoman.convert(667);
        assertEquals("DCLXVII", number);
    }
    @Test
    public void test_1000()
    {
        String number = IntegerToRoman.convert(1000);
        assertEquals("M", number);
    }
}