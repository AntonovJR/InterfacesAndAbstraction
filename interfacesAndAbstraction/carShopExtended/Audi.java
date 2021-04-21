package interfacesAndAbstraction.carShopExtended;

    public class Audi extends CarImpl implements Rentable {

        private Integer minDaysForRent;
        private Double pricePerDay;

        public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minDaysForRent, Double pricePerDay) {
            super(model, color, horsePower, countryProduced);
            this.minDaysForRent = minDaysForRent;
            this.pricePerDay = pricePerDay;
        }

        public Integer getMinRentDay() {

            return this.minDaysForRent; }

        public Double getPricePerDay() {

            return this.pricePerDay; }


        public String toString() {
            return super.toString()+System.lineSeparator()+String.format("Minimum rental period of %d days. Price per day %f",getMinRentDay(),getPricePerDay());
        }


    }

