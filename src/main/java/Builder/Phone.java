package Builder;

public class Phone {
    private final String brand;
    private final String model;
    private final String OS;
    private final String color;
    private final int number;


    public Phone(String brand, String model, String os, String color, int number) {
        this.brand = brand;
        this.model = model;
        OS = os;
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Builder.Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                ", number=" + number +
                '}';
    }

    public static PhoneBuilder phoneBuilder() {
        return new PhoneBuilder();
    }

    public static class PhoneBuilder {
        private String brand;
        private String model;
        private String OS;
        private String color;
        private int number;

        public PhoneBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PhoneBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public PhoneBuilder withOS(String OS) {
            this.OS = OS;
            return this;
        }

        public PhoneBuilder withColor(String color) {
            this.color = color;
            return this;
        }
        public PhoneBuilder withNumber(int number) {
            this.number = number;
            return this;
        }
        public Phone build() {
            return new Phone(brand, model, OS, color, number);
        }
    }
}
