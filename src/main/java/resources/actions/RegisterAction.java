package resources.actions;
  
public class RegisterAction {  
private String name,password,email,gender,country;  
  
//setters and getters  
public String execute(){  
    int i=RegisterDao.save(this);
    if(i>0){  
    return "success";  
    }  
    return "error";  
}

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }


    public String getCountry() {
        return country;
    }
}