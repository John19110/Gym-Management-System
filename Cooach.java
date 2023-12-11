// package gym;
// import java.util.Scanner;

// class InvalidRangeException extends Exception
//  {
    
//     public InvalidRangeException(String message) 
//     {
//         super(message);
//     }
// }
// public class Coach extends Person 

// {
//     int working_Hours_Per_Day;

//     public Coach(int iD, int phoneNumber, String name, String address, String gender, String email,
//             int working_Hours_Per_Day) 
//       {
//         super(iD, phoneNumber, name, address, gender, email);
//         this.working_Hours_Per_Day = working_Hours_Per_Day;
        
    
        
//     }
//         try
//         {
//             System.out.println("Enter number of working hours (MAX : 10)");
//             Scanner input=new Scanner(System.in);
//             working_Hours_Per_Day=input.nextInt();
//         }
            
//         catch(InvalidRangeException e )
        
//         {
//             System.out.println(e.getMessage());}
        
        
//             private void checkRange(int working_Hours) throws InvalidRangeException {
//                 if (working_Hours > 10 || working_Hours < 1) {
//                     throw new InvalidRangeException("Renter the number of working hours (between 1 : 10)");
//                 }
//             }
// }
