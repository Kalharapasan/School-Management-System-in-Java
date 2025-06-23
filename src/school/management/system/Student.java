public class Student {
    private String id;
    private String name;
    private int age;
    private String grade;

    public Student(String id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters and setters...

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Age: %d, Grade: %s", id, name, age, grade);
    }
}