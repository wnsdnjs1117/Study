package ex9_interface;

public class ApplePhone implements Phone {
	int batteryCapacity = 35;
	boolean isOn = false;

	@Override
	public void powerOn() {
		if (batteryCapacity > 30) {
			System.out.println("@@@Power On!!@@@");
			isOn = true;
		} else {
			System.out.println("Low Battery...");
		}

	}

	@Override
	public void powerOff() {
		System.out.println("@@@Power Off!!@@@");

	}

	@Override
	public boolean isOn() {
		if (isOn) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void watchUtube() {
		if (batteryCapacity > 15) {
			System.out.println("---Watching Utube---");
			batteryCapacity -= 10;
			System.out.println("Battery is..." + batteryCapacity);
		} else {
			System.out.println("Low Battery...");
			powerOff();
		}

	}

	@Override
	public void charge() {
		if (batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("---Charging---");
			batteryCapacity += 10;
			System.out.println("Battery is..." + batteryCapacity + "%\n");
		} else {
			System.out.println("You don't have to charge");
			System.out.println("Battery is" + batteryCapacity + "%");
		}
	}

}
