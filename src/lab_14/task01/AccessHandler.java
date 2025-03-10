package lab_14.task01;

public interface AccessHandler {
	void setNext(AccessHandler next);
	void checkAccess(Account account);
}
