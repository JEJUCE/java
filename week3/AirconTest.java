package week3;

public class AirconTest {
	
	
	public static void main(String[] args) {
		
		Aircon airCon1 = new Aircon();
				
		airCon1.color = "white";
		airCon1.temp = 10;
		airCon1.price = 10000;
		
		airCon1.tempUp();
		System.out.printf("airCon1의 색상 : %s, 현재기온 : %d, 가격: %d\n", airCon1.color, airCon1.temp, airCon1.price);
		
		airCon1.tempDown();
		System.out.printf("airCon1의 색상 : %s, 현재기온 : %d, 가격: %d\n", airCon1.color, airCon1.temp, airCon1.price);
						 
		 
		 
		 
	 }
}
