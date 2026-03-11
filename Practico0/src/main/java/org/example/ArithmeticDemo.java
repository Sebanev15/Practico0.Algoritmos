package org.example;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 1 + 2; // cambiar  a result =3
        result = result - 1; //cambiar a result --
        result = result * 2; // cambiar a result*=2
        result = result / 2; //cambiar result/=2
        result = result + 8; //cambiar a result +=8
        result = result % 7; //cambiar a result %=7


        int a =5; // creamos variables a e i con sus respectivos valores, operacion de asignacion
        int i =3;// operacion de asignacion
        a+= ++i; // se le suma uno a i y a A se le suma el nuevo valor de i, operacion de incremento luego de asignacion
        System.out.println(a +" "+ i); //

    }
    

}
