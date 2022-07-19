import java.util.Random;

public class TestDemo {
//	If both parameters are positive (greater than zero) 
//	return the sum of the parameters. 
//			If either parameter is zero or negative, 
//			throw an IllegalArgumentException with the message 
//			"Both parameters must be positive!".
//			IllegalArgumentException is in the java.lang package so you won't need an import statement.
	
	public int addPositive(int a, int b) {
		if(a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		return a + b;
	}
	
	public int randomNumberSquared() {
		int a = getRandomInt();
		return a * a;
	}

	public int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
}