package exercice2;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Optional;

public class GestionNotesEtudiants {
    public static void main(String[] args) {
        // 1. Créer un HashMap pour stocker les notes des étudiants
        Map<String, Double> notesEtudiants = new HashMap<>();

        // 2. Insérer des notes des étudiants
        notesEtudiants.put("Alice", 15.5);
        notesEtudiants.put("Bob", 17.0);
        notesEtudiants.put("Charlie", 12.5);
        notesEtudiants.put("David", 19.0);

        // Afficher la liste des notes après insertion
        System.out.println("Notes après insertion:");
        notesEtudiants.forEach((nom, note) -> System.out.println(nom + ": " + note));
        System.out.println();

        // 3. Augmenter la note d’un étudiant
        String etudiantPourAugmentation = "Alice";
        notesEtudiants.put(etudiantPourAugmentation, notesEtudiants.get(etudiantPourAugmentation) + 1.0);

        // Afficher la liste des notes après augmentation
        System.out.println("Notes après augmentation de la note d'Alice:");
        notesEtudiants.forEach((nom, note) -> System.out.println(nom + ": " + note));
        System.out.println();

        // 4. Supprimer la note d’un étudiant
        String etudiantPourSuppression = "Charlie";
        notesEtudiants.remove(etudiantPourSuppression);

        // Afficher la liste des notes après suppression
        System.out.println("Notes après suppression de la note de Charlie:");
        notesEtudiants.forEach((nom, note) -> System.out.println(nom + ": " + note));
        System.out.println();

        // 5. Afficher la taille du map
        System.out.println("Taille du map: " + notesEtudiants.size());
        System.out.println();

        // 6. Afficher la note moyenne, max et min
        OptionalDouble moyenne = notesEtudiants.values().stream().mapToDouble(Double::doubleValue).average();
        Optional<Double> max = notesEtudiants.values().stream().max(Double::compareTo);
        Optional<Double> min = notesEtudiants.values().stream().min(Double::compareTo);

        if (moyenne.isPresent()) {
            System.out.println("Note moyenne: " + moyenne.getAsDouble());
        } else {
            System.out.println("Pas de notes disponibles pour calculer la moyenne.");
        }

        if (max.isPresent()) {
            System.out.println("Note maximale: " + max.get());
        } else {
            System.out.println("Pas de notes disponibles pour trouver la note maximale.");
        }

        if (min.isPresent()) {
            System.out.println("Note minimale: " + min.get());
        } else {
            System.out.println("Pas de notes disponibles pour trouver la note minimale.");
        }
        System.out.println();

        // 7. Vérifier s’il y a une note égale à 20
        boolean noteEgaleA20 = notesEtudiants.containsValue(20.0);
        System.out.println("Y a-t-il une note égale à 20? " + (noteEgaleA20 ? "Oui" : "Non"));
        System.out.println();

        // 8. Afficher la liste des notes après chaque opération (déjà fait)
    }
}

