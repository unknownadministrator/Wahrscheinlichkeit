public class Main {

    static int zufall, zufall2, zufall3, dG, eG, v;
    static String[] liste = new String[1000];

    public  static void main(String[] args){

    for(int i = 0; i < 1000; i++){
        Zufall();
        if(zufall == zufall2 && zufall2 == zufall3){

            liste[i] = "dG";
            dG++;

        }else if(zufall == zufall2 || zufall == zufall3 || zufall2 == zufall3){

            liste[i] = "eG";
            eG++;

        }else {

            liste[i] = "v";
            v++;

        }
        System.out.println(liste[i]);
    }

        System.out.println("\ndoppelter Gewinn: " + dG + " bzw.: "  + (float) dG / 10 + "%");
        System.out.println("einfacher Gewinn: " + eG + " bzw.: "  + (float) eG / 10 + "%");
        System.out.println("Verloren: " + v + " bzw.: "  + (float) v / 10 + "%");

    }

    private static void Zufall(){

        zufall = (int) (Math.random() * 3);
        zufall2 = (int) (Math.random() * 3);
        zufall3 = (int) (Math.random() * 3);
    }

}
