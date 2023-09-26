package ex7_work;

public class HybridWaterCar extends HybridCar {
	private int waterGauge;

	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}

	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("남은 물의양 : "+this.waterGauge);
	}
	

}
