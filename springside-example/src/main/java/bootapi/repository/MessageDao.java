package bootapi.repository;

import org.springframework.data.repository.CrudRepository;

import bootapi.domain.Message;

public interface MessageDao extends CrudRepository<Message, Long>{
	
}
