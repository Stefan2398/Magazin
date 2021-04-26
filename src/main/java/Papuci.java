public class Papuci extends Incaltaminte {

    private String culoare;
    private String model;

    public Papuci(Integer pret, Integer numar, String brand, String culoare, String model) {
        super(pret, numar, brand);
        this.culoare = culoare;
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Papuci{" +
                "culoare='" + culoare + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

