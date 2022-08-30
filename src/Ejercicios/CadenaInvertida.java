package Ejercicios;

public class CadenaInvertida {

    public static String cadenaInvertida(String cadena){
        String cadenaInvertida = "";
        for (int i = cadena.length()-1; i >= 0; i--) {
            cadenaInvertida= cadenaInvertida + cadena.charAt(i);
        }return cadenaInvertida;
    }


}
