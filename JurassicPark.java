/**
 * classe main 
 */

import java.util.Scanner;

public class JurassicPark {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DinoDAO dao = new DinoDAO();  // Usa la classe DAO
        int scelta;
        String nome;

        do {

            System.out.println("Menu:");
            System.out.println("1. Aggiungi un dinosauro");
            System.out.println("2. Trova un dinosauro tramite nome");
            System.out.println("3. Nutri un dinosauro");
            System.out.println("4. Cura un dinosauro");
            System.out.println("5. Visualizza tutti i dinosauri");
            System.out.println("6. Visualizza le informazioni di una specie");
            System.out.println("7. Rimuovi un dinosauro");
            System.out.println("8. Esci");
            System.out.print("Scelta: ");
            
            scelta = scanner.nextInt();
            scanner.nextLine(); // consuma newline

            switch (scelta) {

                case 1: //aggungi dino
                    System.out.println("Che tipo di dinosauro vuoi aggiungere? \n1) T-rex \n2)Pterodattilo \n3)Plesiosauro");
                    String sceltaRazza = scanner.nextLine();
                    if (sceltaRazza.equals("1")) {
                        System.out.print("Nome del T-rex: ");
                        String nomeTrex = scanner.nextLine();
                        Tirannosauro nuovo = new Tirannosauro(nomeTrex);
                        dao.aggiungi(nuovo);
                    } else if (sceltaRazza.equals("2")) {
                        System.out.print("Nome dello Pterodattilo: ");
                        String nomePtero = scanner.nextLine();
                        Pterodattilo nuovo = new Pterodattilo(nomePtero);
                        dao.aggiungi(nuovo);
                    } else if (sceltaRazza.equals("3")) {
                        System.out.print("Nome del Plesiosauro: ");
                        String nomePlesio = scanner.nextLine();
                        Plesiosauro nuovo = new Plesiosauro(nomePlesio);
                        dao.aggiungi(nuovo);
                    } else {
                        System.out.println("Scelta non valida.");
                        continue;
                    }
                    
                    System.out.println("Dinosauro aggiunto.");
                    break;

                case 2: //trova dino da nome
                    System.out.print("Nome da cercare: ");
                    nome = scanner.nextLine();
                    Dinosauro trovato = dao.trova(nome);
                    if (trovato != null) {
                        System.out.println("Trovato: " + trovato.getNome() + ", Stato: " + trovato.getStato());
                    }
                    break;

                case 3:
                    System.out.print("Nome del dinosauro da nutrire: ");
                    String nomeDaNutrire = scanner.nextLine();
                    Dinosauro daNutrire = dao.trova(nomeDaNutrire);
                    if (daNutrire != null) {
                        dao.nutri(daNutrire);
                    }
                    break;

                case 4:
                    System.out.print("Nome del dinosauro da curare: ");
                    String nomeDaCurare = scanner.nextLine();
                    Dinosauro daCurare = dao.trova(nomeDaCurare);
                    if (daCurare != null) {
                        dao.nutri(daCurare);
                    }
                    break;

                case 5:
                    System.out.println("Visualizza tutti i dinosauri:");
                    for (Dinosauro dino : dao.getDinosauri()) {
                        dino.printInfo();
                        System.out.println("-------------------------");
                    }
                    break;

                case 6:
                    System.out.println("Visualizza i dati delle specie presenti nel parco");
                    for (Dinosauro dino : dao.getDinosauri()) {
                        dino.infoSpecie();
                        System.out.println("-------------------------");
                    }

                    break;

                case 7:
                    System.out.println("Rimuovere un dinosauro");
                    System.out.print("Nome del dinosauro da rimuovere: ");
                    String nomeDaRimuovere = scanner.nextLine();
                    Dinosauro daRimuovere = dao.trova(nomeDaRimuovere);
                    if (daRimuovere != null) {
                        dao.vendi(daRimuovere);
                        System.out.println("Dinosauro rimosso.");
                    } else {
                        System.out.println("Dinosauro non trovato.");
                    }
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 8);

        System.out.println("Chiusura...");
        scanner.close();
        System.exit(0);
    }
}