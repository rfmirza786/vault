package AssignmentsJava;

public class Assignment1 {

	public static void main(String[] args) {

	//**********(1)*******************************************************************
		
		String wish = "Hello";
		String name = "Arif";
				
		System.out.println(wish);
		System.out.println(name);
		
	//**************(2)****************************************************************	
	
	int x = 74;
	int y = 36;	
	int TestData2 = x + y;	
	System.out.println(TestData2);
	
	//****************(3)***************************************************************
	
	int p = 50;
	int q = 3;
	int TestData3 = 50/3;
	
	System.out.println(TestData3);
	
	//***************(4)****************************************************************
	
	//a**********
	
	int num1= -5, num2=8, num3=6;
		
	int res = num1+num2*num3;
	
	System.out.println(res);
	
	//b**********
	
	int num4=55, num5=9;
	
	int res2 = (num4+num5)%num5;
	System.out.println(res2);
	
	//C**********
	
	int num6=20, num7=-3, num8=5;
	
	int res3 = num6+(num7)*num8/num2;
	
	System.out.println(res3);
	
	//d***********
	
	
	int num9=5, num10=15, num11=3, num12=2, num13 =8, num14=3;
	
	int res4 = num9+num10/num11*num12- num13 % num14;
	
	System.out.println(res4);
	
	//*************(5)************************************************************
	
	System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
	
	
	//**********************************************************************
	
	//Better way to solve the above: https://studycode.wordpress.com/2012/09/22/exercise-1/
	
	//a, b, c, d
	
	System.out.println(-5 + 8 * 6);
	
	System.out.println((55+9) % 9 );
	
	System.out.println(20 + -3*5 / 8 );
	
	System.out.println(5 + 15 / 3 * 2 - 8 % 3 );
	
	//*****************************************************************
	
	//find highest number:
			int g=76;		
			int h=98;		
			int i=78;		
			int j=60;			
			
					
			{
			if(g>h && g>i && g>j){	
				System.out.println("g is a big number: " + g);
			}
						
			
			else if(h>g && h>i && h>j){
				System.out.println("h is a big number: " + h);
			}
			
			else if(i>g && i>h && i>j){
				System.out.println("i is a big number: " + i);
			}
			else {
				System.out.println("j is a big number: " + j);
			}	
	}
}
	
}

	