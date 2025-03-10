package lab_14.task01;

public class GuestAccessHandler extends BaseAccessHandler {

	@Override
	public void checkAccess(Account account) {
		if (account.getAccessType() == Account.AccessType.Guest) {
			System.out.println("Guest access provided!");
		} else super.checkAccess(account);
	}
}
