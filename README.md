# Solitaire Card Game

This is a Java project that simulates a deck of cards for a Solitaire game. The project is built with Maven and uses OpenJDK 22.

## Project Structure

The project is organized into several classes, each with a specific role:

- `Carte.java`: Represents a single card, with a value and a color.
- `CouleurCarte.java`: Enumerates the possible colors of a card.
- `ValeurCarte.java`: Enumerates the possible values of a card.
- `Deck.java`: Represents a deck of cards. It can shuffle the cards and distribute them.
- `Main.java`: The entry point of the application. It creates a deck, shuffles it, and prints it.

## Future Plans

We are planning to add a GUI using JavaFX in the near future. This will make the game more interactive and user-friendly.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- OpenJDK 22
- Maven

### Installing

1. Clone the repository

```bash
git clone https://github.com/Toudonou/Solitaire.git
```

2. Navigate into the cloned repository

```bash
cd Solitaire
```

3. Build the project with Maven

```bash
mvn clean install
```

4. Run the application

```bash
java -cp target/solitaire-1.0-SNAPSHOT.jar org.toudonou.Main
```

## Built With

- [Java](https://www.oracle.com/java/)
- [Maven](https://maven.apache.org/)

## Author

- [Toudonou](https://github.com/Toudonou)
```