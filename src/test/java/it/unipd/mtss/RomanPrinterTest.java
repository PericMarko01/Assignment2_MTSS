package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {
    @Test
    public void testEmpty()
    {
        String s = RomanPrinter.printAsciiArt("");
        assertEquals("", s);
    }
    @Test
    public void testInvalidCharacter()
    {
        try
        {
            RomanPrinter.printAsciiArt("g");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Invalid character", e.getMessage());
        }
    }
    @Test
    public void testLowerCase()
    {
        String val3 = " _____   _____   _____ \n|_   _| |_   _| |_   _|\n  | |     | |     | |  \n  | |     | |     | |  \n _| |_   _| |_   _| |_ \n|_____| |_____| |_____|";
        String ret = RomanPrinter.printAsciiArt("iii");
        assertEquals(val3, ret);
    }
    @Test
    public void test_3()
    {
        String val3 = " _____   _____   _____ \n|_   _| |_   _| |_   _|\n  | |     | |     | |  \n  | |     | |     | |  \n _| |_   _| |_   _| |_ \n|_____| |_____| |_____|";
        String ret = RomanPrinter.printAsciiArt("III");
        assertEquals(val3, ret);
    }
    @Test
    public void test_6()
    {
        String val6 = "__      __  _____ \n\\ \\    / / |_   _|\n \\ \\  / /    | |  \n  \\ \\/ /     | |  \n   \\  /     _| |_ \n    \\/     |_____|";
        String ret = RomanPrinter.printAsciiArt("VI");
        assertEquals(val6, ret);
    }
    @Test
    public void test_10()
    {
        String val10 = "__   __\n\\ \\ / /\n \\ V / \n  > <  \n / . \\ \n/_/ \\_\\";
        String ret = RomanPrinter.printAsciiArt("X");
        assertEquals(val10, ret);
    }
    @Test
    public void test_20()
    {
        String val20 = "__   __ __   __\n\\ \\ / / \\ \\ / /\n \\ V /   \\ V / \n  > <     > <  \n / . \\   / . \\ \n/_/ \\_\\ /_/ \\_\\";
        String ret = RomanPrinter.printAsciiArt("XX");
        assertEquals(val20, ret);
    }
    @Test
    public void test_50()
    {
        String val50 = " _      \n| |     \n| |     \n| |     \n| |____ \n|______|";
        String ret = RomanPrinter.printAsciiArt("L");
        assertEquals(val50, ret);
    }
    @Test
    public void test_100()
    {
        String val100 = "  _____ \n / ____|\n| |     \n| |     \n| |____ \n \\_____|";
        String ret = RomanPrinter.printAsciiArt("C");
        assertEquals(val100, ret);
    }
    @Test
    public void test_500()
    {
        String val500 = " _____  \n|  __ \\ \n| |  | |\n| |  | |\n| |__| |\n|_____/ ";
        String ret = RomanPrinter.printAsciiArt("D");
        assertEquals(val500, ret);
    }
    @Test
    public void test_667()
    {
        String val667 = " _____     _____   _       __   __ __      __  _____   _____ \n|  __ \\   / ____| | |      \\ \\ / / \\ \\    / / |_   _| |_   _|\n| |  | | | |      | |       \\ V /   \\ \\  / /    | |     | |  \n| |  | | | |      | |        > <     \\ \\/ /     | |     | |  \n| |__| | | |____  | |____   / . \\     \\  /     _| |_   _| |_ \n|_____/   \\_____| |______| /_/ \\_\\     \\/     |_____| |_____|";
        String ret = RomanPrinter.printAsciiArt("DCLXVII");
        assertEquals(val667, ret);
    }
    @Test
    public void test_1000()
    {
        String val1000 = " __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|";
        String ret = RomanPrinter.printAsciiArt("M");
        assertEquals(val1000, ret);
    }
}