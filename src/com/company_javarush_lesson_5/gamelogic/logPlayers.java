package com.company_javarush_lesson_5.gamelogic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class logPlayers {

    public void log(String name) throws IOException {
        File f = new File("log.txt");
        if (f.createNewFile()){
            System.out.println("File log.txt created");
            log(name);
        }
        else{
            String data = name + "\n";
            System.out.println(name + " отправляется в список победителей!!! Ура!!!");
            FileWriter writer = new FileWriter("log.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }
    }
}
