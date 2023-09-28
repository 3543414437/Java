package com.test.first;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class New_1 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("这是Java写的文本文档。");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
