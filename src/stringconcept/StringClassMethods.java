package stringconcept;

public class StringClassMethods {
	
	public static void main(String[] args) {
		String str="Java Automation 123";
		
		/**
		 * 1. length()
		 * for counting number of characters
		 * return data type is int
		 */
		System.out.println("length="+str.length());
		
		/**
		 * 2. charAt()
		 * to fetch particular character from string
		 * return  data type is char
		 */
		System.out.println(str.charAt(1)); //output= a
		
		/**
		 * 3. toUpperCase()
		 * to Capital all characters  e.g. a>>A
		 * return data type is String
		 */
		System.out.println(str.toUpperCase());
		
		/**
		 * 4. toLowerCase()
		 * to small letter all characters  e.g. A >>>a
		 * return data type is String
		 */
		System.out.println(str.toLowerCase());
		
		/**
		 * 5. equal()
		 * for comparing 2 objects
		 * return data type is boolean
		 */
		System.out.println(str.equals("Java")); 
		
		/**
		 * 6. contains()
		 * for checking some character available or not in string
		 * return data type is boolean
		 */
		System.out.println(str.contains("java"));
		
		/**
		 * 7. split()
		 * pass regular expression for splitting string
		 * return data type is String[]
		 */
		System.out.println(str.split(" "));
		
		/**
		 * 8. replace()
		 * use for changing/replacing characters
		 * return data type is String
		 */
		System.out.println(str.replace("java", "XYZ"));
		
		/**
		 * 9. replaceAll()
		 * for replacing character and also we can take particular value using regular expression
		 * return data type is String
		 */
		System.out.println(str.replaceAll("\\D", "")); //output only numbers=123
		
		/**
		 * 10. startWith() and endWith()
		 * for checking string from where started and ended
		 * return data type is boolean
		 */
		System.out.println(str.startsWith("Java"));//output=true
		System.out.println("123");//output =true
		
	}

}
