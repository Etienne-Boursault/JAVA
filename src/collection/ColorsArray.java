package collection;

public class ColorsArray {
    public static void main(String[] args){
        //TODO- Déclarez une variable nommée colors qui correspond à un tableau de String de longueur 5
        String[] colors;

        //TODO- Remplissez le tableau avec les couleurs demandées
        colors = new String[]{"red", "yellow", "orange", "green", "blue"};

        //TODO- Remplacez 'green' par 'emerald' dans le tableau
        colors[3] = "emerald";

        //Affiche le contenu du tableau
        for(String color:colors){
            System.out.println(color);
        }
    }
}
