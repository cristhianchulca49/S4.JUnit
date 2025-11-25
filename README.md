# S4.JUnit

These exercises help you understand:

- How to write JUnit tests using `assertEquals`, `assertTrue`, `assertFalse`, and `assertAll`.
- How to implement **parameterized tests** with `@ParameterizedTest`.
- How to use **CSV source** (`@CsvSource`) to provide multiple test data.
- How to test for **exceptions** (e.g., `IllegalArgumentException`, `ArrayIndexOutOfBoundsException`). 

---

## 🧩 Level 1 Exercises

### Exercise 1: Book Collection

Create a Java class to manage a **collection of books** in a library. The class should allow:

- Adding books to the collection.
- Retrieving the complete list of books.
- Getting the title of a book given its position.
- Adding a book at a specific position.
- Removing a book by its title.

#### JUnit Tests

The functionality is verified with JUnit tests that:

- Check that the book list is **not null** after creating a new object.
- Confirm that the list has the **expected size** after inserting multiple books.
- Ensure that the list **contains a specific book** at the correct position.
- Verify that there are **no duplicate book titles** in the list.
- Check that the **title can be retrieved** given a specific position.
- Ensure that **adding a book** correctly modifies the list.
- Confirm that **removing a book** decreases the list size.
- Verify that the list **remains alphabetically ordered** after adding or removing a book.

---

### Exercise 2: DNI Letter Calculation

Create a class named `CalculationDNI` that calculates the **letter of a Spanish DNI** given the number as a parameter.  

#### JUnit Tests

- Implement a **parameterized JUnit test** to verify the correct behavior of the calculation.
- The test should cover **10 predefined DNI numbers** and check that the calculated letter matches the expected one.

---

### Exercise 3: Exception Handling

Create a class with a method that throws an **`ArrayIndexOutOfBoundsException`**.  

#### JUnit Test

- Verify its correct behavior using a JUnit test that checks the exception is properly thrown.

---

## 💻 Technologies Used

- **Java 25.0.1**
- **JUnit 5**
- **IntelliJ IDEA**

---

## 🛠️ Installation
Clone this repository:  
git clone https://github.com/cristhianchulca49/S4.JUnit.git

---
🤝 Contributions are welcome! 
- Please follow these steps to contribute: 
- Fork the repository Create a new branch: git checkout -b feature/NewFeature 
- Make your changes and commit them: git commit -m 'Add New Feature' 
- Push the changes to your branch: git push origin feature/NewFeature 
- Open a Pull Request
