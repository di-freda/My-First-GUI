# My First GUI 
It is a tiny demo project showing a simple Java GUI application and is a personal introduction into Java language. I plan to adapt this knowledge on other projects

## Features ✒️
- A screen that allows the user to enter their name and get a personalised greeting in French when they click on the button.

### Requirements:
  - Java Development Kit (JDK) 8 or newer.
  - Verify with: `java -version` and `javac -version`

## Getting Started 📑
If you want to compile and run from source:

1. Open a terminal in the repository root.
2. Compile:
   ```bash
   javac SimpleGUI.java
   ```
3. Run:
   ```bash
   java SimpleGUI
   ```

Note: A compiled `SimpleGUI.class` is already present in the repository; you can run it directly with step 3 if you prefer.

If you want to copy the code and experiment on your own code editor:
1. Create a new folder for the file.
2. Make a .java and .class file. Make sure their names are the same as the folder for easy navigation.
3. Install Java from Oracle.com [https://www.oracle.com/uk/java/technologies/downloads/] if you do not already have it.
4. Also install the relevant extension (there is a Java extention by Oracle Corporation in VS Code).
5. Run the program.


## Usage 📊

- This is a minimal example intended for learning and experimentation. The GUI demonstrates basic Java window creation and, depending on the source, likely shows simple controls (buttons, labels, or text fields). Inspect `SimpleGUI.java` to see the exact behavior and the Swing/AWT API usage.

## Technologies Used 🔖

- Programming Language: Java

## Contribution 👥

Contributions are welcome! Please fork the repository and submit a pull request.

1. Fork the repository
2. Create a topic/feature branch (`git checkout -b feature-name`)
3. Make your changes and test it locally. 
4. Create a new pull request with a short description of the change.

## Notes

- This repository is intentionally small and educational.
- If you plan to distribute a runnable JAR, you can package the class with:
  ```bash
  jar cfe SimpleGUI.jar SimpleGUI SimpleGUI.class
  ```
  and run with:
  ```bash
  java -jar SimpleGUI.jar
  ```

### License 🎫

All rights reserved

### Author 🌷

- [di-freda](https://github.com/di-freda)
