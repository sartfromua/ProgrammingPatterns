package lab_14.task01;

import java.util.Map;

public class AdminAccessHandler extends BaseAccessHandler {
	Map<String, String> adminsAccounts;

	AdminAccessHandler(Map<String, String> adminsAccounts) {
		this.adminsAccounts = adminsAccounts;
	}

	@Override
	public void checkAccess(Account account) {
		if (account.getAccessType().equals(Account.AccessType.Administrator)) {
			String userLogin = account.getLogin();
			String userPassword = account.getPassword();
			String passwordFromAdminsStorage = adminsAccounts.get(userLogin);
			if (userPassword.equals(passwordFromAdminsStorage) && userPassword.length() >= 8) {
				System.out.println("Administrator access provided: " + userLogin);
			} else {
				System.out.println("Access denied: " + userLogin);
			}
		} else super.checkAccess(account);
	}
}