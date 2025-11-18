# GAME SHOP — SIDE OOP PROJECT (Java)

## Overview

This is a small Object-Oriented Java project that simulates a simple game rental shop. The store can rent games, return them, filter games by genre or age, calculate rental costs, and track total revenue. The project demonstrates basic OOP principles, unit testing, and file‑less business logic.

## Key Features

* Add games to store inventory
* Rent / return games
* Track total revenue
* Find most popular games
* Filter by genre or age
* Detect and remove damaged games
* Unit tests included (JUnit)

## Main Classes

* `Game` — represents a game with title, genre, age rating, popularity, price, and status
* `Store` — manages game inventory, rentals, revenue, and search functions
* `GameShopMain` — demo runner (main method)
* `GameStoreTest` — JUnit tests covering core features

## Example Operations

* Add a new game
* Rent a game if it is in stock
* Calculate rental cost with late fee
* Return the game and restore availability
* Get most popular game
* Count rented games

## How to Run (IDE)

1. Place the files under `src/main/java/gameshop/`
2. Run `GameShopMain`

## How to Run Tests

* Open project in IntelliJ / NetBeans / Eclipse
* Right‑click the test file → “Run Tests”

## Technologies Used

* Java (OOP fundamentals)
* JUnit (Testing)

## Future Improvements

* Better availability system (boolean instead of strings)
* File‑based input for game database
* GUI or CLI menu system
* Logging instead of console output

## Author

Toghrul Hasanli
