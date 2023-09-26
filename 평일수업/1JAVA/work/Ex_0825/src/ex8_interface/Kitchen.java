package ex8_interface;

public class Kitchen implements Menu1 /* , Menu2, Menu3 */ {

	@Override
	public String bokkembab() {
		return "쌀 + 짜장 + 계란";
	}

	@Override
	public String tangsuyuk() {
		return "돼지고기 + 양념 + 당근";
	}

	@Override
	public String jajjang() {
		return "중명 + 짜장 + 완두콩";
	}
	
}
