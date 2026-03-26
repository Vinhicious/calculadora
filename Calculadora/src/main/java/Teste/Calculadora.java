package Teste;

public class Calculadora {
    public double soma(double a,double b){
        return a+b;
    }
    
    public double subtracao (double a, double b){
        return a-b;
    }
    
    public double multiplicacao (double a, double b){
        return a*b;
    }
    
    public double divisao (double a, double b){ 
        if (b != 0){
            return a/b;
        } else{
            System.out.println("o valor do dividendo não pode ser igual a 0");
            return Double.NaN;
        }
    }
}
