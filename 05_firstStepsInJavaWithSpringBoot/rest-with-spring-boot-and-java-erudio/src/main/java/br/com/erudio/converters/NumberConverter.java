package br.com.erudio.converters;

public class NumberConverter {
    
    // Método estático que converte uma string para um Double
    public static Double convertToDouble(String strNumber) {
        // Se a string for nula, retorna 0D
        if (strNumber == null) return 0D;
        
        // Substitui todas as vírgulas por pontos (considerando notação BR para US)
        // BR: 10,25 -> US: 10.25
        String number = strNumber.replaceAll(",", ".");
        
        // Se a string modificada for numérica, converte para Double
        if (isNumeric(number)) return Double.parseDouble(number);
        
        // Se não for numérica, retorna 0D
        return 0D;
    }

    // Método estático que verifica se uma string é numérica
    public static boolean isNumeric(String strNumber) {
        // Se a string for nula, retorna falso
        if (strNumber == null) return false;
        
        // Substitui todas as vírgulas por pontos (considerando notação BR para US)
        String number = strNumber.replaceAll(",", ".");
        
        // Usa expressão regular para verificar se a string é um número válido
        // A expressão regular permite números com sinal (+ ou -), decimais e inteiros
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
