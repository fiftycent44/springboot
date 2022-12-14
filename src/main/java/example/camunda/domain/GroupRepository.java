package example.camunda.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by ashlah on 28/07/17.
 */
public interface GroupRepository extends CrudRepository<Group, String> {
	Optional<Group> findById(String id);
}
