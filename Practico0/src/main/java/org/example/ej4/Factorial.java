 package org.example.ej4;

class Factorial {
public static void main(String[] args){
    int factorial = factorial(3);
    System.out.print("factorial: " + factorial);
}
    public static int factorial(int num){
        int factorial=1;
        if (num <0 ){
            return -1;

        }

        if (num >12){
            return -2;
        }

        for (int i=num; i>=1; i-- ){
            factorial*=i;
        }
        
    
        return factorial;
    }
}