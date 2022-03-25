package io;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

public class Console {
    private final Scanner input;
    private final PrintStream output;

    public Console(){
        input = new Scanner(System.in);
        output = out;
    }

    public static void printWelcome(){
        out.println("" +
                "**************************************************" +
                "***           Welcome and Bienvenue            ***" +
                "***                    to                      ***" +
                "***          ZipCo Inventory Manager           ***" +
                "**************************************************");
    }

    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextLine();
    }

    public void print(String val, Object... args) {
        output.format("\u001B[34m" + val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }
}
