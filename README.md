# Screening Test - Raviraj Yuvraj Patil

**Position Applied:** Full Stack Developer  
**Company:** TANDEMLOOP  
**Language Used:** Java  
**IDE Used:** Eclipse
**Submission Date:** 10-April-2025

---

## 🔹 Problem 1: Calculator using Class
- A basic calculator that performs Addition, Subtraction, Multiplication, and Division.
- Inputs: Two `double` numbers (`a`, `b`) and an operation type as a `String` (`add`, `sub`, `mul`, `div`).
- Output: Result based on the selected operation.

---

## 🔹 Problem 2: Generate First X Odd Numbers
- Input: A single integer `a`.
- Output: First `a` odd numbers are printed in sequence.
- Example:
  - Input: 4
  - Output: `1 3 5 7`
- **Logic Used:** A `for` loop runs `a` times, calculating each odd number using the formula `2 * i + 1`.

---

## 🔹 Problem 3: Conditional Odd Number Sequence
- **Input:** A single integer `a`.
- **Output:** Prints a sequence of odd numbers with:
  - If `a` is **odd** → print first `a` odd numbers.
  - If `a` is **even** → print first `a - 1` odd numbers.
- **Examples:**
  - Input: 1 → Output: `1`  
  - Input: 2 → Output: `1`  
  - Input: 3 → Output: `1 3 5`  
  - Input: 4 → Output: `1 3 5`  
  - Input: 5 → Output: `1 3 5 7 9`  
  - Input: 6 → Output: `1 3 5 7 9`
- **Logic Used:**  
  ```java
  int limit; 
  if(a % 2 == 0)
      limit = a - 1;
  else
      limit=a;
  
  for (int i = 0; i < limit; i++)
  {
      int odd = 2 * i + 1;
      System.out.print(odd + " ");
  }
  
---

## 🔹 Problem 4: Count of Multiples (1–9) from an Integer List
- Input: Fixed array: `{1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30}`
- Output: Count of numbers divisible by each number from 1 to 9.
- Example Output:  
  `1 : 11, 2 : 8, 3 : 4, 4 : 4, 5 : 3, 6 : 2, 7 : 0, 8 : 1, 9 : 1`
- **Logic Used:** Looping through each number from 1 to 9 and checking how many elements in the array are divisible by it.

---
