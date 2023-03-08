
public class Teste5 {

	public static void main(String[] args) {

		String texto = "Feliz dia das mulheres";

		System.out.println(inverteString(texto));

	}

	public static String inverteString(String string) {
		String novaString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			novaString += string.charAt(i);
		}
		return novaString;
	}

}
