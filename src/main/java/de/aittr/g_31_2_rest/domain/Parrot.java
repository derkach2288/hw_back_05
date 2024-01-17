package de.aittr.g_31_2_rest.domain;

import java.util.Objects;

public class Parrot {
    private int id;
    private String color;
    private double weight;

    public Parrot() {
    }

    public Parrot(int id, String color, double weight) {
        this.id = id;
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

        Parrot parrot = (Parrot) o;

        if (id != parrot.id) return false;
        if (Double.compare(parrot.weight, weight) != 0) return false;
        return Objects.equals(color, parrot.color);
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
        return "Parrot{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
