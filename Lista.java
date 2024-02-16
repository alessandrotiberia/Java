import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        // Creazione di un oggetto Scanner per l'input dell'utente
        Scanner scanner = new Scanner(System.in);
        
        // Dichiarazione di un array per memorizzare i numeri
        int[] numeri = new int[5];
        
        // Ciclo for per l'input dei numeri
        for (int i = 0; i < 5; i++) {
            System.out.print("Inserisci un numero: ");
            numeri[i] = scanner.nextInt();
        }
        
        // Inizializzazione del massimo come il primo numero nell'array
        int massimo = numeri[0];
        
        // Ciclo for per trovare il numero massimo
        for (int numero : numeri) {
            if (numero > massimo) {
                massimo = numero;
            }
        }
        
        // Stampare il numero massimo
        System.out.println("Il numero più grande è: " + massimo);
        
        // Chiudere lo scanner
        scanner.close();
    }
}