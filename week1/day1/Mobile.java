package week1.day1;

public class Mobile {
	
public void makeCall() {
System.out.println("makeCall");	
String mobileModel = "samsung";
float mobileWeight = 191.2f;
System.out.println("mobileModel"+ mobileModel);
System.out.println("mobileWeight"+ mobileWeight);
}

public void sendMsg() {
System.out.println("sendMsg");	
boolean fullCharged = false;
System.out.println(fullCharged);
int mobileCost = 23000;
System.out.println(mobileCost);
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile object = new Mobile();
System.out.println("This is my Mobile");
//classname objectname = new class();
object.makeCall(); //method calling
object.sendMsg();	//method calling


	}

}

//ASSIGNMENT ACTIVITY 2
//- Create package name as week1.day1 under src/main/java
//- Create a  new class as "Mobile" under week1.day1
//- Create 2 methods (makeCall() , sendMsg()) with simple print statement


//- In first method create variable  mobileModel (String),mobileWeight (float)
//- In second method create variable  isFullCharged (boolean),mobileCost (int)
//- Create main method
//Create object for class and call  from main method and print them
//- print a statement---->"This is my mobile"