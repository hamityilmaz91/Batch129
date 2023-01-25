package mini_projects.login;

public class User {

    private String name ;
    private String username ;
    private String emali ;
    private String passwort ;

    public User(String name, String username, String emali, String passwort) {
        this.name = name;
        this.username = username;
        this.emali = emali;
        this.passwort = passwort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmali() {
        return emali;
    }

    public void setEmali(String emali) {
        this.emali = emali;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", emali='" + emali + '\'' +
                ", passwort='" + passwort + '\'' +
                '}';
    }
}
