//use-a relationship in javascript
// Parent class
class Engine {
    start() {
        console.log("Engine started.");
    }

    stop() {
        console.log("Engine stopped.");
    }
}

// Child class
class Car {
    constructor() {
        this.engine = new Engine(); // Car uses an Engine
    }

    start() {
        console.log("Car started.");
        this.engine.start(); // Car uses Engine's start method
    }

    stop() {
        console.log("Car stopped.");
        this.engine.stop(); // Car uses Engine's stop method
    }
}

// Usage
const myCar = new Car();
myCar.start(); // Output: Car started. Engine started.
myCar.stop(); // Output: Car stopped. Engine stopped.
