package service;

import domain.AccountInfo;

public interface UserService {

	public 	AccountInfo createNewAccount(String user, String pwd, int init);
}
