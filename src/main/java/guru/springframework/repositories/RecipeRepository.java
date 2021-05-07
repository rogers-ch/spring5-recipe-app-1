package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by cr on 05/07/2021
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
