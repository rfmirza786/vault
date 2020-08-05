package JavaPackage;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {

		int a = 1;
		int b = a++;	//Post Increment
		System.out.println("a equals:" + a);	//2
		System.out.println("b equals :" + b);	//1
		
		
		int m = -1;
		int n = m++;
		System.out.println(m);		//0
		System.out.println(n);		//-1
		
		int p = 1;
		int q = ++p;  	//Pre Increment (increase value of p immediately p=2 and then give it to q=2 )		
		System.out.println(p);		//2
		System.out.println(q);		//2
		
		int l = -5;		//-4
		int u = ++l;	//-4		
		System.out.println(l);
		System.out.println(u);
		
		int h = 2;
		int g = h--;	//Post decrement		
		System.out.println(h);		//1
		System.out.println(g);		//2
		
		int x = -99;
		int y = --x;
		System.out.println(x);		//-100
		System.out.println(y);		//-100
		
		int s1 = 0;
		int s2 = --s1;
		System.out.println(s1);		//-1
		System.out.println(s2);		//-1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
