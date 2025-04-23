public class Customer{
    private String firstName;
    private String lasteName;
    private String email;
    public void setEmail(String newEmailAddress){
        if (newEmailAddress.length() > 0 && newEmailAddress.indexOf('@')>-1 && newEmailAddress.indexOf('.') > -1) email = newEmailAddress;
    }
}
//constructors are special methods
//defauly constructire has no parameters

public void setFirstName(String firstName){
    if(firstName.length()>=3){
        this.firstName = firstName;

    }
}