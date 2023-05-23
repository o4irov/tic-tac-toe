package com.company.client;

import java.io.*;

public class Common {
    public static String readBytes(java.io.InputStream stream) {
        try {
            BufferedInputStream bis = new BufferedInputStream(stream);
            bis.read();
            String s = "";
            while (bis.available() != 0) {
                s += (char) bis.read();
            }
            return s;
        } catch (IOException ex) {
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
        } catch (IOException ex) {
            System.out.println("I/O Error!");
        }
    }

    public static String readString(java.io.InputStream stream) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stream));
            return br.readLine();
        } catch (IOException ex) {
            System.out.println("I/O Error!");
        }
        return null;
    }

    public static void writeString(java.io.OutputStream stream, String string) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream));
            writer.write(string + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println("I/O Error!");
        }
    }
}
