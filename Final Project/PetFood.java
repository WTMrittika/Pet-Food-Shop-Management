public abstract class PetFood implements ITransaction
{
	public String foodName;
	public double price;
	
	public void setFoodName(String foodName)
	{
		this.foodName=foodName;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
    public String getFoodName()
	{
		return foodName;
	}
    public double getPrice()
	{
		return price;
	}
	abstract void showInfo();
	
	public void discount(double amount)
	{
		//double totalPrice;
		if(amount > 500)
		{
			double totalPrice;
			totalPrice = amount-100;
			System.out.println("After discount price: "+totalPrice);
		}
		else
			//totalPrice = amount;
			System.out.println("no discount");
	}
}