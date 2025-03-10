package lab_14.task01;

import java.util.Map;

public class UserAccessHandler extends BaseAccessHandler {
	Map<String, String> usersAccounts;

	UserAccessHandler(Map<String, String> usersAccounts) {
		this.usersAccounts = usersAccounts;
	}

	@Override
	public void checkAccess(Account account) {
		Account.AccessType accessType = account.getAccessType();
		String userLogin = account.getLogin();
		String userPassword = account.getPassword();

		if (accessType == Account.AccessType.User) {
			String passwordFromUserStorage = usersAccounts.get(userLogin);
			if (userPassword.equals(passwordFromUserStorage)) {
				System.out.println("User access provided: " + userLogin);
			} else {
				System.out.println("Access denied: " + userLogin);
			}
		} else super.checkAccess(account);
	}
}
