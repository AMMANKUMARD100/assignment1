# Student Marks Analyzer

A mini project to input marks for $N$ students in an array, sort the scores, and display the top 3 marks and the average score.

## Features
- Accepts input for $N$ students into an array / list.
- Validates user input to ensure clean execution.
- Sorts marks in descending order.
- Extracts and prints the **top 3 marks** (handles cases where $N < 3$ gracefully).
- Computes and displays the **average score**.
- Implemented in both **Python** and **Java**.

---

## 🚀 How to Run

### 1. Python (`student_marks_analyzer.py`)
```bash
python student_marks_analyzer.py
```

**Example Run:**
```text
========================================
       STUDENT MARKS ANALYZER       
========================================
Enter number of students (N): 5

Enter marks for 5 students:
Student 1 marks: 85
Student 2 marks: 92
Student 3 marks: 78
Student 4 marks: 96.5
Student 5 marks: 88

========================================
             RESULTS                
========================================
Total Students: 5
All Marks (Descending): [96.5, 92.0, 88.0, 85.0, 78.0]
Top 3 Marks: [96.5, 92.0, 88.0]
Average Score: 87.90
========================================
```

---

### 2. Java (`StudentMarksAnalyzer.java`)
Compile and run:
```bash
javac StudentMarksAnalyzer.java
java StudentMarksAnalyzer
```
