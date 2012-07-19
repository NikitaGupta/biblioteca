public class User {
    private String userName;
    private String passWord;
    private boolean loggedIn;

    User(String userName,String passWord,boolean loggedIn) {
        this.userName = userName;
        this.passWord = passWord;
        this.loggedIn = loggedIn;
    }

    public boolean hasUserName(String userName) {
        return this.userName.equals(userName);
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public boolean login(String password) {
        if (! this.passWord.equals(password)) throw new RuntimeException("Incorrect Password");
        loggedIn=true;
        return true;
    }
}
