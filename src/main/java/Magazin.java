import java.util.ArrayList;

public class Magazin {
    private static ArrayList<Incaltaminte> incaltaminte1;
    private static ArrayList<Haine> haine1;
    private static float suma;
    private static float suma1;

    public static void main(String[] args) {

        Adidasi Adidas = new Adidasi(500, 38, "Adidas", 400, "Adizero-asfalt", "verde");
        Pantofi CalvinKlein = new Pantofi(350, 42, "KalvinKlein", "negru", "Piele");
        Adidasi Nike = new Adidasi(300, 40, "Nike", 500, "Pegas", "albastru");
        Adidasi Hoka = new Adidasi(550, 38, "Hoka", 300, "One", "verde");
        Adidasi Asics = new Adidasi(200, 48, "Asics", 600, "gt300", "galben");
        Adidasi Salomon = new Adidasi(500, 41, "Salomon", 450, "SuperCross", "verde");
        Tricou Balenciaga = new Tricou(250, "Balenciaga", "S", "bumbac", "negru");
        Tricou Zara = new Tricou(100, "Zara", "S", "poliester", "verde");
        Tricou PullBear = new Tricou(80, "PullBear", "L", "bumbac", "albastru");
        Hanorac Kipsta = new Hanorac(150, "Kipsta", "L", "Bumbac", "verde");
        Hanorac Joma = new Hanorac(220, "Joma", "M", "Poliester", "Galben");
        haine1 = new ArrayList<Haine>();
        haine1.add(Zara);
        haine1.add(Balenciaga);
        haine1.add(Kipsta);
        haine1.add(Joma);
        haine1.add(PullBear);
        incaltaminte1 = new ArrayList<Incaltaminte>();
        incaltaminte1.add(Salomon);
        incaltaminte1.add(Nike);
        incaltaminte1.add(Asics);
        incaltaminte1.add(Adidas);
        incaltaminte1.add(Hoka);
        incaltaminte1.add(CalvinKlein);
        pretMediuIncaltaminte(incaltaminte1);
        pretMediuHaine(haine1);
        pretTotalMagaazin();
        clasificareDupaMarime();
        adidasiiScumpi();

    }

    private static void pretMediuIncaltaminte(ArrayList<Incaltaminte> incaltaminte1) {
        suma = 0;
        float media = 0;

        for (Incaltaminte incaltaminte : incaltaminte1) {
            suma += incaltaminte.getPret();
        }
        media = suma / incaltaminte1.size();
        System.out.println("Pretul mediu al incaltamintei este:  " + media);
    }

    private static void pretMediuHaine(ArrayList<Haine> haine1) {
        suma1 = 0;
        float media1 = 0;

        for (Haine haine : haine1) {
            suma1 += haine.getPret();
        }
        media1 = suma1 / haine1.size();
        System.out.println("Pretul mediu al hainelor este: " + media1);

    }

    private static void pretTotalMagaazin() {

        System.out.println("Pretul total al magazinului este: " + (suma + suma1));

    }

    private static void clasificareDupaMarime() {
        ArrayList<Haine> haineS = new ArrayList<Haine>();
        ArrayList<Haine> haineM = new ArrayList<Haine>();
        ArrayList<Haine> haineL = new ArrayList<Haine>();

        for (Haine haine : haine1) {
            if (haine.getMarime().equals("S")) {
                haineS.add(haine);
            } else if (haine.getMarime().equals("L")) {
                haineL.add(haine);
            } else haine.getMarime().equals("M");
            haineM.add(haine);
        }
        for (Haine haine : haineS) {
            System.out.println(haine.toString());
        }
    }
        private static void adidasiiScumpi(){
        int max  = 0;
        int index = 0;
        for(Incaltaminte incaltaminte : incaltaminte1){
            if(incaltaminte.getPret()>max){
                max = incaltaminte.getPret();
                 }
            }
            System.out.println("Adidasii cei scumpi sunt: " + incaltaminte1.get(index).getBrand() + " " + max);

        }
}


