package com.softserve.dp_171_java.elementary.triangles.entity;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;
    private String name;
    private double area;

    public Triangle(double sideA, double sideB, double sideC, String name) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.name = name;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "[" + name + "]: " + area + "cm";
    }

}
