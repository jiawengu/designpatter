package bootapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import bootapi.repository.AccountDao;

@Service
public class AccountService {
	private static Logger logger =LoggerFactory.getLogger(AccountService.class);
	
	private AccountDao accountDao;
	
	@Value("${app.loginTimeoutSecs:600}")
	private int loginTimeoutSecs;
	
	
}
