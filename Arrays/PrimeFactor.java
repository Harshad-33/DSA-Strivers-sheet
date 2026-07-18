public class PrimeFactor {
    public static void PrimeFactors(int n){
		for(int i=2;i*i<=n;i++){
			while(n%i==0){
				System.out.print(i+" ");
				n /=i; // n = n/i
			}
		}
		if(n>1) 
			System.out.print(n);
		
	}

	public static void main(String[] args){
		int n = 15;
		PrimeFactors(n);
	}
}
