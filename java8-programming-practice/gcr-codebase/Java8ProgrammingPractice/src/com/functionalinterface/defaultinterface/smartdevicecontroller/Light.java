package functionalinterface.smartdevicecontroller;

public class Light implements SmartDevice{
	@Override
	public void turnOn() {
		System.out.println("Light Turned on..");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Light Turned Off");
		
	}

}
