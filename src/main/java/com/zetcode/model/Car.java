package com.zetcode.model;

import java.util.Objects;

public class Car {

    public Long id;
    public String make;
    public String model;
    public String year;

    public Car() {
    }

    public Car(Long idIn, String makeIn, String modelIn, String yearIn) {
        this.id = idIn;
        this.make = makeIn;
        this.model = modelIn;
        this.year = yearIn;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, make, model, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Car other = (Car) o;
        return other.id == this.id
                && other.make == this.make
                && other.model == this.model
                && other.year == this.year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("id=").append(id);
        sb.append(", make='").append(make).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", year='").append(year);
        sb.append('}');
        return sb.toString();
    }


}
