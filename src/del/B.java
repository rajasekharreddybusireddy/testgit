package del;

public class B {
public static void main(String[] args) {
	int num=5432156;
	
	int even=0;
	int odd=0;
	
	int [] evenarray = new int[10];
	int [] oddarray = new int[10];
	
	while(num>0) {
		
	
	int rem=num%10;
	
	if(rem%2==0) {
		
		evenarray[even]=rem;
		even++;
		
	}
	else {
		oddarray[odd]=rem;
		odd++;
		
	}
	
	num=num/10;
	}
	System.out.println(even+"  "+evenarray.toString());
	System.out.println(odd+"   "+oddarray.toString());

}

}
