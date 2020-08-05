package JavaPackage;

public class ArrayConcept {

	public static void main(String[] args) {
		
	//Limitations of Array
	//1. size is fixed (static array). To overcome this problem, we use dynamic arrays called ArrayList or Collections
	//2. can only store similar type of values.
	//To overcome these issues we use Object array--but this is also static array(size fixed)

	//1) int array
	int i[] = new int[4]; 		//Provide how many values to store
	
	i[0]=10;					//Array index starts with 0
	i[1]=20;					//lowest index value li=0 and highest index=length-1
	i[2]=30;
	i[3]=40;
	//i[4]=50;
	
	System.out.println(i[0]);
	System.out.println(i[0]+i[1]);

	//System.out.println(i[4]); 		//ArrayIndexOutofBoundException
	
	//System.out.println([4]); 		//Total index value new int [4], Cannot have 5 values
	
	System.out.println(i.length);
	
	int len = i.length;	
	System.out.println("Highest-->" +(len-1));
	System.out.println("Lowest" +0);
	
	//Print all values use for loop:
	for(int n=0; n<len; n++){
		System.out.println(i[n]);
	}
	
	//2) Double Array
	double d[]= new double [2];
	d[0]=12.33;
	d[1]=23;			//I can store integer value in double but Cannot store double in integer.
	
	System.out.println(d[0]+ d[1]);
	
	//3) Char Array
	char c[] = new char[3];
	c[0]='a';
	c[1]='b';
	c[2]='1';
	
	System.out.println(c[0]+c[1]);			//This will give ASCI value = 195
	
	//4) String Array
	String s[] = new String [3];
	s[0]="Java";
	s[1]="Python";
	s[2]="Ruby";
	
	for(int p=0; p<s.length; p++){
	System.out.println(s[p]);
	
	}
	
	String studentNames [] = new String [4];
	
	studentNames[0]= "Radha";
	studentNames[1]="Puja";
	studentNames[2]="Soorya";
	studentNames[3]="Imad";
	
	for(int h=0; h<studentNames.length; h++){	
		if(studentNames[h].equals("Puja")){
			System.out.println("marks:	 " + 100);	
	}
		else if(studentNames[h].equals("Radha")){
			System.out.println("marks: " + 99);
		}	
	}
	
	//Object Array (Object is a class-O capital)
	//Emp details
	
	Object ob[] = new Object[5];
	ob[0]="Deepak";
	ob[1]=25;
	ob[2]=12.33;
	ob[3]='M';
	ob[4]=true;
	
	for(int v=0; v<ob.length; v++){
		System.out.println(ob[v]);
	}	
	
	}
}

