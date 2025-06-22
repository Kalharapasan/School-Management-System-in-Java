public class Admin {
    private int adminId;
    private String username;
    private String password;

    public Admin(int adminId, String username, String password) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Username: %s", adminId, username);
    }
}