// Diogo Vidigal, 26/06/2015
// Given a string write a program to convert it into lowercase.

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        String lower;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            lower = line.toLowerCase();
            System.out.println(lower);
        }
    }
}
