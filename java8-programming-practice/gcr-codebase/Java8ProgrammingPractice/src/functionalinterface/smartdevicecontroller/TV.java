package functionalinterface.smartdevicecontroller;

public class TV implements SmartDevice{

	@Override
	public void turnOn() {
		System.out.println("TV Turned on..");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV Turned Off");
		
	}

}
