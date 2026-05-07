# Assignment8
**CSC 175 Group Project** 

A java project that demonstrates an inheritance hierarchy, using the Turtle class provided in the GitHub repository. The inheritance hierarchy is shown using a base **Shapes** class and four subclasses. 


# Table of Contents

1. <a href="# Project Structure">Project Structure</a>
2. <a href="# Turtle.java">Turtle.java</a>
3. <a href="# Base Class">Base Class</a>
4. <a href="# Subclasses">Subclasses</a>


# Project Structure

Assignment8  <br>
│  <br>
├── .gitignore  <br>
├── App.java  <br>
├── Circle.java  <br>
├── Pentagon.java  <br>
├── README.md  <br>
├── Rectangle.java  <br>
├── Shape.java  <br>
├── Triangle.java  <br>
└── Turtle.java  <br>


# Turtle.java

> This version is a modified version of the class based off of **Nick Seward's** Turtle class (all credit goes to them). 

The documentation of the Turtle classes, used in this project are in the webpage attached the the activity **Turtle Class Documentation - README**. 


# Base Class

| Class | Description |
| ----------- | ----------- |
| Shape | Parent class containing shared shape attributes and methods |


# Subclasses

| Class | Extends | Description |
| ----------- | ----------- | ----------- |
| Rectangle | Shape | Child class representing a standered rectangle |
| Circle | Shape | Child class representing a standered circle |
| Triangle | Shape | Child class representing a standered triangle|
| Pentagon | Shape | Child class representing a standered pentagon |


# Example Concepts Used

## Inheritance

`class Rectangle extends Shape {`

## Methode Overriding

```

 @Override
    public void draw(Turtle t){

        t.penColor(this.getColor());

        for(int i = 0; i < 2; i++){
        t.forward(width);
        t.right(90);
        t.forward(length);
        t.right(90);
        }

    }
```


