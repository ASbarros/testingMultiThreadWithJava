package com.asbarros.multthread_code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassFile {

    public static void write(String result) {
        try {
            File arquivo = new File("result.txt");

            if (!arquivo.exists()) {

                arquivo.createNewFile();
            }
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(result);
            bw.newLine();
            bw.close();
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(ClassFile.class.getName()).log(Level.SEVERE, "não escreveu o arquivo", ex);
        }

    }
}
