package controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsuportedMathOperationException;
import br.com.erudio.Math.SimpleMath;

@RestController // Anotação que define que esta classe é um controlador REST
public class MathController {

    // Contador atômico para rastrear o número de solicitações
    private final AtomicLong counter = new AtomicLong();

    // Instância da classe SimpleMath para realizar operações matemáticas
    private SimpleMath math = new SimpleMath();

    // Mapeamento de requisição GET para a soma de dois números
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        
        // Verifica se os valores são numéricos
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            // Lança uma exceção se os valores não forem numéricos
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        
        // Retorna a soma dos valores convertidos para Double
        return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // Mapeamento de requisição GET para a subtração de dois números
    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        
        // Verifica se os valores são numéricos
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            // Lança uma exceção se os valores não forem numéricos
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        
        // Retorna a subtração dos valores convertidos para Double
        return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // Mapeamento de requisição GET para a multiplicação de dois números
    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        
        // Verifica se os valores são numéricos
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            // Lança uma exceção se os valores não forem numéricos
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        
        // Retorna a multiplicação dos valores convertidos para Double
        return math.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // Mapeamento de requisição GET para a divisão de dois números
    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        
        // Verifica se os valores são numéricos
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            // Lança uma exceção se os valores não forem numéricos
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        
        // Retorna a divisão dos valores convertidos para Double
        return math.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // Mapeamento de requisição GET para a média de dois números
    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        
        // Verifica se os valores são numéricos
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            // Lança uma exceção se os valores não forem numéricos
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        
        // Retorna a média dos valores convertidos para Double
        return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    // Mapeamento de requisição GET para a raiz quadrada de um número
    @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
    public Double squareRoot(
            @PathVariable(value = "number") String number
    ) throws Exception {
        
        // Verifica se o valor é numérico
        if (!NumberConverter.isNumeric(number)) {
            // Lança uma exceção se o valor não for numérico
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        
        // Retorna a raiz quadrada do valor convertido para Double
        return math.squareRoot(NumberConverter.convertToDouble(number));
    }
}
