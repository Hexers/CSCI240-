// Exercise 8.10 - Aleksandar Kljaic
// TrafficLight.java

public class TrafficLight 
{
	private enum trafficLight{RED, GREEN, YELLOW};
	private trafficLight status;

	public TrafficLight()
	{
		this.status = trafficLight.GREEN;
	}

	public String toString()
	{
		return String.format(this.status.toString());
	}

	public void changeStatus()
	{
		switch(this.status)
		{
			case GREEN:
				this.status = trafficLight.YELLOW;
				break;
			case YELLOW:
				this.status = trafficLight.RED;
				break;
			case RED:
				this.status = trafficLight.GREEN;
				break;
		}
	}
}