package ex7_work;

public class HybridCar extends Car {
	private int electricGauge;

	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
	}

	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("남은 전기량 : "+this.electricGauge);
	}


	}

