# Lesson 3: Abstraction in Java

## 1️⃣ What is Abstraction?
Abstraction is the process of **hiding implementation details** and exposing only the necessary functionality to the user. It allows developers to focus on **what an object does rather than how it does it.**  

💡 **Key Idea**: Only show relevant details while hiding complex implementations.

## 2️⃣ Why is Abstraction Important?
✅ **Reduces Complexity:** Hides unnecessary details, making code easier to manage.  
✅ **Increases Maintainability:** Changes in the internal implementation don’t affect external code.  
✅ **Enhances Security:** Prevents direct access to internal logic, reducing risks.  
✅ **Supports Loose Coupling:** Allows objects to interact via a common interface without depending on specific implementations.  

## 3️⃣ How is Abstraction Implemented in Java?
Java provides two ways to achieve abstraction:
1. **Abstract Classes** (Partial abstraction)  
2. **Interfaces** (Full abstraction)  

## 4️⃣ Abstract Classes in Java
An **abstract class**:
- **Cannot be instantiated** (you can't create objects of it).
- Can contain **both abstract and concrete methods**.
- Allows code reusability while enforcing method structure.

### Example: Abstract Class

```java
// Abstract class (cannot be instantiated)
abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (must be implemented in subclasses)
    abstract void startEngine();

    // Concrete method (shared among subclasses)
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Concrete subclass
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    // Implementing the abstract method
    @Override
    void startEngine() {
        System.out.println("Starting car engine...");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla");
        myCar.startEngine();   // Calls overridden method
        myCar.displayBrand();  // Calls concrete method from abstract class
    }
}
```

## 5️⃣ Interfaces in Java
An **interface**:
- Only contains **abstract methods** (before Java 8).
- Provides **100% abstraction**.
- Allows **multiple inheritance** (unlike abstract classes).

### Example: Interface

```java
// Interface (100% abstraction)
interface Drivable {
    void accelerate();  // Abstract method
}

// Implementing the interface
class Bike implements Drivable {
    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating...");
    }
}

// Implementing the interface in another class
class Truck implements Drivable {
    @Override
    public void accelerate() {
        System.out.println("Truck is accelerating...");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Drivable myBike = new Bike();
        myBike.accelerate();

        Drivable myTruck = new Truck();
        myTruck.accelerate();
    }
}
```

## 6️⃣ Abstract Classes vs Interfaces

| Feature | Abstract Class | Interface |
|---------|--------------|-----------|
| **Abstraction Level** | Partial | Full (100%) |
| **Method Types** | Abstract & Concrete | Only Abstract (until Java 8) |
| **Multiple Inheritance** | ❌ Not Supported | ✅ Supported |
| **When to Use?** | When sharing common behavior | When enforcing a contract |

## 7️⃣ Best Practices for Abstraction
✔ **Use abstract classes** when you need some shared behavior.  
✔ **Use interfaces** when defining a contract that multiple classes must follow.  
✔ **Prefer interfaces over abstract classes** when multiple inheritance is required.  
✔ **Follow Liskov Substitution Principle (LSP)** - Subclasses should be usable wherever the base class is expected.

## 8️⃣ Real-World Use Case in Our Java Project
📌 **Scenario:**  
- We will create an **abstract class `User`** with `login()` and `logout()`.  
- **Subclasses** (`AdminUser`, `RegularUser`) will implement specific behaviors.  
- We will use an **interface `Authorizable`** to define access control.

```java
// Abstract class defining common behavior
abstract class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    abstract void login();
    abstract void logout();
}

// Interface enforcing authorization rules
interface Authorizable {
    void grantPermission();
}

// Admin user implementing the interface
class AdminUser extends User implements Authorizable {
    public AdminUser(String username) {
        super(username);
    }

    @Override
    void login() {
        System.out.println(username + " logged in as Admin.");
    }

    @Override
    void logout() {
        System.out.println(username + " logged out.");
    }

    @Override
    public void grantPermission() {
        System.out.println(username + " granted system permissions.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        AdminUser admin = new AdminUser("Alice");
        admin.login();
        admin.grantPermission();
        admin.logout();
    }
}
```

## 📌 What’s Next?
Now that we’ve covered **Abstraction**, we’ll move to **Inheritance**, which allows one class to acquire properties and behaviors from another.

✅ **Next Lesson: Inheritance in Java (With Best Practices & Code Examples).**  
Say **"let's continue"** to proceed! 🚀  
