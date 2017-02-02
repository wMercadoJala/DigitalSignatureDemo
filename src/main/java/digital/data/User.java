package digital.data;

/**
 * Created by Walter Mercado on 2/1/2017.
 */
public class User {
    public String username;
    public String password;

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString(){
        return username + "," + password;
    }
}
