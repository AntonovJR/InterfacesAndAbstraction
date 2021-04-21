package interfacesAndAbstraction.carShopExtended;

public abstract class CarImpl implements Car {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    protected CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public Integer getHorsePower() {
        return horsePower;
    }
    public String countryProduced() {
        return countryProduced;
    }
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires"
                ,getModel(),countryProduced(), Car.TIRES);
    }
}
