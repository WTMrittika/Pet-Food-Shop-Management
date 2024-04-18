class Staff
{
	public String name;
	public String stfId;
	public double salary;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setStfId(String stfId)
	{
		this.stfId=stfId;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public String getName()
	{
		return name;
	}
	public String getStfId()
	{
		return stfId;
	}
	public double getSalary()
	{
		return salary;
	}
	public void showInfo()
	{
		System.out.println("Staff's Name: "+name);
		System.out.println("Staff's ID: "+stfId);
	}

}
	
	
