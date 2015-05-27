// Diogo Vidigal, 27/07/2015, CodeEval
/*
Microsoft Excel uses a special convention to name its column headers. 
The first 26 columns use the letters 'A' to 'Z'. Then, Excel names its column headers using
two letters, so that the 27th and 28th column are 'AA' and 'AB'. After 'ZZ', Excel uses three letters.

Write a function that takes as input the number of the column, and returns its header. 
The input will not ask for a column that would be greater than 'ZZZ'.
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int value = Integer.parseInt(line);
            System.out.println(getColName(value));
        }
    }
    
    public static String getColName(int colNum) {
        int number = colNum;
        int modulus;
        String result = "";
        while (number > 0) {
            number -= 1;
            modulus = number % 26;
            number = number / 26;
            
            result = (char) (modulus + 'A') + result;
        }
        return result;
    }
}
