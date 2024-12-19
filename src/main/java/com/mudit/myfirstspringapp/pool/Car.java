package com.mudit.myfirstspringapp.pool;

import java.util.Objects;

public class Car {

    private String make;

    private int year;

    private int enginePower;

    private String color;

    private String state;

    private String model;

    private Car(String make, int year, int enginePower, String color, String state, String model) {
        this.make = make;
        this.year = year;
        this.enginePower = enginePower;
        this.color = color;
        this.state = state;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getColor() {
        return color;
    }

    public String getState() {
        return state;
    }

    public String getModel() {
        return model;
    }

    public static final class Builder {
        private String make;
        private int year;
        private int enginePower;
        private String color;
        private String state;
        private String model;

        public Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder initBmwM4Defaults() {
            make("bmw");
            model("m4");
            return this;
        }


        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder enginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            Objects.requireNonNull(make);

            return new Car(make, year, enginePower, color, state, model);
        }
    }
}
