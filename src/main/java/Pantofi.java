public class Pantofi extends Incaltaminte {

    private String culoare;
    private String material;

    public Pantofi(Integer pret, Integer numar, String brand, String culoare, String material) {
        super(pret, numar, brand);
        this.culoare = culoare;
        this.material = material;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Pantofi{" +
                "culoare='" + culoare + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
