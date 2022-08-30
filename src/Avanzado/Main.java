package Avanzado;


import java.io.*;
import java.util.InputMismatchException;

public class Main {


    public static void main(String[] args) {

        File file = new File("/C://Users//hurod//OneDrive//Escritorio//Fichero.txt/");
        try {
            InputStream in = new FileInputStream(file);
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream("destinoFinal.txt");
            out.write(datos);

        }catch(Exception e){
            System.out.println("Error reading");
        }


//            boolean ok = false;
//            do {
//                Scanner scan = new Scanner(System.in);
//
//                System.out.println("ingresa dos numeros");
//
//                try {
//                    int numeros = scan.nextInt();
//                    int numeros2 = scan.nextInt();
//                    ok = true;
//                    System.out.println(numeros + " " + numeros2);
//                } catch (InputMismatchException e) {
//                    System.out.println("numero invalido");
//                }
//
//            }while  (!ok);



    }}

//        File file = new File("/C://Users//hurod//OneDrive//Escritorio//Fichero.txt/");
//
//        try {
//            InputStream fichero = new FileInputStream(file);
//            BufferedInputStream buffer = new BufferedInputStream(fichero);
//        try {
//
//
//            int dato = buffer.read();
//
//            while(dato != -1) {
//                System.out.println((char)dato);
//                dato = buffer.read();
//
//            }
//        }catch (Exception e) {
//            System.out.println("no se puede leer el fichero" + e.getMessage());
//        }
//        } catch (FileNotFoundException e) {
//            System.out.println("no se encontro el fichero " + e.getMessage());
//        }


