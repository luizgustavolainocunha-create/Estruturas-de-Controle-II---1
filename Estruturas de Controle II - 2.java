import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a latitude do ponto 1 (em graus):");
        double lat1 = Math.toRadians(scanner.nextDouble());
        System.out.println("Digite a longitude do ponto 1 (em graus):");
        double lon1 = Math.toRadians(scanner.nextDouble());

        System.out.println("Digite a latitude do ponto 2 (em graus):");
        double lat2 = Math.toRadians(scanner.nextDouble());
        System.out.println("Digite a longitude do ponto 2 (em graus):");
        double lon2 = Math.toRadians(scanner.nextDouble());

        // Raio da Terra em km
        double raioTerra = 6371;

        // Fórmula de Haversine
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distanciaEsfera = raioTerra * c;

        // Distância na superfície plana (aproximação simples)
        double distanciaPlana = Math.sqrt(Math.pow(lat2 - lat1, 2) + Math.pow(lon2 - lon1, 2)) * raioTerra;

        System.out.println("Distância na esfera (Haversine): " + distanciaEsfera + " km");
        System.out.println("Distância na superfície plana (aproximação): " + distanciaPlana + " km");

        scanner.close();
    }
}