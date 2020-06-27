package examples;

import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Example09 {
    public static void main(String[] args) {
        // declare a list that will contain all of the files
        List<String> lines = Collections.emptyList();
        try {
            // provoke an exception
            lines = Files.readAllLines(Paths.get("readme.txt"));
        } catch (NullPointerException|IOException ex) {
            if (ex instanceof IOException) {
                System.out.println("Exception: File Not Found");
            }
            if (ex instanceof NullPointerException) {
                System.out.println("Exception: NullPointer");
            }
        }
    }
}