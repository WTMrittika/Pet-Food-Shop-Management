class CatFood extends PetFood
{
	private String flavour;
		
	public void setFlavour(String flavour)
	{
		this.flavour=flavour;
	}
	
	public String getFlavour()
	{
		return flavour;
	}
	
	public void showInfo()
	{
		System.out.println("Name: "+this.foodName);
		System.out.println("Price: "+this.price);
		System.out.println("Flavour: "+this.flavour);		
	}
}