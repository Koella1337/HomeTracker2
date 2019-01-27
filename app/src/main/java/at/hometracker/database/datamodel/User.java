package at.hometracker.database.datamodel;

/** Represents a User in the database */
public class User extends AbstractDatabaseObject {

    public int user_id;
    public String e_mail;
    public String name;
    public String password;
    public String password_salt;

    public User(String databaseResult) {
        super(databaseResult);
    }

    public User(int user_id, String e_mail, String name, String password, String password_salt) {
        this.user_id = user_id;
        this.e_mail = e_mail;
        this.name = name;
        this.password = password;
        this.password_salt = password_salt;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", e_mail='" + e_mail + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", password_salt='" + password_salt + '\'' +
                '}';
    }
}