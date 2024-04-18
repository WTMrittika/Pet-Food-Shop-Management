interface StaffOperation
{
	public void insertStaff(Staff s);
	public void removeStaff(Staff s);
	public Staff searchStaff(String stfId);
	public void showAllStaffs();
}