import java.time.Duration;
import java.time.Instant;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;

public class SortComparison {
   public static void main(String[] args) {
      Random random = new Random();

      int[] array1 = random.ints(100_000_000).toArray();
      int[] array2 = array1.clone();

      System.out.println("Starting sort");
      Instant sortStart = Instant.now();
      Arrays.sort(array1);              
      Instant sortEnd = Instant.now();  

    
      long sortTime = Duration.between(sortStart, sortEnd).toMillis();
      System.out.printf("Total time in milliseconds: %d%n%n", sortTime);

      System.out.println("Starting parallelSort");
      Instant parallelSortStart = Instant.now();
      Arrays.parallelSort(array2);              
      Instant parallelSortEnd = Instant.now();  

      long parallelSortTime = 
         Duration.between(parallelSortStart, parallelSortEnd).toMillis();
      System.out.printf("Total time in milliseconds: %d%n%n", 
         parallelSortTime);

      String percentage = NumberFormat.getPercentInstance().format(
         (double) (sortTime - parallelSortTime) / parallelSortTime);                    
      System.out.printf("sort took %s more time than parallelSort%n", 
         percentage);
   }
}
