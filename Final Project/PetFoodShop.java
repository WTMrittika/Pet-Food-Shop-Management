public class PetFoodShop implements StaffOperation, CustomerOperation
{
	Customer customers[] = new Customer[100];
	Staff staffs[] = new Staff[100];
	
	public void insertCustomer(Customer c)
	{
		int fg = 0;
		for(int i=0; i<customers.length; i++)
		{	
			if(customers[i] == null)
			{
				customers[i] = c;
				fg = 1;
				break;
			}
		}
		if(fg==1)
		{
			System.out.println("Customer inserted");
		}
	}
	public void removeCustomer(Customer c)
	{
		int fg = 0;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c)
			{
				customers[i] = null;
				fg = 1;
				break;
			}
		}
		if(fg==1)
		{
			System.out.println("Customer removed");
		}
	}
	public Customer searchCustomer(String phoneN)
	{
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getPhoneN().equals(phoneN))
				{
					return customers[i];
				}
			}
		}
		return null;
	}
	public void showAllCustomers()
	{
	    for(int i=0;i<customers.length;i++)
		{
			if(customers[i] != null)
			{
				System.out.println("   Customer Information");
				customers[i].showInfo();
				customers[i].showAllPetFoods();
		    }
		}
	}
	
	public void insertStaff(Staff s)
	{
		int fg = 0;
		for(int i=0; i<staffs.length; i++)
		{	
			if(staffs[i] == null)
			{
				staffs[i] = s;
				fg = 1;
				break;
			}
		}
		if(fg==1)
		{
			System.out.println("Staff inserted");
		}
	}
	public void removeStaff(Staff s)
	{
		int fg = 0;
		for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] == s)
			{
				staffs[i] = null;
				fg = 1;
				break;
			}
		}
		if(fg==1)
		{
			System.out.println("Staff removed");
		}
	}
	public Staff searchStaff(String stfId)
	{
			for(int i=0; i<staffs.length; i++)
		{
			if(staffs[i] != null)
			{
				if(staffs[i].getStfId() == (stfId))
				{
					return staffs[i];
				}
			}
		}
		return null;
	}
	public void showAllStaffs()
	{
	    for(int i=0;i<staffs.length;i++)
		{
			if(staffs[i] != null)
			{
				System.out.println("   Staff Information");
				staffs[i].showInfo();
		    }
		}
	}
}
	