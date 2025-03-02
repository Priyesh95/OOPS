# 1️⃣ What is Encapsulation?

**Encapsulation** is the process of **hiding an object's internal details** and **restricting direct access** to them. Instead, access is provided through **getter and setter methods**.

💡 **Key Idea:** The object's state (data) should only be changed in a **controlled manner**.

---

# 2️⃣ Why is Encapsulation Important?

✅ **Data Hiding**: Prevents direct access to object data, ensuring security.  
✅ **Improved Maintainability**: Changes to data representation don’t affect external code.  
✅ **Better Control**: Allows validation and data integrity checks before modifying values.  
✅ **Loose Coupling**: Other classes interact with the object **only through its methods**.  

---

# 3️⃣ How Encapsulation Works in Java

Encapsulation is implemented using:

- **Private fields** (data is hidden).
- **Public getter and setter methods** (controlled access).

### 📌 Example: Encapsulation in Action

**Scenario:** We have a `BankAccount` class. Instead of directly modifying the `balance`, we **control access** using methods.

```java
// Encapsulated Class
class BankAccount {
    private String accountHolder;  // Private variable
    private double balance;  // Private variable

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw method (controlled access)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alice", 1000);
        
        myAccount.deposit(500);  // Valid deposit
        myAccount.withdraw(300); // Valid withdrawal
        
        System.out.println("Current Balance: $" + myAccount.getBalance());

        // Uncommenting below line will cause an error
        // myAccount.balance = 5000;  // ❌ Direct access is restricted!
    }
}
```

---

# 4️⃣ Best Practices for Encapsulation

✔ **Use private access modifiers** for data fields.  
✔ **Provide public getter methods** for controlled access.  
✔ **Use setter methods with validation** to prevent invalid data updates.  
✔ **Avoid exposing mutable internal fields directly** (e.g., use **defensive copying** for lists).  

---

# 5️⃣ Encapsulation in a Real-World Java Project

📌 **Scenario:** In our **major Java project**, we will implement **encapsulation** in models like `User`, `Order`, `Product`, ensuring **safe access** to critical data.

### **Example: Secure Encapsulation in a User Class**

```java
class User {
    private String username;
    private String password;  // Never expose directly!

    // Getter
    public String getUsername() {
        return username;
    }

    // Secure Setter
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters!");
        }
    }
}
```

---

Let me know if you have any questions! 🚀
