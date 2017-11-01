package spittr;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by haleema on 9/13/2017.
 */
@Component
public class Spitter {
    private Long id;
    @NotNull
    @Size(min = 5, max = 16)
    private String username;
    @NotNull
    @Size(min = 5, max = 25)
    private String password;
    @NotNull
    @Size(min = 2, max = 30)
    private String firstName;
    @NotNull
    @Size(min = 2, max = 30)
    private String lastName;

    public Spitter() {

    }

    public Spitter(String username, String password, String fName, String lName) {
        this.username = username;
        this.password = password;
        this.firstName = fName;
        this.lastName = lName;
    }

    public Spitter(Long id, String username, String password, String fName, String lName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = fName;
        this.lastName = lName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
