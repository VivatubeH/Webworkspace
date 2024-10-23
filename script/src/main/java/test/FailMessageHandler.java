package test;

public class FailMessageHandler extends SuccessMessageHandler {

	@Override
	public void showMessage() {
		System.out.println("불합격입니다.");
	}
}
