package de.aittr.g_31_2_rest.domain;

import java.util.Objects;

public class Cat {

    private int id;
    private String color;
    private double weight;

    public Cat() {
    }

    public Cat(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (id != cat.id) return false;
        if (Double.compare(cat.weight, weight) != 0) return false;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return String.format("Кот: ИД - %d, цвет - %s, вес - %.3f", id, color, weight);
    }


}
