
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int availablePlaneSeats = 5;
double costOfGroceries = 35.99;
char middleInitial = 'F';
boolean isHotOutside = true;
String firstName = "Jess";
String streetAddress = "19 Salem Road";
System.out.println("Available seats left on the plane:" + availablePlaneSeats);
System.out.println("Cost of Groceries:" + costOfGroceries);
System.out.println(middleInitial + " " + "is the middle initial");
System.out.println(isHotOutside);
System.out.println(firstName);
System.out.println(streetAddress);

availablePlaneSeats = availablePlaneSeats - 2;
availablePlaneSeats -= 2;
System.out.println(availablePlaneSeats);

costOfGroceries += 2.15;
System.out.println(costOfGroceries);

middleInitial ='J';
System.out.println(middleInitial);

isHotOutside = !isHotOutside;
System.out.println(isHotOutside);

String fullName = firstName + " " + middleInitial + " Smith";
System.out.println(fullName);
System.out.println("Hi, my name is " + fullName + " and I live at " + streetAddress);
	}

}
