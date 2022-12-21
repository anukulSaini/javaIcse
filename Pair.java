package ICSE10;

public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0;
		
//		System.out.println(isPrime(190));
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]=new int[2*n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				if((i+1)<arr.length && isPrime(arr[i+1])){
					c++;
				}
				i++;
			}
			else if(i%2==0) {
				
				i++;
				
			}
				
		}
		
			System.out.println("There are "+c+"are prime pairs");

	}

}
