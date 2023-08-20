class PersonEager {
    private static final PersonEager instance = new PersonEager();

    private int autoId;
    private String username;
    private String password;
    private String gender;

    private PersonEager() {
       autoId=2;
      username="abc";
      password="123";
      gender="male";
    }

    public static PersonEager getInstance() {
      if(instance==null)
      {
        PersonEager instance = new PersonEager();
    }
return instance;
}
}
class Main {
    public static void main(String[] args) {
        // Creating an instance of the class
        PersonEager person = PersonEager.getInstance();

    
       
}
}