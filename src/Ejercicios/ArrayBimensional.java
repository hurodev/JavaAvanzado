package Ejercicios;

public class ArrayBimensional {
    public static void main(String[] args){

        int[][] array = new int[2][4];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[1][0] = 1;
        array[1][1] = 2;


        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {


                System.out.println(array[i][j]);

            }
        }

    }

}
