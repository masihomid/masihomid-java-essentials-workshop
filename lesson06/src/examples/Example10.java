package examples;

import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Example10 {
    public static void main(String[] args) throws IOException {
        // declare a list that will contain all of the files
        // inside of the readme.txt file
        readLinesFromFile();
    }

    private static void readLinesFromFile() throws IOException {
        List<String> lines = Collections.emptyList();
        try {
            // provoke an exception
            lines = Files.readAllLines(Paths.get("readme.txt"));
        } catch (NoSuchFileException fe) {
            System.out.println("Exception: File Not Found");
            //fe.printStackTrace();
        }

        Iterator<String> iterator = lines.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}