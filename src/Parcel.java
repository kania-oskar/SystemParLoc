abstract public class Parcel {
    private String code;
    private double weight;

    public Parcel() {
    }

    public Parcel(String code, double weight) {
        setCode(code);
        setWeight(weight);
    }

    public void setCode(String code) {
        if(!code.equals(null) && code.matches("^([A-Za-z]{3})([0-9]{5})$")){
            this.code = code;
        } else {
            throw new IllegalArgumentException("Nieprawidlowy kod!");
        }
    }

    public String getCode() { return code; }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() { return weight; }
}
