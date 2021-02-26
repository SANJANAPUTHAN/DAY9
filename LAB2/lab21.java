package LAB2;

public class lab21 {
public static void main(String[] args) {
	
	//program21
		 		 boolean a = true, b = false ;
				 boolean c = a | b; 
				 boolean d = a & b; 
				 boolean  e = a ^ b; 
				 boolean f = (! a & b) | (a &! b); 
				 boolean g =! a; 
				 System.out.println(c+" "+d+" "+e+" "+f+" "+g);
	//program22
				 int a1=20;
				 int b1=10;
				 int x=a1>b1 ? a1 :b1;
				 System.out.println(x);
				 
	//program23
				 float pi=3.14f;
				 float radius=5;
				 float area=((pi)*(radius)*(radius))+((float)(2)*(pi)*(radius));
				 System.out.println(area);
				 
}
}
/*21. a = true, b = false 
c = a | b; 
d = a & b; 
e = a ^ b; 
f = (! a & b) | (a &! b); 
g =! a;  
What is the value of c, d, e, f, and g? 


22. a = 20; b = 10; 
x = a>b? a:b; 
What is the value of x? 
a. 10 
b. 20 
c. 30 
23. Write Java assignment statements to evaluate the following equations. 
a. Area = r2 + 2rh 
b. Energy = mass (acceleration*height +velocity2/2) */