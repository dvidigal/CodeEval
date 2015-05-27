// Diogo Vidigal, 27/05/2015, CodeEval
/*
Players generally sit in a circle. The first player says the number “1”, and each player says next number in turn. 
However, any number divisible by X (for example, three) is replaced by the word fizz, 
and any divisible by Y (for example, five) by the word buzz. Numbers divisible by both become fizz buzz. 
A player who hesitates, or makes a mistake is eliminated from the game.

Write a program that prints out the final series of numbers where those divisible by X, Y and both are 
replaced by “F” for fizz, “B” for buzz and “FB” for fizz buzz.
*/

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] values = line.split(" ");
            String msg = "";
            int first = Integer.parseInt(values[0]);
            int second = Integer.parseInt(values[1]);
            int total = Integer.parseInt(values[2]);
            
            for(int i = 1; i <= total; i++) {
                if(i % first != 0 && i % second != 0) {
                    msg += i;
                } 
                else {
                    if(i % first == 0) {
                        msg += "F";
                    }
                    if(i % second == 0) {
                        msg += "B";
                    }
                }
                msg += " ";
            }
            System.out.println(msg);
        }
    }
}
