package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Sukalin Ihor on 24.01.2023
 *
 * @author : Sukalin Ihor
 * date : 24.01.2023
 * project : spring5-recipe-app
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
