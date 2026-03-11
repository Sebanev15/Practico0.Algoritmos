package org.example.ej1;

public class PruebaAtributos {
    public int numero;
    public boolean booleano;
    public double decimal;
    public char unidad; // Si ponemos una palabra prohibida
                     // como nombre de variable (en este caso char), el programa da el error: 
                     // Syntax error on token "char", invalid VariableDeclarator
    public String texto;
    
    public static void prueba()
    {
        int numero1;
        boolean booleano1;
        double decimal1;
        char unidad1;
        String texto1; // si inciamos una variable local y no la usamos, el programa nos lo marca:
                        // The value of the local variable texto1 is not used
    }
}
//para compilar este programa, se debe ingresar en la consola el comando javac PruebaAtributos.java
//para ejecutar el programa, se debe ingresar en la consola el comando java PruebaAtributos