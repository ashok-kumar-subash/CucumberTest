package com.cuckes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput {

    private static void readFilesByScanner(File file) throws IOException{
        System.out.println("Read Files by Scanner");
        List<String[]> tokens= new ArrayList<String[]>();
        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(line);
            String[] temp = line.split(";");
            tokens.add(temp);
        }

        for (String[] s:tokens){
            for(String word:s){
                System.out.println(word);
            }

        }

        sc.close();

    }

    public static void readByStream(File file){
        System.out.println("Read Files by Input stream");
        List<String[]> tokens= new ArrayList<String[]>();
        BufferedReader br = null;
        FileInputStream fis = null;
        String line;
        try {
            fis = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(fis));

            while ((line = br.readLine())!=null)   {
                System.out.println(line);
                String[] temp = line.split(";");
                tokens.add(temp);
            }

            for (String[] s:tokens) {
                for (String word : s) {
                    System.out.println(word);
                }

            }
            } catch (FileNotFoundException fnfe) {
            System.out.println("The specified file not found" + fnfe);
        } catch (IOException ioe) {
            System.out.println("I/O Exception: " + ioe);
        }
        finally {
            try{
                if(br != null && fis!=null)
                {
                    fis.close();
                    br.close();
                }
            }catch (IOException fnfe) {
                System.out.println("The specified file not found" + fnfe);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:/Results/javatest.txt");
        readFilesByScanner(file);
        readByStream(file);
    }

    }
