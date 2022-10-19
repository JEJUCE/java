public class 3 {

private int daysPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,

30, 31 };

private int month; // 1-12

private int day; // 1-31 based on month

private int year; // 1950 - 2012

// constructor:

// call checkMonth to confirm proper value for month

// call checkYear to confirm proper value for year

// call checkDay to confirm proper value for day

public EnhancedDate(int theMonth, int theDay, int theYear) {

month = checkMonth(theMonth); // validate month

year = checkYear(theYear); // could validate year

day = checkDay(theDay); // validate day

System.out.printf("Date object constructor for date %sn", this);

}

private int checkYear(int testYear) {

if (testYear >= 1950 && testYear <= 2012)

return testYear;

else {

System.out.printf("Invalid year (%d) set to 1950.", testYear); // validate

// year

return 1950;

}

}

// utility method to confirm proper month value

private int checkMonth(int testMonth) {

if (testMonth > 0 && testMonth <= 12) // validate month

return testMonth;

else // month is invalid

{

System.out.printf("Invalid month (%d) set to 1.", testMonth);

return 1;

}

}

// utility method to confirm proper day value based on month and year

private int checkDay(int testDay) {

// check if day in range for month

if (testDay > 0 && testDay <= daysPerMonth[month])

return testDay;

// check for leap year

if (month == 2 && testDay == 29

&& (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))

return testDay;

System.out.printf("Invalid day (%d) set to 1.", testDay);

return 1;

}

private void nextDay() {

if (day == 28 && month == 2 && year % 400 == 0) {

day += 1;

} else if (day >= daysPerMonth[month]) {

nextMonth();

 

} else

day += 1;

}

private void nextMonth() {

if (month == 12) {

nextYear();

} else {

month += 1;

day = 1;

}

}

private void nextYear() {

year += 1;

month = 1;

day = 1;

}

// return a String of the form month/day/year

public String toString() {

return String.format("%d/%d/%d", month, day, year);

}

public static void main(String[] args) {

EnhancedDate d1 = new EnhancedDate(12, 30, 2000);

for (int i = 0; i < 10; i++) {

d1.nextDay();

System.out.println(d1.toString());

}

} // end main()

}