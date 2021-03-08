package com.hibernaut.problems;

import java.io.*;

/**
 * Created by hibernaut on 02.03.2021.
 */
public class TranscribingDNAintoRNA {
    public static void transcribe() {
        try (FileReader reader = new FileReader("E:\\Programming\\Java\\Projects\\rosalind-problems\\src\\main\\java\\com\\hibernaut\\problems\\input.txt");
             FileWriter writer = new FileWriter("E:\\Programming\\Java\\Projects\\rosalind-problems\\src\\main\\java\\com\\hibernaut\\problems\\output.txt")) {
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
