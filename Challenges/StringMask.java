// Diogo Vidigal, 05/06/2015, CodeEval
/*
You’ve got a binary code which has to be buried among words in order to unconsciously pass the cipher. 
Create a program that would cover the word with a binary mask. If, while covering, a letter finds itself as 1, 
you have to change its register to the upper one, if it’s 0, leave it as it is. Words are always in lower case 
and in the same row with the binary mask.
*/

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] splitLine = line.split("\\s+");
            char[] chars = splitLine[0].toLowerCase().toCharArray();

            for (int i = 0; i < splitLine[0].length(); i++) {
                if (splitLine[1].charAt(i) == '1') {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
            System.out.println(String.valueOf(chars));
        }
    }
}
