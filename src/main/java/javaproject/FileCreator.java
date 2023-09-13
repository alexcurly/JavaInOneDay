package javaproject;
import java.io.*;

import com.opencsv.CSVWriter;
public class FileCreator {
    public void create(String csvFileName){

        try(CSVWriter writer = new CSVWriter(new FileWriter(csvFileName))){
            System.out.println("File was created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
