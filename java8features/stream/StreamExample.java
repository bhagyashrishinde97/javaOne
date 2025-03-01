package java8features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User {
    private int id;
    private String username;
    private String password;
    private String email;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
        super();
    }

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }
}

class DTO {
    private int id;
    private String username;
    private String email;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DTO() {
        super();
    }

    public DTO(int id, String username, String email ,String Password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password=password;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class StreamExample {
    public static void main(String[] args) {
        // Creating a list of users
        List<User> userlist = new ArrayList<>();
        userlist.add(new User(1, "Ramesh", "Ramesh123", "ramesh123@gmail.com"));
        userlist.add(new User(2, "Suresh", "Suresh123", "suresh123@gmail.com"));
        userlist.add(new User(3, "Mahesh", "Mahesh123", "mahesh123@gmail.com"));
        userlist.add(new User(4, "Ganesh", "Ganesh123", "ganesh123@gmail.com"));

        // Mapping User objects to DTO objects
        List<DTO> dtoList = userlist.stream()
                .map(user -> new DTO(user.getId(), user.getUsername(), user.getEmail(),user.getPassword()))
                .collect(Collectors.toList());

        // Printing the DTO objects
        dtoList.forEach(System.out::println);
        List<DTO> userlis1 =userlist.stream().map(user -> new DTO
                (user.getId(), user.getUsername(), user.getEmail(), user.getPassword()))
                .collect(Collectors.toList());
        dtoList.forEach(System.out::println);
    }
}
