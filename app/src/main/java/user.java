public class user {
    private String username;
    private String password;
    public user(String u, String p) {
        username=u;
        password=p;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
