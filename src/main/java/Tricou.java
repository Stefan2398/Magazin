public class Tricou extends Haine {

    private String material;
    private String culoare;

    public Tricou(Integer pret, String brand, String marime, String material, String culoare) {
        super(pret, brand, marime);
        this.material = material;
        this.culoare = culoare;
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCuloare(String sdad) {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Tricou{" +
                "material='" + material + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
