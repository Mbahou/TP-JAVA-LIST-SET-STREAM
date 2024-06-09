package exercice1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> produits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Supprimer un produit par indice");
            System.out.println("3. Afficher la liste des produits");
            System.out.println("4. Modifier un produit par indice");
            System.out.println("5. Rechercher un produit par nom");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option: ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'ID du produit: ");
                    long id = scanner.nextLong();
                    scanner.nextLine(); // Consommer la ligne restante

                    System.out.print("Entrez le nom du produit: ");
                    String nom = scanner.nextLine();

                    System.out.print("Entrez le prix du produit: ");
                    double prix = scanner.nextDouble();

                    Produit produit = new Produit(id, nom, prix);
                    produits.add(produit);
                    System.out.println("Produit ajouté avec succès.\n");
                    break;

                case 2:
                    System.out.print("Entrez l'indice du produit à supprimer: ");
                    int indiceSuppression = scanner.nextInt();
                    if (indiceSuppression >= 0 && indiceSuppression < produits.size()) {
                        produits.remove(indiceSuppression);
                        System.out.println("Produit supprimé avec succès.\n");
                    } else {
                        System.out.println("Indice invalide.\n");
                    }
                    break;

                case 3:
                    System.out.println("Liste des produits:");
                    for (int i = 0; i < produits.size(); i++) {
                        System.out.println(i + ": " + produits.get(i));
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Entrez l'indice du produit à modifier: ");
                    int indiceModification = scanner.nextInt();
                    scanner.nextLine(); // Consommer la ligne restante

                    if (indiceModification >= 0 && indiceModification < produits.size()) {
                        Produit produitAModifier = produits.get(indiceModification);

                        System.out.print("Entrez le nouveau nom du produit: ");
                        String nouveauNom = scanner.nextLine();
                        produitAModifier.setNom(nouveauNom);

                        System.out.print("Entrez le nouveau prix du produit: ");
                        double nouveauPrix = scanner.nextDouble();
                        produitAModifier.setPrix(nouveauPrix);

                        System.out.println("Produit modifié avec succès.\n");
                    } else {
                        System.out.println("Indice invalide.\n");
                    }
                    break;

                case 5:
                    System.out.print("Entrez le nom du produit à rechercher: ");
                    String nomRecherche = scanner.nextLine();
                    boolean trouve = false;
                    for (Produit p : produits) {
                        if (p.getNom().equalsIgnoreCase(nomRecherche)) {
                            System.out.println("Produit trouvé: " + p);
                            trouve = true;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Produit non trouvé.\n");
                    }
                    break;

                case 6:
                    System.out.println("Quitter le programme.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.\n");
                    break;
            }
        }
    }
}

