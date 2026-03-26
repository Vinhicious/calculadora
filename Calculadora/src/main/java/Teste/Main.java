package Teste;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        String escolha;
        
        
        System.out.println("Calculadora");
       
        do{
            System.out.println("Qual operacao voce deseja fazer?\n- Soma(som)\n- Subtracao(sub)\n- Divisao(div)\n- Multiplicacao(mul)\nEscolha:");
            escolha = sc.nextLine();
            if (escolha.equalsIgnoreCase("som") ){
                
                System.out.println("\nDigite o primeiro numero que voce deseja somar:");
                double num1 = sc.nextDouble();
                
                System.out.println("\nDigite o segundo numero que voce deseja somar:");
                double num2 = sc.nextDouble();
                
                double resultado = calc.soma(num1, num2);
                System.out.println("Resultado: " + resultado);
                
            } else if (escolha.equalsIgnoreCase("sub")){
                
                System.out.println("\nDigite o primeiro numero que voce deseja subtrair:");
                double num1 = sc.nextDouble();
                
                System.out.println("\nDigite o segundo numero que voce deseja subtrair:");
                double num2 = sc.nextDouble();
                
                double resultado = calc.subtracao(num1, num2);
                System.out.println("Resultado: " + resultado);
            
            }else if(escolha.equalsIgnoreCase("div")){
            
                System.out.println("\nDigite dividendo:");
                double num1 = sc.nextDouble();
                
                System.out.println("\nDigite o divisor:");
                double num2 = sc.nextDouble();
                
                double resultado = calc.divisao(num1, num2);
                System.out.println("Resultado: " + resultado);
                
            }else if(escolha.equalsIgnoreCase("mul")){
            
                System.out.println("\nDigite o primeiro numero que voce deseja multiplicar:");
                double num1 = sc.nextDouble();
                
                System.out.println("\nDigite o segundo numero que voce deseja multiplicar:");
                double num2 = sc.nextDouble();
                
                double resultado = calc.multiplicacao(num1, num2);
                System.out.println("Resultado: " + resultado);
            }else{
                System.out.println("\nOperacao Invalida! Tente novamente");
            
            }
            
            sc.nextLine();
            System.out.println("\nDeseja fazer outra operacao? (s/n):");
            escolha = sc.nextLine();
            
        }while(escolha.equalsIgnoreCase("s"));
    }
}
