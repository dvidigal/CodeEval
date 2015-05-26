/*CHALLENGE DESCRIPTION:

In this challenge you're given a random string containing hidden and visible digits. 
The digits are hidden behind lower case latin letters as follows: 
0 is behind 'a', 1 is behind ' b ' etc., 9 is behind 'j'. 
Any other symbol in the string means nothing and has to be ignored. 
So the challenge is to find all visible and hidden digits in the string and 
print them out in order of their appearance.*/

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String result = "";

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c >= 'a' && c <= 'j') {
                    result += c - 'a';
                } else if (c >= '0' && c <= '9') {
                    result += c;
                }
            }

            if (result.equals("")) {
                System.out.println("NONE");
            } else {
                System.out.println(result);
            }
        }
    }
}
