public class GenericMethodTest {
	public static void main(String[] args) {
		
		Integer[] integerArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
		Character[] characterArray = {'H','E'};
		
		System.out.print("contains: ");
		printArray(integerArray);
		System.out.print("contains: ");
		printArray(doubleArray);
		System.out.print("contains: ");
		printArray(characterArray);
	}

	private static <T> void printArray(T[] inputArray) {
		for(T element : inputArray) {
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
}
