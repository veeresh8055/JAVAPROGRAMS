class UserRegistration {

    String username;
    String email;
    long number;
    String password;

    public UserRegistration(String username, String email, long number, String password) {
        this.username = username;
        this.email = email;
        this.number = number;
        this.password = password;
    }

    public UserRegistration(String username, long number, String password) {
        this.username = username;
        this.number = number;
        this.password = password;
    }

    public UserRegistration(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    void details() {
        System.out.println("Username :" + username);
        System.out.println("Email :" + email);
        System.out.println("Phone Number  :" + number);
        System.out.println("Password :" + password);
    }

}
