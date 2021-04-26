public class Haine {

    private Integer pret;
    private String brand;
    private String marime;

    public Haine(Integer pret, String brand, String marime) {
        this.pret = pret;
        this.brand = brand;
        this.marime = marime;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }

    @Override
    public String toString() {
        return "Haine{" +
                "pret=" + pret +
                ", brand='" + brand + '\'' +
                ", marime=" + marime +
                '}';
    }
}
