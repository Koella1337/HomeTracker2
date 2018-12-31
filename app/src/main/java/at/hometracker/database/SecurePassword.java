package at.hometracker.database;

class SecurePassword {
    public final String salt;
    public final String hashedPw;

    public SecurePassword(String salt, String hashedPw) {
        this.salt = salt;
        this.hashedPw = hashedPw;
    }
}
