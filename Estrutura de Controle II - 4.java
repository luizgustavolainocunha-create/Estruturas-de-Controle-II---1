public class QuestaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.println("Qual é a capital da França?");
            System.out.println("a) Berlim b) Paris c) Londres d) Roma e) Madrid");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'b') {
                System.out.println("Resposta correta! Você acertou em " + (tentativas + 1) + " tentativa(s).");
                return;
            }
            System.out.println("Resposta incorreta. Tente novamente.");
            tentativas++;
        }

        System.out.println("Resposta incorreta nas 3 tentativas. A resposta correta era b) Paris.");
        scanner.close();
    }
}