
class TestUserRegistration {

    public static void main(String[] args) {
        
     UserRegistration user1 = new UserRegistration("Kiran" , "kiran@gmail.com" , 636647195L,"kiran@855500");
     UserRegistration user2 = new UserRegistration("Kiran" ,  63664722195L,"kiran@855500");
     UserRegistration user3 = new UserRegistration("Kiran" , "kiran@gmail.com" , "kiran@855500");
        
     
     user1.details();
         user2.details();
         user3.details();
    }
}

// output:
// Username :Kiran
// Email :kiran@gmail.com
// Phone Number  :636647195
// Password :kiran@855500
// Username :Kiran
// Email :null
// Phone Number  :63664722195
// Password :kiran@855500
// Username :Kiran
// Email :kiran@gmail.com
// Phone Number  :0
// Password :kiran@855500