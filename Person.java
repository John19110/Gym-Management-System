package Mygym;


public abstract   class Person 
{
    protected int ID;
    protected String Name, Address, Gender, Email,PhoneNumber;
    
    public Person(int iD, String name, String address, String gender, String email, String phoneNumber) {
        ID = iD;
        Name = name;
        Address = address;
        Gender = gender;
        Email = email;
        PhoneNumber = phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    // public String getPhoneNumber() {
    //     return PhoneNumber;
    // }

    // public void setPhoneNumber(String phoneNumber) {
    //     PhoneNumber = phoneNumber;
    // }
    // public void Register() throws ParseException

    // {
    //     Scanner scanner =new Scanner(System.in);
    //     System.out.println("Enter your ID: ");
    //     int id = scanner.nextInt();
    //     scanner.nextLine();

    //     System.out.println("Enter your name: ");
    //     String name = scanner.nextLine();

    //     System.out.println("Enter your address: ");
    //     String address = scanner.nextLine();

    //     System.out.println("Enter your gender: ");
    //     String gender = scanner.nextLine();

    //     System.out.println("Enter your phone number: ");
    //     String phoneNumber = scanner.nextLine();
        
    //     System.out.println("Enter your email: ");
    //     String email = scanner.nextLine();
        
    //     System.out.println("Enter your password: ");
    //     String customerPassword = scanner.nextLine();
    //     scanner.close();

    // }
    

}
