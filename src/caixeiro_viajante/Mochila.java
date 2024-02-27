package caixeiro_viajante;

public class Mochila {

    public static double colocarMochila(double capacidade, double[] pesos, double[] valores, int n) {
        // Validar se os arrays t�m o mesmo tamanho
        if (pesos.length != valores.length) {
            throw new IllegalArgumentException("Os arrays de pesos e valores devem ter o mesmo tamanho");
        }

        // Caso base: se n�o h� mais itens ou a capacidade � zero
        if (n == 0 || capacidade == 0) {
            return 0;
        }

        // Se o peso do item atual for maior que a capacidade da mochila,
        // ent�o este item n�o pode ser inclu�do na solu��o �tima
        if (pesos[n - 1] > capacidade) {
            return colocarMochila(capacidade, pesos, valores, n - 1);
        } else {
            // Retorna o m�ximo entre incluir o item atual ou n�o incluir
            return Math.max(
                valores[n - 1] + colocarMochila(capacidade - pesos[n - 1], pesos, valores, n - 1),
                colocarMochila(capacidade, pesos, valores, n - 1)
            );
        }
    }
}
