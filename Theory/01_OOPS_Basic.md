# 1️⃣ What is Object-Oriented Programming (OOP)?

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of **"objects,"** which encapsulate **data (attributes)** and **behavior (methods)**. It enables **modular, reusable, and scalable** code.

---

# 2️⃣ Why Use OOP?

OOP provides several advantages over procedural programming:

✅ **Encapsulation** - Hides internal details, exposing only what’s necessary.  
✅ **Abstraction** - Simplifies complex systems by showing only essential details.  
✅ **Inheritance** - Promotes code reusability and logical hierarchy.  
✅ **Polymorphism** - Allows flexibility by letting objects take multiple forms.  

---

# 3️⃣ Key OOP Concepts

(We will explore these in-depth in future lessons.)

| **Concept**     | **Description**  | **Example** |
|---------------|----------------|------------|
| **Encapsulation** | Hiding internal state and requiring interaction via methods | Private fields with public getters/setters |
| **Abstraction** | Hiding unnecessary details from the user | Abstract classes & interfaces |
| **Inheritance** | Allowing a class to reuse properties of another class | `class Dog extends Animal {}` |
| **Polymorphism** | Ability of an object to take multiple forms | Method Overloading & Overriding |

---

# 4️⃣ Understanding OOP with a Real-World Example

Let’s take the example of a **Car 🚗**:

- A **Car** has **attributes** (color, model, engine type).
- A **Car** has **methods** (start, accelerate, stop).
- A **Car** can be a **subclass** of a **Vehicle**.

✅ **Encapsulation** - The engine details are hidden; you just call `start()`.  
✅ **Abstraction** - You use the steering wheel but don’t worry about internal mechanics.  
✅ **Inheritance** - `ElectricCar` and `GasCar` inherit from `Car`.  
✅ **Polymorphism** - `start()` works differently in `ElectricCar` and `GasCar`.  

---

# 5️⃣ Java Code Example: Basic OOP Implementation

📌 This example demonstrates a simple OOP structure in **Java**.

```java
// Base Class (Parent)
class Vehicle {
    private String brand;
    private int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method
    public void accelerate() {
        speed += 10;
        System.out.println(brand + " accelerating. Speed: " + speed + " km/h");
    }
}

// Derived Class (Child)
class Car extends Vehicle {
    private String model;

    // Constructor
    public Car(String brand, String model, int speed) {
        super(brand, speed);  // Call the parent constructor
        this.model = model;
    }

    // Overriding Method
    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println(model + " is gaining speed!");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "Model S", 50);
        myCar.accelerate(); // Calls overridden method
    }
}
```

---

### 🛠 Key Takeaways from the Code:

- **Encapsulation**: `brand` and `speed` are **private** in `Vehicle`.  
- **Inheritance**: `Car extends Vehicle`.  
- **Polymorphism**: `accelerate()` is **overridden** in `Car`.  

---

Let me know if you have any questions! 🚀
