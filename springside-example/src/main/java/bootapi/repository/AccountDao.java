package bootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bootapi.domain.Account;

public interface AccountDao extends JpaRepository<Account, Long>{
	
	public Account findByEmail(String email);
}
