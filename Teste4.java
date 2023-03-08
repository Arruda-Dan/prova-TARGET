import java.text.DecimalFormat;

public class Teste4 {

	static double SP = 67836.43;
	static double RJ = 36678.66;
	static double MG = 29229.88;
	static double ES = 27165.48;
	static double outros = 19849.53;
	static double valorTotal = SP + RJ + MG + ES + outros;

	public static void main(String[] args) {

		System.out.println("São Paulo representa " + calculaPercentual(SP) 
		+ "% do valor total da distribuidora");
		System.out.println("Rio de Janeiro representa " + calculaPercentual(RJ)
		+ "% do valor total da distribuidora");
		System.out.println("Minas Gerais representa " + calculaPercentual(MG)
		+ "% do valor total da distribuidora");
		System.out.println("Espírito Santo representa " + calculaPercentual(ES)
		+ "% do valor total da distribuidora");
		System.out.println("Os demais estados representam " + calculaPercentual(outros)
		+ "% do valor total da distribuidora");

	}

	public static String calculaPercentual(double estado) {
		double porcentagem = estado / valorTotal * 100;
		DecimalFormat df = new DecimalFormat("#,###.00");
		return df.format(porcentagem);

	}

}
