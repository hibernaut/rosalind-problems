package com.hibernaut.problems;

import java.io.*;

/**
 * In DNA strings, symbols 'A' and 'T' are complements of each other, as are 'C' and 'G'.
 * The reverse complement of a DNA string s
 * is the string sc formed by reversing the symbols of s
 * , then taking the complement of each symbol (e.g., the reverse complement of "GTCA" is "TGAC").
 * Given: A DNA string s
 * of length at most 1000 bp.
 * Return: The reverse complement sc of s.
 * Sample Dataset: AAAACCCGGT
 * Sample Output: ACCGGGTTTT
 * Created by hibernaut on 02.03.2021.
 */

public class ComplementingAStrandOfDNA {
    public static void reverseComplement() {
        try (FileReader reader = new FileReader("src/dataset/rosalind_revc.txt");
             FileWriter writer = new FileWriter("src/result/rosalind_revc.txt")) {
            StringBuffer buffer = new StringBuffer();
            for (int c; (c = reader.read()) != -1; ) {
                switch ((char) c) {
                    case 'A':
                        buffer.append('T');
                        break;
                    case 'T':
                        buffer.append('A');
                        break;
                    case 'C':
                        buffer.append('G');
                        break;
                    case 'G':
                        buffer.append('C');
                        break;
                }
            }
            writer.write(buffer.reverse().toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        reverseComplement();
    }
}
