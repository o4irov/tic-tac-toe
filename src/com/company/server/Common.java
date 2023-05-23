package com.company.server;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

public class Common {

    public static class MoveMessage {
        public int x, y;
    }

    public static class BoardMessage {
        public String gameboard;
        public char your_type;
        public char move;
    }

    public static class EndMessage {
        public char win;
        public char your_type;
    }

    public static String readBytes(java.io.InputStream stream) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            int length = reader.read();

            String string = "";
            for (int i = 0; i < length; ++i) {
                string += (char)reader.read();
            }

            return string;
        }
        catch (IOException ex) {
            System.out.println("I/O Error!");
        }
        return null;
    }

    public static void writeBytes(java.io.OutputStream stream, String string) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream));
            writer.write(string.length());
            writer.write(string);
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println("I/O Error!");
        }
    }

    public static String readString(java.io.InputStream stream) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stream));
            return br.readLine();
        }
        catch (IOException ex) {
            System.out.println("I/O Error!");
        }
        return null;
    }

    public static void writeString(java.io.OutputStream stream, String string) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream));
            writer.write(string + "\n");
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println("I/O Error!");
        }
    }
}
