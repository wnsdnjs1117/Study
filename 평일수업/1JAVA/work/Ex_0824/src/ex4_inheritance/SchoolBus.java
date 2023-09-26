package ex4_inheritance;

public class SchoolBus extends Bus {

	public SchoolBus(int peopleNum) {
		super(peopleNum);
	}

	@Override
	public void takePerson() {
		super.takePerson();
	}

	@Override
	public void ride() {
		System.out.println("시속 50km/h으로 천천히 달립니다.");
	}

}
