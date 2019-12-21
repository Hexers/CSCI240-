// Exercise 8.10 - Aleksandar Kljaic
// TrafficLightTest.java

public class TrafficLightTest 
{
	public static void main(String[] args) 
	{
		TrafficLight t = new TrafficLight();
		System.out.println("TrafficLight is " + t);
		t.changeStatus();
		System.out.println(t + " light is displayed, hurry up!");
		t.changeStatus();
		System.out.println("TrafficLight now is " + t + " , please stop and wait...");
		t.changeStatus();
		System.out.println("TrafficLight now is " + t + " again.");
	}
}
