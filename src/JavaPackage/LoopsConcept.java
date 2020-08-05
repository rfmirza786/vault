package JavaPackage;

public class LoopsConcept {

	public static void main(String[] args) {

		//1 to 100
		
		//1) While loop:
		int i = 1;						//Initialize
		while(i<=10){					//Condition
			System.out.println(i);
			i++;						//Incremental or Decremental
		}
		
		int p=1;
		while(p<=20){
			if(p % 5 == 0){
				System.out.println("Hey");
			}			
		p++;		
	}		
		//2) for loop:
		
		for(int k=1; k<=10; k++){
		System.out.println(k);
	}		
	
		//Even Numbers
		//Print only Even numbers: 2,4,...10
		for(int even=2; even<=10; even=even+2){			//Here we start from 2 an even number and not 0
			System.out.println(even);
		}
		
		//Odd Numbers
		//Print only ODD numbers: 1,3,5,7,9
		
		 for(int odd=1; odd<10; odd=odd+2){
			 System.out.println(odd);
		 }
		 //3) do-while loop 
		 int t = 1;
		 do{
			System.out.println(t);
			t++;
		}
		 while (t<=10);		 	 
	}
}

