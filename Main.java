package payroll;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Payroll employee = new Payroll("JHON",500,50);
		Random random = new Random();
		double[] hours = employee.getWeeklyHours();
		
		for(int index = 0; index < hours.length; index++)
		{
			hours[index] = random.nextInt(11)+40;
		}
		
		

		displayEmployeeReport(employee);
	}
	
	private static void displayEmployeeReport(Payroll employee) {
		System.out.println("EMPLOYEE REPORT");
		System.out.printf("%-9s%27s\n","Employee: ", employee.getName());
		System.out.printf("%-19s%17d\n\n","Total Weeks Worked: ", employee.getTotalWeeks());
		System.out.printf("%-10s%29.2f\n","Total Pay: ",employee.totalPay());
		System.out.printf("%-12s%27.2f\n\n","Average Pay: ", employee.averagePay());
		System.out.printf("%-12s%27.2f\n","Total Hours: ", employee.totalHours());
		System.out.printf("%-14s%25.2f\n","Average Hours: ", employee.averageHours());
		System.out.printf("%-12s%27.2f\n","Least Hours: ", employee.minHours());
		System.out.printf("%-11s%28.2f\n\n","Most Hours: ", employee.maxHours());
	}

}
