package Ejercicios;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



public class EjercicioInputs {

    public static void main(String[] args){
        ArrayList<String> dataAL = new ArrayList<String>();

        Scanner scanner =   new Scanner(System.in);


        System.out.println("ingresa la data");
        String input = scanner.nextLine();
        dataAL.add(input);
        try {

        String ruta = "/C://Users//hurod//OneDrive//Escritorio//Fichero.txt/";
        File f = new File(ruta);
        FileWriter fw = new FileWriter(f);
        PrintWriter escritura = new PrintWriter(fw);
        for(int i=0;i<dataAL.size();i++){
            escritura.println(dataAL.get(i));
        }
        escritura.close();




            InputStream fieldIn = new FileInputStream(f);
            byte[] data = fieldIn.readAllBytes();
            PrintStream fieldOut = new PrintStream("File.txt");
            fieldOut.write(data);
        }catch  (IOException e) {
            System.out.println("error en data");
        }


    }

//    static void readData() throws FileNotFoundException {
//
//        Scanner scanner =   new Scanner(System.in);
//        System.out.println("ingresa la data");
//        String input = scanner.next();
//        try {
//            InputStream fieldIn = new FileInputStream(input);
//            byte[] data = fieldIn.readAllBytes();
//            PrintStream fieldOut = new PrintStream("Data.txt");
//            fieldOut.write(data);
//        }catch  (IOException e) {
//            System.out.println("error en data");
//        }
//
//
//    }

}
