package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Création d’un fileReader pour lire le fichier
        FileReader fileReader = new FileReader("/path/to/the/file");

        // Création d’un bufferedReader qui utilise le fileReader
        BufferedReader reader = new BufferedReader(fileReader);

        try {
            // une fonction à essayer pouvant générer une erreur
            String line = reader.readLine();

            while (line != null) {
                // affichage de la ligne
                System.out.println(line);
                // lecture de la prochaine ligne
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();

        // Création d’un fileWriter pour écrire dans un fichier
        FileWriter fileWriter = new FileWriter("/path/to/the/file", false);

        // Création d’un bufferedWriter qui utilise le fileWriter
        BufferedWriter writer = new BufferedWriter(fileWriter);

        try {
            // ajout d’un texte à notre fichier
            writer.write("preferenceNewsletter = false");
            // Retour à la ligne
            writer.newLine();
            writer.write("preferenceColor = #425384");
        } catch(IOException e){
                e.printStackTrace();
        }
        writer.close();
    }
}
