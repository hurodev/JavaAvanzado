package Ejercicios;

import java.util.ArrayList;

public class EjercicioArrayLista2  {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(10);

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 2 == 0) {
                    numbers.remove(i);
                System.out.println(numbers.get(i));
            }

        }


       }


    }


