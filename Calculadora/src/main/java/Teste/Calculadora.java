package Teste;

public class Calculadora {
    public int soma(int a,int b){
        return a+b;
    }
    
    public int subtracao (int a, int b){
        return a-b;
    }
    
    public double multiplicacao (double a, double b){
        return a*b;
    }
    
    public double divisao (double a, double b){ 
        if (b != 0){
            return a/b;
        } else{
            System.out.println("o valor de b não pode ser igual a 0");
            return Double.NaN;
        }
        
    }
}
