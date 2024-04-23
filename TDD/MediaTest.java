import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class MediaTest {
    
    @Test
    public void testCalcularMedia() {
        int[] numeros = {10, 20, 30, 40, 50};
        double resultado = calcularMedia(numeros);
        assertEquals(30.0, resultado, 0.0); // Média esperada é 30.0
    }

    // Função para calcular a média
    public double calcularMedia(int[] lista) {
        // Implementação corrigida
        if (lista.length == 0) {
            return 0; // Retorna 0 se a lista estiver vazia
        }
        int soma = 0;
        for (int num : lista) {
            soma += num;
        }
        return (double) soma / lista.length; // Agora fazemos a divisão como double
    }
}

