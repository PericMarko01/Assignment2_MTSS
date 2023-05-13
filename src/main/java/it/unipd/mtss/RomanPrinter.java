////////////////////////////////////////////////////////////////////
// Michele Bonavigo 1216752
// Marko Peric 2011067
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    public static String printAsciiArt(String romanNumber) {
        if(romanNumber == "") 
        {
            return "";
        }
        romanNumber = romanNumber.toUpperCase();
        String[] arrayI = new String[]
        {
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|",
        };
        String[] arrayV = new String[]
        {
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    ",
        };
        String[] arrayX = new String[]
        {
            "__   __",
            "\\ \\ / /",
            " \\ V / ",
            "  > <  ",
            " / . \\ ",
            "/_/ \\_\\",
        };
        String[] arrayL = new String[]
        {
            " _      ",
            "| |     ",
            "| |     ",
            "| |     ",
            "| |____ ",
            "|______|",
        };
        String[] arrayC = new String[]
        {
            "  _____ ",
            " / ____|",
            "| |     ",
            "| |     ",
            "| |____ ",
            " \\_____|",
        };
        String[] arrayD = new String[]
        {
            " _____  ",
            "|  __ \\ ",
            "| |  | |",
            "| |  | |",
            "| |__| |",
            "|_____/ ",
        };
        String[] arrayM = new String[]
        {
            " __  __ ",
            "|  \\/  |",
            "| \\  / |",
            "| |\\/| |",
            "| |  | |",
            "|_|  |_|",
        };
        HashMap<Character,String[]> map;
        map = new HashMap<Character, String[]>();
        map.put('I', arrayI);
        map.put('V', arrayV);
        map.put('X', arrayX);
        map.put('L', arrayL);
        map.put('C', arrayC);
        map.put('D', arrayD);
        map.put('M', arrayM);

        List<String> asciiList = new ArrayList<String>();
        for(int i = 0; i < arrayI.length; i++)
        {
            asciiList.add("");
        }
        for(int i = 0; i < romanNumber.length(); i++)
        {
            String[] lettera = map.get(romanNumber.charAt(i));
            if(lettera == null)
            {
                throw new IllegalArgumentException("Invalid character");
            }
            for(int j = 0; j < lettera.length; j++)
            {
                String line = asciiList.get(j) + " " + lettera[j];
                if(i == 0)
                {
                    line = lettera[j];
                }            
                asciiList.set(j, line);
            }
        }
        StringBuilder art = new StringBuilder();
        for(int i = 0; i < asciiList.size(); i++)
        {
            art.append(asciiList.get(i));
            if(i != asciiList.size()-1)
            {
                art.append("\n");
            }
        }
        return art.toString();
    }
}