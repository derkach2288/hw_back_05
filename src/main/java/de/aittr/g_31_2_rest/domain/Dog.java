package de.aittr.g_31_2_rest.domain;

import java.util.Objects;

public class Dog {
    private int id;
    private String color;
    private double weight;
    private String breed;

    public Dog() {
    }

    public Dog(String color, double weight, String breed) {
        this.color = color;
        this.weight = weight;
        this.breed = breed;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (id != dog.id) return false;
        if (Double.compare(dog.weight, weight) != 0) return false;
        if (!Objects.equals(color, dog.color)) return false;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Собака: ИД - %d, цвет - %s, вес - %.3f, порода - %s", id, color, weight, breed);
    }
}
