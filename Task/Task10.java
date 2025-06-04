class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to print full name
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}

public class Task10 {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Angel", "Burger"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Angeles"),
        };

        // Loop through students and print their full names
        for (Student s : students) {
            s.printFullName();
        }
    }
}
