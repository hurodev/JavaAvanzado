package Ejercicios;

import java.util.Vector;


public class EjercicioVector {


    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
            int ve = vector.get(i);
        }

        vector.remove(1);
        vector.remove(2);

        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }



    // Tenemos que tener cuidado con los vectores ya que al rebasar y hasta duplicar  el consumos en memoria de 10000 hasta 20000


    }
}
