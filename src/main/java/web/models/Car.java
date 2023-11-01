package web.models;

public class Car {
    private String model;
    private String countryOfProduction;
    private double engineDisplacement;

    public Car() {
    }

    public Car(String model, String countryOfProduction, double engineDisplacement) {
        this.model = model;
        this.countryOfProduction = countryOfProduction;
        this.engineDisplacement = engineDisplacement;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + model + '\'' +
                ", countryOfProduction='" + countryOfProduction + '\'' +
                ", engineDisplacement=" + engineDisplacement +
                '}';
    }
}
