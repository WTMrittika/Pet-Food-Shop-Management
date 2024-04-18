class Customer
{	
    private String name;
    private String phoneN;
    PetFood petFoods[]=new PetFood[100];
 
 
    public void setName(String name)
	{
		this.name=name;
	}
    public void setPhoneN(String phoneN)
	{
		this.phoneN=phoneN;
	}
 
    public String getName()
    {
	   return name;
	}
    public String getPhoneN()
    {
	   return phoneN;
	}
	
	public void insertPetFood(PetFood p)
	{
		int fg = 0;
		for(int i=0; i<petFoods.length; i++)
		{	
			if(petFoods[i] == null)
			{
				petFoods[i] = p; //problem
				fg = 1;
				break;
			}
		}
		if(fg==1)
		{
			System.out.println("Pet Food inserted");
		}
	}
	public void removePetFood(PetFood p)
	{
		int fg = 0;
		for(int i=0; i<petFoods.length; i++)
		{
			if(petFoods[i] == p)
			{
				petFoods[i] = null; //problem
				fg = 1;
				break;
			}
		}
		if(fg==1)
		{
			System.out.println("Pet Food removed");
		}
	}
	
	public PetFood searchPetFood(String foodName)
	{
		for(int i=0; i<petFoods.length; i++)
		{
			if(petFoods[i] != null)
			{
				if(petFoods[i].getFoodName() == (foodName))
				{
					return petFoods[i];
				}
			}
		}
		return null;
	}
	public void showAllPetFoods()
	{
		//System.out.println("   Pet Food Information");
	    for(int i=0;i<petFoods.length;i++)
		{
			if(petFoods[i] != null)
			{
				System.out.println("   Pet Food Information");
				petFoods[i].showInfo();
		    }
		}
	}
	public void showInfo()
	{
		System.out.println("Customer's Name: "+name);
		System.out.println("Customer's Phone No.: "+phoneN);
	}
}