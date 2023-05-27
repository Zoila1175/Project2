package GroupProject2;
public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Please provide a Yahoo email address.");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && !userName.isEmpty() && userName.length() > 6) {
            if (!password.contains(userName)) {
                this.userName = userName;
            } else {
                System.out.println("Invalid username. Username cannot be a part of password.");
            }
        } else {
            System.out.println("Invalid username. Username should be of length larger than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty() && password.length() > 6) {
            if (!password.contains(userName)) {
                this.password = password;
            } else {
                System.out.println("Invalid password. Password cannot contain username.");
            }
        } else {
            System.out.println("Invalid password. Password should be of length larger than 6 characters.");
        }
    }
}

