package Ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;

public class EjecicioArrayList {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("juan");
        lista.add("natalia");
        lista.add("daniel");
        lista.add("miriam");


        LinkedList<String> lista1 = new LinkedList<String>();
        lista1.add(lista.get(0));
        lista1.add(lista.get(1));
        lista1.add(lista.get(2));
        lista1.add(lista.get(3));

        System.out.println(lista);
        System.out.println(lista1);


    }


}
