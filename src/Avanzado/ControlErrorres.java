package Avanzado;

import java.io.IOException;
import java.util.Scanner;




public class ControlErrorres {





    public static void main(String[] args) {
    try {
        divide(10, 0);
    }catch (ArithmeticException e) {
        System.out.println("error EN CERO");
    } catch (Exception e) {


        throw new RuntimeException(e);
    }


    }


    public static int divide(int x, int y) throws ArithmeticException {
        int resultado = 0;


        try {
            resultado = x / y;
            System.out.println(resultado);
        }catch  (ArithmeticException e) {
            throw new ArithmeticException();

        }
        return resultado;

    }
}
