public class Subject {
    private String code;
    private String name;

    public Subject(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Code: %s, Name: %s", code, name);
    }
}