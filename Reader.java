package com.company;
import java.io.FileReader;
import com.opencsv.CSVReader;

public class Reader {

    public static void main(String[] args) throws Exception {

        CSVReader reader = new CSVReader(new FileReader("addresses.csv"));
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null)
            for (String e : nextLine)
                System.out.format("%s ", e);

    }
}