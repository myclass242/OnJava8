package com.zy.delegation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryFinally {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\GIT\\OnJava8\\reuse\\src\\com\\zy\\delegation\\TryFinally.java"));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    System.out.println(line);
                }
                throw new IOException();
            } finally {
                bufferedReader.close();
                System.out.println("closed");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
