import java.util.ArrayList;
import java.util.List;

public class 2 {
   public static void main(String[] args) {
 
      Number[] numbers = {1, 2.4, 3, 4.1}; 
      List<Number> numberList = new ArrayList<>();           

      for (Number element : numbers) {
         numberList.add(element); 
      }

      System.out.printf("numberList contains: %s%n", numberList);
      System.out.printf("Total of the elements in numberList: %.1f%n", 
         sum(numberList));
   }

 
   public static double sum(List<Number> list) {
      double total = 0; 

  
      for (Number element : list) {     
         total += element.doubleValue();
      }                                 

      return total;
   }
}

