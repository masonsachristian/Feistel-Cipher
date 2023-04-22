package tp_feistel.cipher;

import java.util.Scanner;

/**
 *
 * @author catsr
 */
public class Tp_FeistelCipher {
    public static void main(String[] args) {
        //Ici c'est l'insertion de N de 8 bits 
        int tableauDeDonnees[] = new int[8];
        Scanner clavier1 = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("Veuillez saisir le BIT à la position " + i + ":");
            tableauDeDonnees[i] = clavier1.nextInt();
        }
        //Ici c'est l'Affichage des données de la clé N 
        System.out.print("N = ");
        for (int i = 0; i < 8; i++) {
            System.out.print(tableauDeDonnees[i] + "|");
        }
        System.out.println("");

        // Ici, nous appliquons la permutation π 
        System.out.println("----------------------------");
        int pi[] = new int[8];
        for (int w = 0; w < 8; w++) {
            System.out.print("La valeur de permutation position " + w + ":");
            pi[w] = clavier1.nextInt();
        }
        
        //=========================SUITE==============================
        //Affichage de la permutation 
        System.out.print(" π = ");
        for (int w = 0; w < 8; w++) {
            System.out.print(pi[w] + "|");
        }
        System.out.println("");
        System.out.println("----------------------------");
        System.out.print("π (N) = ");
        System.out.print(tableauDeDonnees[4] + "|" + tableauDeDonnees[6] + "|" + tableauDeDonnees[0] + "|" + tableauDeDonnees[2] + "|" + tableauDeDonnees[7] + "|" + tableauDeDonnees[3] + "|" + tableauDeDonnees[1] + "|" + tableauDeDonnees[5]);
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("On sait que N = GO || DO de taille 4");
        System.out.print("GO = ");
        System.out.println(tableauDeDonnees[4] + "|" + tableauDeDonnees[6] + "|" + tableauDeDonnees[0] + "|" + tableauDeDonnees[2]);
        System.out.println("");
        System.out.print("DO = ");
        System.out.println(tableauDeDonnees[7] + "|" + tableauDeDonnees[3] + "|" + tableauDeDonnees[1] + "|" + tableauDeDonnees[5]);
        System.out.println("----------------------------");
        System.out.println("1er Round : D1 = P(GO) ⊕ K1 , Nous savons  que P = 2013");
        System.out.print("P (GO) = ");
        System.out.println(tableauDeDonnees[0] + "|" + tableauDeDonnees[4] + "|" + tableauDeDonnees[6] + "|" + tableauDeDonnees[2]);
        System.out.println("");
        System.out.print("K1 = ");
        System.out.println(tableauDeDonnees[2] + "|" + tableauDeDonnees[4] + "|" + tableauDeDonnees[6] + "|" + tableauDeDonnees[0]);
        System.out.println("");
        System.out.print("D1 = P(GO) ⊕ K1 = ");
        if (tableauDeDonnees[0] == tableauDeDonnees[2]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tableauDeDonnees[4] == tableauDeDonnees[4]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tableauDeDonnees[6] == tableauDeDonnees[6]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if (tableauDeDonnees[2] == tableauDeDonnees[0]) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        System.out.println("");
        System.out.println("----------------------------");
        
        //========================(SUITE et FIN du PROJET)=============================        
        //Ici nous affichons G1
        System.out.println("G1 = D0 ⊕(G0 ∨k1) ");
        System.out.print("On sait déjà que DO = ");
        System.out.println(tableauDeDonnees[7] + "|" + tableauDeDonnees[3] + "|" + tableauDeDonnees[1] + "|" + tableauDeDonnees[5]);
        System.out.print("Nous savons que également que GO = ");
        System.out.println(tableauDeDonnees[4] + "|" + tableauDeDonnees[6] + "|" + tableauDeDonnees[0] + "|" + tableauDeDonnees[2]);
        System.out.print("Puis k1 = ");
        System.out.println(tableauDeDonnees[2] + "|" + tableauDeDonnees[4] + "|" + tableauDeDonnees[6] + "|" + tableauDeDonnees[0]);
        System.out.println("");
        System.out.print("Y = G0 ∨k1 = ");
        if (tableauDeDonnees[4] == 1 && tableauDeDonnees[2] == 1) {
            System.out.print(1 + "|");
        } else if ((tableauDeDonnees[4] == 1 && tableauDeDonnees[2] == 0) || (tableauDeDonnees[4] == 0 && tableauDeDonnees[2] == 1)) {
            System.out.print(1 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tableauDeDonnees[6] == 1 && tableauDeDonnees[4] == 1) {
            System.out.print(1 + "|");
        } else if ((tableauDeDonnees[6] == 1 && tableauDeDonnees[4] == 0) || (tableauDeDonnees[6] == 0 && tableauDeDonnees[4] == 1)) {
            System.out.print(1 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tableauDeDonnees[0] == 1 && tableauDeDonnees[6] == 1) {
            System.out.print(1 + "|");
        } else if ((tableauDeDonnees[0] == 1 && tableauDeDonnees[6] == 0) || (tableauDeDonnees[0] == 0 && tableauDeDonnees[6] == 1)) {
            System.out.print(1 + "|");
        } else {
            System.out.print(0 + "|");
        }
        if (tableauDeDonnees[2] == 1 && tableauDeDonnees[0] == 1) {
            System.out.print(1 + "|");
        } else if ((tableauDeDonnees[2] == 1 && tableauDeDonnees[0] == 0) || (tableauDeDonnees[2] == 0 && tableauDeDonnees[0] == 1)) {
            System.out.print(1 + "|");
        } else {
            System.out.print(0 + "|");
        }
        System.out.println("");
        System.out.println("----------------------------");
        System.out.print("G1 = D0 ⊕ Y = ");
        if ((tableauDeDonnees[1] == 0 && tableauDeDonnees[7] == 0) || (tableauDeDonnees[1] == 1 && tableauDeDonnees[7] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tableauDeDonnees[2] == 0 && tableauDeDonnees[3] == 0) || (tableauDeDonnees[2] == 1 && tableauDeDonnees[3] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tableauDeDonnees[4] == 0 && tableauDeDonnees[1] == 0) || (tableauDeDonnees[4] == 1 && tableauDeDonnees[1] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tableauDeDonnees[2] == 0 && tableauDeDonnees[5] == 0) || (tableauDeDonnees[2] == 1 && tableauDeDonnees[5] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }

        System.out.println("");
        System.out.println("============================");
        System.out.println("2ème Round");
        System.out.println("D2 = P(G1)⊕k2");
        System.out.print("Or nous savons que G1 = ");
        if ((tableauDeDonnees[1] == 0 && tableauDeDonnees[7] == 0) || (tableauDeDonnees[1] == 1 && tableauDeDonnees[7] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tableauDeDonnees[2] == 0 && tableauDeDonnees[3] == 0) || (tableauDeDonnees[2] == 1 && tableauDeDonnees[3] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tableauDeDonnees[4] == 0 && tableauDeDonnees[1] == 0) || (tableauDeDonnees[4] == 1 && tableauDeDonnees[1] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tableauDeDonnees[2] == 0 && tableauDeDonnees[5] == 0) || (tableauDeDonnees[2] == 1 && tableauDeDonnees[5] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        System.out.println("");
        System.out.print("D'où k2 = ");
        System.out.println(tableauDeDonnees[7] + "|" + tableauDeDonnees[3] + "|" + tableauDeDonnees[1] + "|" + tableauDeDonnees[5]);
        System.out.println("");
        System.out.print("P(G1) = ");
        System.out.println(tableauDeDonnees[3] + "|" + tableauDeDonnees[1] + "|" + tableauDeDonnees[2] + "|" + tableauDeDonnees[7]);
        System.out.print("D2 = P(G1)⊕k2 = ");
        if ((tableauDeDonnees[7] == 0 && tableauDeDonnees[3] == 0) || (tableauDeDonnees[7] == 1 && tableauDeDonnees[3] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tableauDeDonnees[3] == 0 && tableauDeDonnees[1] == 0) || (tableauDeDonnees[3] == 1 && tableauDeDonnees[1] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tableauDeDonnees[1] == 0 && tableauDeDonnees[2] == 0) || (tableauDeDonnees[1] == 1 && tableauDeDonnees[2] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        if ((tableauDeDonnees[2] == 0 && tableauDeDonnees[7] == 0) || (tableauDeDonnees[2] == 1 && tableauDeDonnees[7] == 1)) {
            System.out.print(0 + "|");
        } else {
            System.out.print(1 + "|");
        }
        System.out.println("");
    }
    
}
