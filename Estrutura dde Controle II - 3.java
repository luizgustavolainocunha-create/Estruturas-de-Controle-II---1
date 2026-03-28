public class ContadorCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String entrada = scanner.nextLine();

        int letras = 0, espacos = 0, numeros = 0, outros = 0;

        for (char c : entrada.toCharArray()) {
            if (Character.isLetter(c)) letras++;
            else if (Character.isWhitespace(c)) espacos++;
            else if (Character.isDigit(c)) numeros++;
            else outros++;
        }

        System.out.println("Letras: " + letras);
        System.out.println("Espaços: " + espacos);
        System.out.println("Números: " + numeros);
        System.out.println("Outros: " + outros);

        scanner.close();
    }
}