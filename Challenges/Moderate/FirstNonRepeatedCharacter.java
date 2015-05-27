// Diogo Vidigal, 27/05/2015, CodeEval
/*
Write a program which finds the first non-repeated character in a string.
The first argument is a path to a file. The file contains strings.
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String result = "";
            line = line.trim();
            for(int i = 0; i < line.length(); i++) {
                String c = line.charAt(i) + "";
                if(!line.substring(0,i).contains(c) && !line.substring(i+1).contains(c)) {
                    result = c;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
