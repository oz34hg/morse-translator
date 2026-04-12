# Morse Translator

**Video Demo:** https://youtu.be/56upinv_zGo  

---

## Overview

Morse Translator is a Java-based desktop application that allows users to translate between plain text and Morse code in real time through an intuitive graphical user interface (GUI).

This project was developed as my CS50 Final Project, with the goal of demonstrating proficiency in:

- Object-oriented programming (OOP)
- GUI development using Java Swing
- Data structure manipulation
- Event-driven programming
- Software design and modular architecture

The application is lightweight, responsive, and designed with usability in mind.

---

## Motivation

Morse code is one of the earliest forms of digital communication. I chose this project because it combines:

- A clear algorithmic problem (mapping between text and encoded signals)
- A user interface challenge (making translation interactive and intuitive)
- Opportunities to practice clean architecture and modular design

I also wanted to go beyond a simple console program and build a fully interactive desktop application with real usability.

---

## Features

### Bidirectional Translation
- Convert Text to Morse Code
- Convert Morse Code to Text
- Real-time translation updates

### Audio Playback
- Plays Morse code as audible beeps
- Helps users understand timing and rhythm

### Export Functionality
- Save translated output to .txt files

### Cheat Sheet
- Built-in Morse code reference panel

### Custom UI
- Styled buttons and input fields
- Custom fonts and application branding

---

## Project Structure

```text
main/
├── java/
│   └── org/
│       ├── Main.java
│       └── utils/
│           CheatSheetPanel.java
│           CreateLogo.java
│           FontUtils.java
│           HashmapTools.java
│           InputField.java
│           MainWindow.java
│           ModernButton.java
│           UtilMorse.java
└── resources/
    ├── assets/
    │   ├── fonts/
    │   └── images/
    └── META-INF/
test/
├── java/
└── resources/
```

---

## Component Breakdown

### Main.java
Entry point of the application. Responsible for launching the GUI.

### MainWindow.java
Handles the main interface, layout, and user interaction.

### UtilMorse.java
Contains the core translation logic using hash maps.

### HashmapTools.java
Provides utilities for inverting key-value mappings for reverse translation.

### CheatSheetPanel.java
Displays a Morse code reference table within the GUI.

### InputField.java and ModernButton.java
Custom UI components for improved styling and usability.

### FontUtils.java
Loads and applies custom fonts.

### CreateLogo.java
Handles rendering of the application logo.

---

## How It Works

### Text to Morse
1. User enters text input
2. Each character is mapped to Morse code using a hash map
3. Output is constructed using dots (.) and dashes (-)

### Morse to Text
1. Morse input is split into symbols
2. Each symbol is mapped back to a character
3. Words are reconstructed from decoded characters

### Audio Playback
- Dot corresponds to a short beep
- Dash corresponds to a longer beep
- Timing intervals simulate real Morse code timing

---

## Installation and Setup

### Prerequisites
- Java 17 or higher
- Gradle (wrapper included)

### Clone the Repository
```bash
git clone https://github.com/oz34hg/morse-translator.git
cd morse-translator
```

### Build the Project
```bash
./gradlew clean build
```

### Run the Application

macOS/Linux:
```bash
./gradlew run
```

Windows:
```bash
gradlew.bat run
```

---

## Testing

Testing was primarily done manually through the GUI.

Cases considered:
- Invalid Morse input
- Unsupported characters
- Empty input handling

Future improvements include adding automated tests using JUnit.

---

## What I Learned

Through this project, I gained experience in:

- Structuring a multi-file Java project
- Designing and implementing GUIs using Swing
- Applying object-oriented programming principles
- Using hash maps for efficient data lookup
- Debugging both logic and interface issues

---

## Challenges

Some challenges encountered:

- Designing a clean and responsive GUI using Swing
- Handling bidirectional translation without redundant logic
- Implementing accurate timing for Morse audio playback
- Managing user input validation effectively

---

## Future Improvements

Possible enhancements:

- Web-based version
- Mobile version
- Adjustable playback speed
- Real-time Morse decoding via microphone input
- Expanded character support
- Automated unit and integration testing

---

## License

This project is for educational purposes as part of the CS50 course.

---

## Acknowledgments

- CS50 course for foundational knowledge
- Public Morse code references
- Java Swing documentation
