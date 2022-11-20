package payroll;

public class Payroll {
	private final int NUM_WEEKS = 50;
	
	private String name;
	private double salary;
	private double[] weeklyHours;
	
	Payroll(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
		weeklyHours = new double[NUM_WEEKS];
	}
	
	Payroll(String name, double salary, int numWeeks)
	{
		this.name = name;
		this.salary = salary;
		weeklyHours = new double[numWeeks];
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public double[] getWeeklyHours()
	{
		return weeklyHours;
	}
	
	
	public double getHoursForWeek(int whichWeek)
	{
		return weeklyHours[whichWeek];
	}
	
	public double getPayForWeek(int whichWeek)
	{
		return weeklyHours[whichWeek] * salary;
	}
	
	public void setHoursForWeek(int whichWeek, double hours)
	{
		weeklyHours[whichWeek] = hours;
	}
	
	public int getTotalWeeks()
	{
		return weeklyHours.length;
	}
	
	public double totalPay()
	{
		double total = 0;
		for(int index = 0; index < weeklyHours.length; index++)
		{
			total += weeklyHours[index]*salary;
		}
		return total;
	}
	
	public double totalHours()
	{
		double totalHours = 0;
		for(int index = 0; index < weeklyHours.length; index++)
		{
			totalHours += weeklyHours[index];
		}
		return totalHours;
	}
	
	public double averagePay()
	{
		double averagePay = 0;
		for(int index = 0; index < weeklyHours.length; index++)
		{
			averagePay = totalPay()/weeklyHours.length;
		}
		return averagePay;
	}
	
	public double averageHours()
	{
		double averageHours = 0;
		for(int index = 0; index < weeklyHours.length; index++)
		{
			averageHours = totalHours()/weeklyHours.length;
		}
		return averageHours;
	}
	
	public double minHours()
	{
		double min = weeklyHours[0];
		for(int index = 0; index < weeklyHours.length; index++)
		{
			if(weeklyHours[index] < min)
				min = weeklyHours[index];
		}
		return min;
	}
	
	public double maxHours()
	{
		double max = weeklyHours[0];
		for(int index = 0; index < weeklyHours.length; index++)
		{
			if(weeklyHours[index] > max)
				max = weeklyHours[index];
		}
		return max;
	}

}
