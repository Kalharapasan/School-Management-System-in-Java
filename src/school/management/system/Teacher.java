public class Teacher {
    private int teacherId;
    private String firstName;
    private String lastName;

    public Teacher(int teacherId, String firstName, String lastName) {
        this.teacherId = teacherId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s %s", teacherId, firstName, lastName);
    }
}