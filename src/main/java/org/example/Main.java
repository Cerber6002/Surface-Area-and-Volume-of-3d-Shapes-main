package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Shape3DInterface[] shapes = new Shape3DInterface[10];
        // Генерация случайных объектов
        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3); // 0 - Sphere, 1 - Cylinder, 2 - Cube
            switch (shapeType) {
                case 0 -> shapes[i] = new Sphere(1 + random.nextDouble() * 9); // Радиус от 1 до 10
                case 1 -> shapes[i] = new Cylinder(1 + random.nextDouble() * 9, 5 + random.nextDouble() * 15); // Радиус [1,10], высота [5,20]
                case 2 -> shapes[i] = new Cube(1 + random.nextDouble() * 9); // Сторона от 1 до 10
            }
        }

        // Вывод информации
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n", shape.volume());
            System.out.println();
        }
    }
}
