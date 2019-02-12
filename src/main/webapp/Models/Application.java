package Models;

public class Application {
    int id;
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

    public Application(int id, String fio, String course, String email, boolean isOnline) {
        this.id = id;
        this.fio = fio;
        this.course = course;
        this.email = email;
        this.isOnline = isOnline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", course='" + course + '\'' +
                ", email='" + email + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}
