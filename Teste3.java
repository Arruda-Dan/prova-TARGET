public class Teste3 {

	public static void main(String[] args) {

		double faturamento[] = { 22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174,
				11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826,
				43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61 };

		double menorValor = faturamento[0];
		double maiorValor = faturamento[0];
		int quantidade = 0;
		double soma = 0;
		int contador = 0;
		int mesesMedia = 0;

		for (int i = 0; i < faturamento.length; i++) {
			if (faturamento[i] < menorValor) {
				menorValor = faturamento[i];
			}
			if (faturamento[i] > maiorValor) {
				maiorValor = faturamento[i];
			}
		}

		for (int j = 0; j < faturamento.length; j++) {
			soma = soma + faturamento[j];
		}

		for (int k = 0; k < faturamento.length; k++) {
			if (faturamento[k] == 0.0) {
				contador = contador + 1;
			} else {
				contador = contador + 0;
			}
			quantidade = faturamento.length - contador;
		}

		double media = (soma / quantidade);

		System.out.println("Menor Valor: " + menorValor);
		System.out.println("Maior valor: " + maiorValor);
		System.out.println("Média: " + media);

		System.out.println("  ---------------------  ");

		for (int l = 0; l < faturamento.length; l++) {
			if (faturamento[l] < media) {
				mesesMedia = mesesMedia + 0;
				System.out.println("Mes " + (l + 1) + " não atingiu a média ");
			} else {
				mesesMedia = mesesMedia + 1;
				System.out.println("Mes " + (l + 1) + " atingiu a média: " + faturamento[l]);
			}
		}

		System.out.println("Total de meses que atingiram a média: " + mesesMedia);

	}

}
