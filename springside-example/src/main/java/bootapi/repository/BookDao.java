package bootapi.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import bootapi.domain.Book;

public interface BookDao extends PagingAndSortingRepository<Book, Long>{
	public List<Book> findByOwnerId(Long ownerId, Pageable pageable);
	public List<Book> findByBorrowerId(Long borrowerId, Pageable pageable);
}
