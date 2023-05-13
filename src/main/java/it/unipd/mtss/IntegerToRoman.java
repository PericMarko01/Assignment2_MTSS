////////////////////////////////////////////////////////////////////
// Michele Bonavigo 1216752
// Marko Peric 2011067
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if(number <= 0 || number > 1000)
        {
            throw new IllegalArgumentException("Invalid number");
        }
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans = 
        {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder rins = new StringBuilder();
        for(int i=0;i<val.length;i++) 
        {
            while(number >= val[i]) 
            {
                number -= val[i];
                rins.append(romans[i]);
            }
        }
        return rins.toString();
    }
}