// Target Interface
interface GradeSystem {
    String getGrade(int totalMarks);
}

// Adaptee (Old System)
class OldMarkSystem {
    public int getTotalMarks(int marks) {
        return marks;
    }
}

// Adapter
class GradeAdapter implements GradeSystem {

    private OldMarkSystem oldSystem;

    public GradeAdapter(OldMarkSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public String getGrade(int totalMarks) {

        int marks = oldSystem.getTotalMarks(totalMarks);

        if (marks >= 90)
            return "A";
        else if (marks >= 80)
            return "B";
        else if (marks >= 70)
            return "C";
        else if (marks >= 60)
            return "D";
        else
            return "F";
    }
}

// Main Class
 class AdapterDemo {

    public static void main(String[] args) {

        OldMarkSystem oldSystem = new OldMarkSystem();

        GradeSystem adapter = new GradeAdapter(oldSystem);

        int marks = 85;

        System.out.println("Total Marks : " + marks);
        System.out.println("Grade       : " + adapter.getGrade(marks));
    }
}