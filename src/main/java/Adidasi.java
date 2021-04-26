public class Adidasi extends  Incaltaminte {

    private Integer greutate;
    private String model;
    private String culoare;

    public Adidasi(Integer pret, Integer numar, String brand, Integer greutate, String model, String culoare) {
        super(pret, numar, brand);
        this.greutate = greutate;
        this.model = model;
        this.culoare = culoare;
    }

    public Integer getGreutate() {
        return greutate;
    }

    public void setGreutate(Integer greutate) {
        this.greutate = greutate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Adidasi{" +
                "greutate=" + greutate +
                ", model='" + model + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
