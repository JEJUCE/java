package week3;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 =new Employee("Hyunju", "Yang");
		Employee employee2 =new Employee("minji", "Kim");
		System.out.printf("%s %s", employee1.getName(), employee1.getLastName());
		System.out.printf("%s %s", employee2.getName(), employee2.getLastName()
				);
		System.out.println("Yearly salaries with a 10% raise\n");
		System.out.printf("%s %s ", employee1.getName(), employee1.getLastName());
		System.out.printf("%s %s", employee2.getName(), employee2.getLastName());
	}
}