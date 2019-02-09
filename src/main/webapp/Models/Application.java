package Models;

public class Application {
    String fio;
    String course;
    String email;
    boolean isOnline;

    public Application(String fio, String course, String email, boolean isOnline) {
        this.fio = fio;
        this.course = course;
        this.email = email;
        this.isOnline = isOnline;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}
