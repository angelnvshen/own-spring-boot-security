package own.stu.boot.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import own.stu.boot.model.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByReader(String reader);

}
