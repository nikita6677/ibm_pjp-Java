//Has-a relationship example in javascript
// Parent class
class Engine {
    constructor(type) {
        this.type = type;
    }

    start() {
        console.log(`${this.type} engine started.`);
    }

    stop() {
        console.log(`${this.type} engine stopped.`);
    }
}

// Child class
class Car {
    constructor(brand, engineType) {
        this.brand = brand;
        this.engine = new Engine(engineType); // Composition: Car has an Engine
    }

    drive() {
        console.log(`Driving ${this.brand} car.`);
        this.engine.start();
    }

    park() {
        console.log(`Parking ${this.brand} car.`);
        this.engine.stop();
    }
}

// Create a car object
const myCar = new Car('Toyota', 'V6');
myCar.drive(); // Output: Driving Toyota car. V6 engine started.
myCar.park(); // Output: Parking Toyota car. V6 engine stopped.
