package functionalinterface.smartdevicecontroller;

public class AC implements SmartDevice{
	@Override
	public void turnOn() {
		System.out.println("AC Turned on..");
		
	}

	@Override
	public void turnOff() {
		System.out.println("AC Turned Off");
		
	}

}
