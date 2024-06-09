package exercice3;

import java.util.HashSet;
import java.util.Set;

public class GestionGroupesApp {
    public static void main(String[] args) {
        // 1. Créer deux Sets de type HashSet nommées groupeA et groupeB
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // 2. Ajouter des noms des étudiants à chaque HashSet
        groupeA.add("Alice");
        groupeA.add("Bob");
        groupeA.add("Charlie");
        groupeA.add("David");

        groupeB.add("Charlie");
        groupeB.add("David");
        groupeB.add("Eve");
        groupeB.add("Frank");

        // 3. Afficher l’intersection des deux HashSets
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection des deux groupes: " + intersection);

        // 4. Afficher l’union des deux HashSets
        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union des deux groupes: " + union);
    }
}
