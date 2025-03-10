package lab_14.task01;

public class BaseAccessHandler implements AccessHandler {

	private AccessHandler nextHandler;

	@Override
	public void setNext(AccessHandler next) {
		nextHandler = next;
	}

	@Override
	public void checkAccess(Account account) {
		if (nextHandler != null) {
			nextHandler.checkAccess(account);
		}
	}
}
