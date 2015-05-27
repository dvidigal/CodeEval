// Diogo Vidigal, 27/05/2015, CodeEval
/*
You are given a text. Write a program which outputs its lines according to the following rules:

If line length is ≤ 55 characters, print it without any changes.
If the line length is > 55 characters, change it as follows:
Trim the line to 40 characters.
If there are spaces ‘ ’ in the resulting string, trim it once again to the last space (the space should be trimmed too).
Add a string ‘... <Read More>’ to the end of the resulting string and print it.
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() > 55) {
                line = line.substring(0, 40);
                if(line.contains(" ")) {
                    line = line.substring(0,line.lastIndexOf(" ")).trim();
                }
                line += "... <Read More>";
            }
            System.out.println(line);
        }
    }
}
