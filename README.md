# Advanced Programming - Lab 6

This repository contains all the problems proposed for the sixth laboratory in Advanced Programming course
solved by me.

## Essential tools

You need to have Java RE or JDK >= 8 installed on your computer.

## How to run it?

1. Open project with IntelliJ IDEA

Clone this repository and open it with IntelliJ IDEA. Build this project
(shortcut Ctrl+F9) then go to Run->Run...(shortcut Alt+Shift+F10) and select
the file you want to run.

2. Compile and run the programs using CMD

Go to the folder where the file is located. Open a new terminal here.

If you want to compile the file Main.java you must type the command.

```bash
javac -d . Main.java
```

After you compiled it, if you want to start the program you can type the
following command

```bash
java packageName.Main
```

where to packageName is the name of the package which includes the file Main.java.

## Problem

### GeometryDrawing
Create an application with graphical user interface for creating images (layouts) containing standard or custom geometric figures: diamonds, trapezes, regular polygons, snow flakes, etc.
You may use either Swing or JavaFX.

## Tasks

### Compulsory

- [x] The main frame of the application.
- [x] A configuration panel for introducing parameters regarding the shapes that will be drawn: the size, the number of sides, the stroke, etc.
The panel must be placed at the top part of the frame. The panel must contain at least one label and one input component for specifying the size of the component.
- [x] A canvas (drawing panel) for drawing various types of shapes. You must implement at least one shape type at your own choice. This panel must be placed in the center part of the frame.
When the users execute mouse pressed operation, a shape must be drawn at the mouse location. You must use the properties defined in the configuration panel (at least one) and generate random values for others (color, etc.).
- [x] A control panel for managing the image being created. This panel will contains the buttons: Load, Save, Reset, Exit and it will be placed at the bottom part of the frame.
- [x] Use a file chooser in order to specify the file where the image will be saved (or load).