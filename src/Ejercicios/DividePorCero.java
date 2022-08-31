package Ejercicios;

public class DividePorCero {


    public static void main(String[] args) {

        DividePorCero(10, 0)       ;

    }


    static void DividePorCero(int valor1,int valor2)  {



        try{
        int resultado = valor1/valor2;
        System.out.println("el total es: "+ resultado);
        }catch(ArithmeticException e){
        System.out.println("Esto no puede hacerse:error  " + e.getMessage());
        }  finally{
            System.out.println("Demo de código");
        }


}
}

