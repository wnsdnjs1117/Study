package ex4_computer;

public class ComMain {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		
		cr.com1 = new WindowsCom();
		cr.com2 = new MacCom();
		
		cr.allPowerOn();
		cr.allPowerOff();
	}
}
