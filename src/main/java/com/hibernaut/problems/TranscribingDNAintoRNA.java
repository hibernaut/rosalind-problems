package com.hibernaut.problems;

import java.io.*;

/**
 * Created by hibernaut on 02.03.2021.
 */
public class TranscribingDNAintoRNA {
    public static void transcribe() {
        try (FileReader reader = new FileReader("src/dataset/rosalind_rna.txt");
             FileWriter writer = new FileWriter("src/result/rosalind_rna.txt")) {
            StringBuffer buffer = new StringBuffer();
            for (int c; (c = reader.read()) != -1; ) {
                if (c != 'T') {
                    buffer.append((char) c);
                } else {
                    buffer.append('U');
                }
            }
            writer.write(buffer.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        transcribe();
    }
}
