package com.fileWriterAndReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterAndReader {

    public static void main(String[] args) throws IOException {

        File itTask = new File("itTask.txt");

        java.io.FileWriter fileWriter = new java.io.FileWriter("itTask.txt");
        fileWriter.write("");


//        for (int i = 65; i < 91; i++) {
//            fileWriter.write(i);
//            fileWriter.write(" ");
//        }

        int j = 48;
        for (; j < 59; j++) {
            if (j == 58) {
                fileWriter.write(49);
                fileWriter.write(48);

            } else {
                fileWriter.write(j);
                fileWriter.write(" ");
            }
        }

        fileWriter.close();
        FileReader fileReader = new FileReader("itTask.txt");
//        String message = "";
//        for (int i = 0; i < itTask.length(); i++) {
//            message += "" + fileReader.read();
//        }

//        Scanner scanner1 = new Scanner(message);
        Scanner scanner2 = new Scanner(fileReader);

//        System.out.println(scanner1.nextLine());
        String x = "0";
        int y=0;
        while (scanner2.hasNext()) {
            if(scanner2.next().equals(x)) {
                System.out.println(scanner2.next());
            }
            y++;
            x+=""+y;
        }
        fileReader.close();
//        File itTask2 = new File("itTask2.txt");
//        FileWriterAndReader fileWriter1 = new FileWriterAndReader("itTask2");
//
//        FileReader fileReader2 = new FileReader("itTask2.txt");


    }
}
