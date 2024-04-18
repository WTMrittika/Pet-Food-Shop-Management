interface CustomerOperation
{
	public void insertCustomer(Customer c);
    public void removeCustomer(Customer c);
    Customer searchCustomer(String phoneN);
    public void showAllCustomers();
}