package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Sukalin Ihor on 24.01.2023
 *
 * @author : Sukalin Ihor
 * date : 24.01.2023
 * project : spring5-recipe-app
 */

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
