function calculateGrade(marks) {
    if (marks >= 90) {
        return "A+";
    } else if (marks >= 75) {
        return "A";
    } else if (marks >= 60) {
        return "B";
    } else if (marks >= 50) {
        return "C";
    } else {
        return "Fail";
    }
}

// Example
console.log(calculateGrade(95)); // A+
console.log(calculateGrade(80)); // A
console.log(calculateGrade(65)); // B
console.log(calculateGrade(55)); // C
console.log(calculateGrade(40)); // Fail