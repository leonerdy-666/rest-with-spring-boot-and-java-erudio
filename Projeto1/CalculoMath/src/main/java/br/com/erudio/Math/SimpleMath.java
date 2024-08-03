package br.com.erudio.Math;

public class SimpleMath {

    // Método para somar dois números
    public Double sum(Double numberOne, Double numberTwo) {
        // Retorna a soma de numberOne e numberTwo
        return numberOne + numberTwo;
    }

    // Método para subtrair dois números
    public Double subtraction(Double numberOne, Double numberTwo) {
        // Retorna a subtração de numberOne menos numberTwo
        return numberOne - numberTwo;
    }

    // Método para multiplicar dois números
    public Double multiplication(Double numberOne, Double numberTwo) {
        // Retorna a multiplicação de numberOne e numberTwo
        return numberOne * numberTwo;
    }

    // Método para dividir dois números
    public Double division(Double numberOne, Double numberTwo) {
        // Retorna a divisão de numberOne por numberTwo
        return numberOne / numberTwo;
    }

    // Método para calcular a média de dois números
    public Double mean(Double numberOne, Double numberTwo) {
        // Retorna a média de numberOne e numberTwo
        return (numberOne + numberTwo) / 2;
    }

    // Método para calcular a raiz quadrada de um número
    public Double squareRoot(Double number) {
        // Retorna a raiz quadrada de number
        return Math.sqrt(number);
    }
    
    //teste
}
