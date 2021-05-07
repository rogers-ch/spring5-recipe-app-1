package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cr on 05/07/2021
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
