package javaproject;

import java.io.*;
import java.util.LinkedList;

public class FileHandler {

//    public String createCSV(String fileName){
//        FileCreator a = new FileCreator();
//        a.create("myFile.txt");
//        return "file was created";
//    }

    String line;
    public LinkedList<Member> readFile() {
        LinkedList<Member> m = new LinkedList<>();
        String lineRead;
        String[] splitLine;
        Member mem;


        try (var reader = new BufferedReader(new FileReader("member.csv"))) {

            lineRead = reader.readLine();
            while(lineRead != null) {
                splitLine = lineRead.split(", ");
                if (splitLine[0].equals("S")){
                    mem = new SingleClubMember('S',
                            Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]),
                            Integer.parseInt(splitLine[4]));
                }else {
                    mem = new MultiClubMember('M',
                            Integer.parseInt(splitLine[1]), splitLine[2],
                            Double.parseDouble(splitLine[3]),
                            Integer.parseInt(splitLine[4]));
                }
                m.add(mem);
                lineRead = reader.readLine();
            }




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
