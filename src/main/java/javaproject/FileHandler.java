package javaproject;

import java.io.*;
import java.util.LinkedList;

public class FileHandler {

    public String createCSV(String fileName){
        FileCreator a = new FileCreator();
        a.create("myFile");
        return "file was created";
    }

    String line;
    public LinkedList<Member> readFile() {

        try {
            var reader = new BufferedReader(new FileReader("myFile.txt"));
            line = reader.readLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
