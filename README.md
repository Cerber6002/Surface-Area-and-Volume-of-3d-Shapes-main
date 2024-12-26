# Surface-Area-and-Volume-of-3d-Shapes


## Description
This project demonstrates polymorphism in Java by creating an interface for 3D shapes and implementing it in multiple classes: `Sphere`, `Cylinder`, and `Cube`. Each class calculates the surface area and volume of the shape. The program generates random objects, calculates their properties, and displays the results.

## Features
- Interface `Shape3DInterface` with methods `surfaceArea()` and `volume()`.
- Implementation of `Sphere`, `Cylinder`, and `Cube` classes.
- Random generation of 3D shapes with random dimensions.
- Calculation and display of surface area and volume.

## Sample Output
Sphere with radius 2.7453394131288764
Surface Area: 94,71
Volume: 86,67

Cube with side 4.571381914231907
Surface Area: 125,39
Volume: 95,53

Cylinder with radius 4.3621800328671405 and height 16.99525965480685
Surface Area: 585,37
Volume: 1015,98

Взято с кода который рандомно подбирает обьекты


## How Polymorphism is Used
The program uses polymorphism by storing objects of different types (`Sphere`, `Cylinder`, `Cube`) in an array of type `Shape3DInterface`. This allows the program to call `surfaceArea()` and `volume()` methods on each object without knowing its specific type.

## How to Run
1. Clone the repository:
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Run the `Main` class.
