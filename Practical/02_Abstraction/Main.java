// Feature	                    private	protected
// Access in the same class	    ✅ Yes	✅ Yes
// Access in the same package	❌ No	✅ Yes
// Access in subclasses 
// (even outside package)	    ❌ No	✅ Yes
// Inheritance allowed?    	    ❌ No	✅ Yes
// Use Case	                    Data hiding (Encapsulation)	Inheritance (Subclasses)


// Abstract class defining common behavior
abstract class User{
    protected String username;

    public User(String username){
        this.username = username;
    }

    abstract void login();
    abstract void logout();
}

// Interface enforcing authorization rules
interface Authorizable{
    void grantPermission();
}

class AdminUser extends User implements Authorizable{

    public AdminUser(String username){
        super(username);
    }

    @Override
    void login() {
        System.out.println(username + " logged in as Admin.");
    }

    @Override
    void logout() {
        System.out.println(username + " logged out.");
    }

    @Override
    public void grantPermission() {
        System.out.println(username + " granted system permissions.");
    }

}

public class Main{
    public static void main(String[] args){
        AdminUser user = new AdminUser("John");
        user.login();
        user.grantPermission();
        user.logout();
    }
}

