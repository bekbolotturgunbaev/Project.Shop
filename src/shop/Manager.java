package shop;

public class Manager {
    private String login = "Login";
    private int password = 1234;

    public Manager(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public Manager() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manger{" +
                "login='" + login + '\'' +
                ", password=" + password +
                '}';
    }
}

