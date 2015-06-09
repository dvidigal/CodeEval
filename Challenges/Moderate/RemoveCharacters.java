// Diogo Vidigal, 09/06/2015, CodeEval
/*
Write a program which removes specific characters from a string.
The first argument is a path to a file. The file contains the source 
strings and the characters that need to be scrubbed. Each source string and 
characters you need to scrub are delimited by comma.
*/

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] lineSplit = line.split(",");
            String phrase = lineSplit[0].trim();
            String condit = lineSplit[1].trim();
            String result = "";

            for (int i = 0; i < phrase.length(); i++) {
                if (!condit.contains(phrase.charAt(i) + "")) {
                    result += phrase.charAt(i) + "";
                }
            }
            System.out.println(result.trim());
        }
    }
}
