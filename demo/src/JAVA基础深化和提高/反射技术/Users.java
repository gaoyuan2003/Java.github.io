package JAVA基础深化和提高.反射技术;

public class Users {
    private String username;
    public int age;

    public void SuiBia(){
        System.out.println("old");
    }

    public Users() {
    }

    public Users(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public Users(String username) {
        this.username = username;
    }

    private Users(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
