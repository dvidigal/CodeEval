// Diogo Vidigal, 05/06/2015, CodeEval
/*
Write a program that, given a sentence where each word has a single digit positive integer as
a prefix and suffix, swaps the numbers while retaining the word in between. Words in the sentence 
are delimited from each other by a space.
The first argument is a path to a file. Each line of the input file contains one test case represented 
by a sentence. Each word in the sentence begins and ends with a single digit positive integer 
i.e. 0 through 9. Assume all characters are ASCII.
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
            String temp = " ";
            for (String splitLine1 : splitLine) {
                temp += splitLine1.charAt(splitLine1.length() - 1);
                temp += splitLine1.substring(1, splitLine1.length() - 1);
                temp += splitLine1.charAt(0) + " ";
            }
            temp = temp.trim();
            System.out.println(temp);
        }
    }
}
