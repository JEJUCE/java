public class 2 {
	private int month; // 1 ~ 12
	private int day; // daysPerMonth
	private int year;// Not Negative Number
	
	private static final int[] daysPerMonth = 
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date(int month, int day, int year) {
		if(month<=0||month>12) { 
			throw new IllegalArgumentException(
					"month("+month+")must be 1-12");
		}
		
		if(day <=0|| day>daysPerMonth[month] && !(month == 2 && day ==29)) {
			throw new IllegalArgumentException("day("+day+")out-of range for the specified month year");
		}
		
		if(month == 2 && day == 29 && !(year%400 == 0||(year%4 == 0 && year % 100 !=0))){
			throw new IllegalArgumentException("day("+day+")out-of range for the specified month year");
		}
		
		if(year<0) {
			throw new IllegalArgumentException("day("+day+")out-of range for the specified month year");
		}
		
		this.month = month;
		this.day= day;
		this.year = year;
			
		System.out.printf("Date object construtor for date %s%n", this);
		
		}
		public String toString() {
			return String.format("%d/%d/%d", month, day, year);
		}
		
		private void nextDay() {
			if (day == 28 && month == 2 && (year%400 == 0||(year%4 == 0 && year % 100 !=0))) {
			day += 1;
			} 
			
			else if (day >= daysPerMonth[month]) {
			nextMonth();
			} 
			
			else {
			day += 1;
			}
		}

		private void nextMonth() {
			if (month == 12) {
				nextYear();
			} 
			
			else {
				month += 1;
				day = 1;
				}
		}

		private void nextYear() {
			year += 1;
			month = 1;
			day = 1;
			}

		 
		public static void main(String[] args) { // 연수 증가 확인
			System.out.println("Checking Year");
			Date increase = new Date(12, 30, 1999);
			for (int i = 0; i < 3; i++) {
				increase.nextDay();
			System.out.println(increase.toString());
			}
			
			System.out.println("Checking Lear Year");
			Date increase2 = new Date(2, 27, 2020);
			for (int i = 0; i < 3; i++) { // 윤년 확인
				increase2.nextDay();
			System.out.println(increase2.toString());
			}
			
			Date increase3 = new Date(2, 27, 2021);
			for (int i = 0; i < 3; i++) { // 윤년 확인
				increase3.nextDay();
			System.out.println(increase3.toString());
			}
			
			System.out.println("Checking Day&Month 30 & 31 ");
			Date increase4 = new Date(4, 28, 2022);
			for (int i = 0; i < 3; i++) { // 30일 까지인 달 확인
				increase4.nextDay();
			System.out.println(increase4.toString());
			}
			
			Date increase5 = new Date(3, 29, 2022);
			for (int i = 0; i < 3; i++) { //31일 까지인 달 확인
				increase5.nextDay();
			System.out.println(increase5.toString());
			}
			
		}
		
}	


