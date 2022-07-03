package algorithms;

public class FibonacciSeries {
	
	public static long recursiveFib(long n) {
		if(n <= 2)
			return 1;
		
		return recursiveFib(n-1) + recursiveFib(n-2);
	}
	
	public static long dynamicFib(int n) {
		long[] memo = new long[n+2];
		
		memo[0] = 0;
		memo[1] = 1;
		memo[2] = 1;
		
		for(int i = 3; i < n + 2; i++) {
			memo[i] = memo[i-1] + memo[i-2];
		}
		
		return memo[n];
	}
}
