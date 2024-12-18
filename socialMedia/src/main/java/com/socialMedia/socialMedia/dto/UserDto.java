package main.java.com.socialMedia.socialMedia.dto;
public class Userdto {
    @Email(message = " Invalid Emaill")
    @NotEmpty(message = "Email can not be empty")
    private  String email;
    @NotNull(message = "User name can not be null")
    private String username;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
