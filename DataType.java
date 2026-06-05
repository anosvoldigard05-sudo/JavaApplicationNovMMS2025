public class DataType{
	public static void main(String[] args){
		byte age =25;
		System.out.printf("You are %d years old%n", age);
		
		int quantity = 30000;
        System.out.printf("I bought %,d quantity of phones", quantity);
		
		int population = 214748364;
		System.out.printf("The population in nigeria is %,d%n",population);
		
		long worldPopulation = 7297373800000000L;
		System.out.printf("The world's population is %d%n",worldPopulation);
		
		//Float-Point
		float myBalance = 67060742.8672F;
		System.out.printf("My account balance is $%.2f%n",myBalance);
		
		double cbnBalance = 355435647753744444.477484;
		System.out.printf("The CBN balance is %.2f%n",cbnBalance);
	}
	
	
}	