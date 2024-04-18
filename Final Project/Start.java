import java.util.*;
public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		PetFoodShop pfs = new PetFoodShop();
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||| PET FOOD SHOP ||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
		boolean ch = true; //choice
		
		while(ch)
		{
		    System.out.println("1. Customer Management");
		    System.out.println("2. Staff Management");
		    System.out.println("3. Pet Food Management");
			System.out.println("4. Discount Operation");
		    System.out.println("5. Exit");
			
			System.out.println("Choose your option");
			int op = sc.nextInt(); //op=option
			
			switch(op)
			{
				case 1:
				System.out.println("-----------------------------------");
				System.out.println("---You chose customer management---");
				System.out.println("-----------------------------------");
				
		        System.out.println("1. Insert Customer");
		        System.out.println("2. Remove Customer");
		        System.out.println("3. Search Customer");
			    System.out.println("4. Show All Customers");
		        System.out.println("5. Go Baaaaack");
				
				System.out.println("   Select Your Option");
				int c1 = sc.nextInt();
				
				switch(c1) //c1=case 1
				{
					case 1:  //(inserting customer)
					System.out.println("Insert Customer");
					
					System.out.println("Enter customer name");
				    String cn = sc.next(); //customer name
				    System.out.println("Enter customer number");
				    String cno = sc.next(); //customer number
					
				    Customer c = new Customer();
				    c.setName(cn);
				    c.setPhoneN(cno);
				    pfs.insertCustomer(c);
					//c.showInfo();
				    break;
					
					case 2: //(removing customer)
					System.out.println("Remove Customer");
					
				    System.out.println("Enter customer number");
				    String cno2 = sc.next(); //c=customer number
				
				    Customer c2 = pfs.searchCustomer(cno2);
				    pfs.removeCustomer(c2);
				    break;
					
					case 3: //(Searching customer)
					System.out.println("Search Customer");
					
					System.out.println("Enter customer number");
				    String cno3 = sc.next(); //c=customer number
				
				    Customer c3 = pfs.searchCustomer(cno3);
					c3.showInfo();
				    //pfs.searchCustomer(c3);
				    break;
					
					case 4: //(showing all customers)
					System.out.println("Show All Customers");
					pfs.showAllCustomers();
					break;
					
					case 5:
					System.out.println("piche ja");
					break;
					
					default:
					System.out.println("Invalid");
					break;
				}
				break;
				
				case 2:
				System.out.println("--------------------------------");
				System.out.println("---You chose staff management---");
				System.out.println("--------------------------------");
				
		        System.out.println("1. Insert Staff");
		        System.out.println("2. Remove Staff");
		        System.out.println("3. Search Staff");
			    System.out.println("4. Show All Staffs");
		        System.out.println("5. Go Baaaaack");
				
				System.out.println("   Select Your Option");
				int c2 = sc.nextInt();
				
				switch(c2) //c2=case 2
				{
					case 1:  //(inserting Staff)
					System.out.println("Insert Staff");
					
					System.out.println("Enter staff name");
				    String sn = sc.next(); //staff name
				    System.out.println("Enter Staff ID");
				    String sID = sc.next(); //staff ID
					System.out.println("Enter Staff Salary");
				    double ss = sc.nextDouble(); //staff salary
					
				    Staff s = new Staff();
				    s.setName(sn);
				    s.setStfId(sID);
					s.setSalary(ss);
				    pfs.insertStaff(s);
				    break;
					
					case 2: //(removing Staff)
					System.out.println("Remove Staff");
					
				    System.out.println("Enter Staff ID");
				    String sID2 = sc.next(); //Staff ID
				
				    Staff s2 = pfs.searchStaff(sID2);
				    pfs.removeStaff(s2);
				    break;
					
					case 3: //(Searching Staff)
					System.out.println("Search Staff");
					
					System.out.println("Enter Staff ID");
				    String sID3 = sc.next(); //Staff ID
				
				    Staff s3 = pfs.searchStaff(sID3);
					s3.showInfo();
				    //pfs.searchStaff(s3);
				    break;
					
					case 4: //(showing all Staffs)
					System.out.println("Show All Staffs");
					pfs.showAllStaffs();
					break;
					
					case 5:
					System.out.println("piche jan");
					break;
					
					default:
					System.out.println("Invalid");
					break;
				}
				break;
				
				case 3:
				System.out.println("-----------------------------------");
				System.out.println("---You chose pet food management---");
				System.out.println("-----------------------------------");
				
				System.out.println("1. Insert Pet Food");
		        System.out.println("2. Remove Pet Food");
		        System.out.println("3. Search Pet Food");
			    System.out.println("4. Show All Pet Foods");
		        System.out.println("5. Go Baaaaack");
				
				System.out.println("   Select Your Option");
				int c3 = sc.nextInt();
				
				switch(c3)
				{
					case 1:  //(inserting pet food)
					System.out.println("Insert Pet Food");
					System.out.println("Which pet food do you want?");
					
					System.out.println("1. Cat Food");
					System.out.println("2. Dog Food");
					System.out.println("3. Go Baaaaack");
					
					PetFood pf = null; //empty pet food object
					System.out.println("   Choose your option");
					int ch1 = sc.nextInt();
					
					if(ch1==1) //cat food
					{
						System.out.println("Enter Cat Food Name");
						String cfN = sc.next();
						System.out.println("Enter price");
						double cfP = sc.nextDouble();
						System.out.println("Enter flavour");
						String cfF = sc.next();
						
						CatFood cf = new CatFood();
						cf.setFoodName(cfN);
						cf.setPrice(cfP);
						cf.setFlavour(cfF);
						
						pf = cf;
					}
					else if(ch1==2) //dog food
					{
						System.out.println("Enter Dog Food Name");
						String dfN = sc.next();
						System.out.println("Enter price");
						double dfP = sc.nextDouble();
						System.out.println("Enter if you want dry or went food");
						String dfF = sc.next();
						
						DogFood df = new DogFood();
						df.setFoodName(dfN);
						df.setPrice(dfP);
						df.setType(dfF);
						
						pf = df;
					}
					else if(ch1==3) //Going Back
					{
						System.out.println("Going Back");
					}
					else
					{
					    System.out.println("Invalid");
					}
					if(pf != null)
					{
					System.out.println("Enter Customer's Phone number");
					String pN = sc.next();
					pfs.searchCustomer(pN).insertPetFood(pf);
					}
				    break;
					
					case 2: //(removing pet food)
					System.out.println("Removing pet food");
					System.out.println("Enter customer's phone number");
					String cpn = sc.next();
					System.out.println("Enter your product/food name");
					String fn = sc.next();
					
					pfs.searchCustomer(cpn).removePetFood(pfs.searchCustomer(cpn).searchPetFood(fn));
					break;
					
					case 3:
					System.out.println("Searching for pet food");
					System.out.println("Enter customer's phone number");
					String cpn1 = sc.next();
					System.out.println("Enter your product/food name");
					String fn1 = sc.next();
					
					PetFood pf1 = pfs.searchCustomer(cpn1).searchPetFood(fn1);
					pf1.showInfo();
					break;
					
					case 4:
					System.out.println("Show All Pet Foods");
					System.out.println("Enter customer's phone number");
					String cpn2 = sc.next();
					pfs.searchCustomer(cpn2).showAllPetFoods();
					break;
					
					case 5:
					System.out.println("Going baaaack");
					break;
				}
				break;
				
				case 4:
				System.out.println("----------------------------------");
				System.out.println("---You chose Discount Operation---");
				System.out.println("----------------------------------");
				System.out.println("Enter Customer's number");
				String cno4 = sc.next();
				System.out.println("Enter Pet Food name");
				String pfn = sc.next();
				System.out.println("Enter your price");
				double p = sc.nextDouble();
				
				Customer C = new Customer();
				
				if(p > 500)
		        {
					System.out.println("u got a discount");
		        }
				break;
				
				case 5:
				System.out.println("Management exit");
				ch = false;
				break;
				default:				
				System.out.println("Invalid input");
				break;
				
		}
		
	}
}
}