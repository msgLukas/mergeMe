# Utility Toolbox

A command-line utility toolbox with various helpful tools.

## Structure
```
mergeMe/
├── src/
│   ├── HelloWorld.java      # Main application
│   ├── Utility.java          # Utility interface
│   └── IBANFormatter.java    # IBAN formatting utility
├── bin/                      # Compiled .class files
└── README.md
```

## Available Utilities

### 1. IBAN Formatter
Formats an IBAN to uppercase and adds spaces every 4 characters for better readability.

Example:
- Input: `de89370400440532013000`
- Output: `DE89 3704 0044 0532 0130 00`

## How to Run

### Compile
```bash
javac -d bin src/*.java
```

### Run
```bash
java -cp bin HelloWorld
```

## Requirements
- Java Development Kit (JDK) 8 or higher

## Adding New Utilities

To add a new utility:
1. Create a new class that implements the `Utility` interface
2. Implement the required methods: `getName()`, `getDescription()`, and `run(Scanner)`
3. Register the utility in `HelloWorld.main()` by adding it to the utilities list
