package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ihor Sukalin on 24.01.2023
 *
 * @author : Ihor Sukalin
 * date : 24.01.2023
 * project : spring5-recipe-app
 */

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
