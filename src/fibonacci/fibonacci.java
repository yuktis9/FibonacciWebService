package fibonacci;

import javax.jws.WebMethod;

public class fibonacci {
	
	public void constructor(){
		
	}
	@WebMethod
	public int fibonacci(int index){
		
	int num1 = 1;
	int num2 = 1;
	
	for(int i = 1; i<index; i++){
		int temp = num1 + num2;
		num1 = num2;
		num2 = temp;
	}
	return num2;
	}

}
