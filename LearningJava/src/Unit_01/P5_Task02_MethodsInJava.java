package Unit_01;

public static void main(String[] args) {
	 ABC3 obj = new ABC3();
		
	 //Calling display method definition
	 obj.display();
	 System.out.println(obj.a);
	 }

	}
	class ABC3{
	 static int a=10;
	 /*Actual method definition
	  DataType methodName(DataType p1,DataType p2){
	  methodBody;
	  return value //if required
	  }
	  */
	 static void display() { 
	  int b = 10;
	  int a = 10; 
	  System.out.println(b); 
	  System.out.println(a); 
	 }