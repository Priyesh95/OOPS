class User {
    private String username;
    private String password;  // Never expose directly!

    // Getter
    public String getUsername() {
        return username;
    }

    // Secure Setter
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters!");
        }
    }
}
