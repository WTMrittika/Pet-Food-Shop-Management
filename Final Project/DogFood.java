class DogFood extends PetFood
{
	public String type;
	
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	public void showInfo()
	{
		System.out.println("Name: "+this.foodName);
		System.out.println("Price: "+this.price);
		System.out.println("Type: "+this.type);
	}
}