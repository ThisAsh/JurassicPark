/**
 * classe main 
 */

import java.util.Scanner;

public class JurassicPark {
    Scanner scanner = new Scanner(System.in);
    DinoDAO dao = new DinoDAO();  // Usa la classe DAO
    public static void main(String[] args) {
        
        int scelta;
        String nome;

        do {

            System.out.println("Menu:");
            System.out.println("1. Aggiungi un dinosauro");
            System.out.println("2. Trova un dinosauro tramite nome");
            System.out.println("3. Nutri un dinosauro");
            System.out.println("4. Cura un dinosauro");
            System.out.println("5. Visualizza tutti i dinosauri");
            System.out.println("6. Rimuovi un dinosauro");
            System.out.println("7. Visualizza tutti i dinosauri");
            System.out.print("Scelta: ");
            
            scelta = scanner.nextInt();
            scanner.nextLine(); // consuma newline

            switch (scelta) {
                case 1: //aggungi dino
                    System.out.println("Che tipo di dinosauro vuoi aggiungere \n1) T-rex \n2)Pterodattilo \n3)Plesiosauro");
                    String sceltaRazza = scanner.nextLine();
                    if (sceltaRazza.equals("1")) {
                        System.out.print("Nome del T-rex: ");
                        String nomeTrex = scanner.nextLine();
                        Dinosauro nuovo = new Tirannosauro(nomeTrex);
                    } else if (sceltaRazza.equals("2")) {
                        System.out.print("Nome del Pterodattilo: ");
                        String nomePtero = scanner.nextLine();
                        Dinosauro nuovo = new Pterodattilo(nomePtero);
                    } else if (sceltaRazza.equals("3")) {
                        System.out.print("Nome del Plesiosauro: ");
                        String nomePlesio = scanner.nextLine();
                        Dinosauro nuovo = new Plesiosauro(nomePlesio);
                    } else {
                        System.out.println("Scelta non valida.");
                        continue;
                    }
                    dao.dinosauri.add(nuovo);
                    System.out.println("Dinosauro aggiunto.");
                    break;
                case 2: //trova dino da nome
                    System.out.print("Nome da cercare: ");
                    nome = scanner.nextLine();
                    Dinosauro trovato = dao.trova(nome);
                    if (trovato != null) {
                        System.out.println("Trovato: " + trovato.nome + ", Stato: " + trovato.stato);
                    }
                    break;
                case 3:
                    System.out.print("Nome del dinosauro da nutrire: ");
                    String nomeDaNutrire = scanner.nextLine();
                    Dinosauro daNutrire = dao.trova(nome);
                    if (daNutrire != null) {
                        dao.nutri(daNutrire);
                        System.out.println("Il dinosauro è stato nutrito.");
                    }
                    break;
                case 4:
                    System.out.println("Visualizza tutti i dinosauri:");
                    for (Dinosauro dino : dao.dinosauri) {
                        System.out.println(dino.nome);
                        System.out.println("Specie: " + dino.specie);
                        System.out.println("Stato: " + dino.stato); 
                        System.out.println("Dimensione: " + dino.dimensione);
                        System.out.println("Dieta: " + dino.dieta);
                        dino.printinfo();
                        dino.infoRazza();
                        System.out.println("-------------------------");
                    }
                    break;
                case 5:
                    System.out.println("Rimuovere un dinosauro");
                    System.out.print("Nome del dinosauro da rimuovere: ");
                    String nomeDaRimuovere = scanner.nextLine();
                    Dinosauro daRimuovere = dao.trova(nomeDaRimuovere);
                    if (daRimuovere != null) {
                        dao.rimuovi(daRimuovere);
                        System.out.println("Dinosauro rimosso.");
                    } else {
                        System.out.println("Dinosauro non trovato.");
                    }
                    break;
                case 6:
                    System.out.println("Chiusura...");
                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 5);

        scanner.close();
    }
}