package week12_02;

public class loopstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 0;
	int sum = 0;
	
	do {
		sum +=a;
		System.out.println("Sum ="+sum);
		a++;
	} while (a<5);
	
	//add values using Forstatement
	for(int i=0; i<10; i++) {
		sum+=i;
		System.out.println("Sum ="+sum);
	}
	
	for(int i = 0; i>-10; i--) {
		sum+= i;
		System.out.println("Sum ="+sum);
	}
	
	for(int i = 0; i<10; i++) {
		sum += i;
		System.out.println("Sum =" +sum);
		if(i==5) {
			break;
		}
	}
	
	for(int i=0; i<10; i++) {
		sum = sum+i;
		
		if(i==1) {
			continue;
		}
		System.out.println("Sum ="+ sum);
	}
	
	for(int i=1; i<10; i++) {
		for(int k=i; k<10; k++) {
			if(k==2) {
				break;
			}
		System.out.println(i +"*" + k + " = " + i*k);
		}
	}
	
	for(int i = 1; i<10; i++) {
		for(int k=1; k<10; k++) {
			if(k==2) {
				continue;
			}
		System.out.println(i + "*" + k + "=" + i*k);
		}
	}
	}

}
