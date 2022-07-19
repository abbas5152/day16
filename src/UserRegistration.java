public class UserRegistration {

    public void registerUser(String username,String userCountry) throws InvalidCountryException {

        if(userCountry.equals("india")){
            System.out.println("User registration done successfully");
        }
        else{
            InvalidCountryException ic=new InvalidCountryException("User Outside India cannot be registered");
            throw ic;
        }
    }

    public static void main(String[] args) {
        UserRegistration r1=new UserRegistration();
        try {
            r1.registerUser("Abbas", "india");
        }
        catch (InvalidCountryException ice){
            System.out.println(ice.getMessage());
        }
    }
}
