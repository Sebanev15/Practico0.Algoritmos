package org.example.ej3;

public class Contador {
    public static int max_cont = 5; //final
    public static int incremento = 1;
    public static int contador;
    
    public static void ContMax(int metodo){
        switch(metodo){
            case 1: while (contador < max_cont)
        {
            contador += incremento;
        }
        System.out.println("While "+contador); break;

        case 2: do {
            contador += incremento;
        } while (contador < max_cont);
        System.out.println("Do-while "+contador); break;

        case 3: for (int i = 1; i < max_cont; i+=incremento)
        {
            contador = i + incremento;
        }
        System.out.println("For "+contador); break;
        }
    }
}
