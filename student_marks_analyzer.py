"""
Student Marks Analyzer
----------------------
This program takes marks for N students, stores them in an array (list),
sorts them to determine the top 3 marks, and calculates the average score.
"""

def analyze_marks(marks):
    if not marks:
        return {
            "sorted_marks": [],
            "top_3": [],
            "average": 0.0
        }
    
    # Sort marks in descending order
    sorted_desc = sorted(marks, reverse=True)
    
    # Get top 3 marks (or fewer if N < 3)
    top_3 = sorted_desc[:3]
    
    # Calculate average score
    average = sum(marks) / len(marks)
    
    return {
        "sorted_marks": sorted_desc,
        "top_3": top_3,
        "average": average
    }

def main():
    print("=" * 40)
    print("       STUDENT MARKS ANALYZER       ")
    print("=" * 40)
    
    while True:
        try:
            n_input = input("Enter number of students (N): ").strip()
            n = int(n_input)
            if n <= 0:
                print("Please enter a positive integer greater than 0.\n")
                continue
            break
        except ValueError:
            print("Invalid input! Please enter a valid integer.\n")
            
    marks = []
    print(f"\nEnter marks for {n} students:")
    for i in range(1, n + 1):
        while True:
            try:
                mark_val = float(input(f"Student {i} marks: ").strip())
                if mark_val < 0 or mark_val > 100:
                    print("Warning: Standard marks are between 0 and 100. Accepted.")
                marks.append(mark_val)
                break
            except ValueError:
                print("Invalid input! Please enter a numeric mark value.")
                
    result = analyze_marks(marks)
    
    print("\n" + "=" * 40)
    print("             RESULTS                ")
    print("=" * 40)
    print(f"Total Students: {n}")
    print(f"All Marks (Descending): {result['sorted_marks']}")
    print(f"Top 3 Marks: {result['top_3']}")
    print(f"Average Score: {result['average']:.2f}")
    print("=" * 40)

if __name__ == "__main__":
    main()
