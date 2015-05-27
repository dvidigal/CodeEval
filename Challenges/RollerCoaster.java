// Diogo Vidigal, 27/05/2015, CodeEval
/*
You are given a piece of text. Your job is to write a program that sets the case of text characters 
according to the following rules:

The first letter of the line should be in uppercase.
The next letter should be in lowercase.
The next letter should be in uppercase, and so on.
Any characters, except for the letters, are ignored during determination of letter case.
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(toRollerCase(line));
        }
    }
    
    public static String toRollerCase(String line) {
        char c;
        String output = "";
        boolean caps = true;
        for(int i = 0; i < line.length(); i++) {
            c = line.charAt(i);
            String letter = c+"";
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                if(caps) {
                    output += letter.toUpperCase();
                    caps = false;
                } else {
                    output += letter.toLowerCase();
                    caps = true;
                }
            }
            else {
                output += letter;
            }
        }
        return output;
    }
}
