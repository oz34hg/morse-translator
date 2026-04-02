# Morse Translator

 **Video Demo:** <INSERT_YOUTUBE_VIDEO_URL_HERE>

---

## Project Overview

**Morse Translator** is a Java desktop application that converts text ↔ Morse code using a simple GUI built with Java Swing. It supports **bidirectional translation**

This was created as my **CS50 Final Project** to demonstrate Java programming, object-oriented design, and GUI development.

---

## Features

- Text → Morse translation
- Morse → Text translation
- Lightweight, standalone Java application
- Export the translated code into .txt files
- Audio playback of the translated morse code

---

## 🗂 Project Structure

```text
main/
├── java/
│   └── org/
│       ├── Main.java             # Main entry point
│       └── utils/
│           CheatSheetPanel.java   # morse cheat sheet panel
│           CreateLogo.java        # Logo rendering
│           FontUtils.java         # Font helpers
│           HashmapTools.java      # Hashmap tool to invert the keys and values
│           InputField.java        # Custom input field
│           MainWindow.java        # Main GUI window
│           ModernButton.java      # Custom button
│           UtilMorse.java         # Morse translation utilities
└── resources/
    ├── assets/
    │   ├── fonts/
    │   │   ├── Jacquard_12/Jacquard12-Regular.ttf
    │   │   ├── JetBrainsMono/JetBrainsMono-Regular.ttf
    │   │   └── Pirata_One/PirataOne-Regular.ttf
    │   └── images/
    │       └── appIcon.png
    └── META-INF/
        └── MANIFEST.MF
test/
├── java/
└── resources/
```

#  How to Run Locally
### Prerequisites
Java 17+ installed

Gradle (wrapper included)

Clone the repository
---

```
    git clone https://github.com/oz34hg/morse-translator.git
    cd morse-translator
```
---
Build and Run
---
```
    ./gradlew clean build
    
    ./gradlew run       # macOS/Linux
    
    gradlew.bat run     # Windows
```

# What I Learned

### Through this project, I gained experience in:

- Structuring a multi-file Java project
- Designing and implementing GUIs
- Working with event-driven programming
- Using data structures effectively
- Debugging and improving user experience