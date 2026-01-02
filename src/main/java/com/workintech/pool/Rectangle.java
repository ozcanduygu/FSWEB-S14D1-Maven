package com.workintech.pool;

import java.util.Locale;

public class Rectangle {
    private double width;
    private double length;

    // STATİK BLOK: Sınıf ilk çalıştığında tüm projenin dilini Türkçe yapar.
    static {
        Locale.setDefault(new Locale("tr", "TR"));
    }

    public Rectangle(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}