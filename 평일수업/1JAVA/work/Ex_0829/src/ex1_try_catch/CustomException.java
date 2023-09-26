package ex1_try_catch;

public class CustomException extends Exception{
	private String message;
	public CustomException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}