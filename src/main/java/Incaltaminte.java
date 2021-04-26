public class Incaltaminte {

    private Integer pret;
    private Integer numar;
    private String brand;

    public Incaltaminte(Integer pret, Integer numar, String brand) {
        this.pret = pret;
        this.numar = numar;
        this.brand = brand;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public Integer getNumar() {
        return numar;
    }

    public void setNumar(Integer numar) {
        this.numar = numar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Incaltaminte{" +
                "pret=" + pret +
                ", numar=" + numar +
                ", brand='" + brand + '\'' +
                '}';
    }
}
