package own.stu.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import own.stu.boot.model.Reader;

public interface ReaderRepository extends JpaRepository<Reader, String> {
}
