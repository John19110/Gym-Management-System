package gym;

import java.util.List;

public class Admin 
{
	private Gym gym;
	
	public Admin(Gym gym)
	{
		this.gym = gym;
		
	}
	
	public void addCoach(Gym gym , Coach coach)
	{
		gym.addCoach(coach);
		
	}
	public void editCoach(Gym gym, Coach coach, String newName, String newPhoneNumber) 
	{
        coach.setName(newName);
        coach.SetPhoneNumber(newPhoneNumber);
        System.out.println("Coach details edited successfully.");
	
	
	}
	public void deleteCoach(Gym gym , Coach coach)
	{
		gym.removeCoach(coach);
	}

	public void addEquipment(Gym gym, Equipment equipment)
     {
        gym.addEquipment(equipment);
       
    }

  
    public void editEquipment(Gym gym, Equipment equipment, String newEquipmentName, int newQuantity) 
    {
        equipment.setEquepmentName(newEquipmentName);
        
        equipment.setQuantity(newQuantity);
      
    }


    public void deleteEquipment(Gym gym, Equipment equipment) {
        gym.removeEquipment(equipment);
        
    }

    public void showAllTheSubscriptions(Gym gym) 
    {
        gym.displaySubscriptions();
    }

    public void displayCustomersByCoach(Gym gym , Coach coach)
     {
        System.out.println("Customers is with  coach " + coach.getName() + ":");
        List<Customer> customers = gym.getCustomers();
        for (int i = 0; i < customers.size(); i++) 
        {
            Customer customer = customers.get(i);
            if  (customer.getAssignedCoach() == coach)
            {
                System.out.println(customer.getName());
            }
        }
    }

    public  static void displayIncome(int month, int year,Gym gym) {
        System.out.println("gym income  " + month + ", " + year + ":");
        List<Customer> customers = gym.getCustomers();
        double totalIncome = 0;
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getAssignedMonth() == month && customer.getAssignedYear() == year) {
                totalIncome += customer.getMonthlyFee();
            }
        }
        System.out.println( totalIncome);
    }
}

