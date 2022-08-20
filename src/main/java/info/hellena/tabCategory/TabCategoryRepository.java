package info.hellena.tabCategory;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TabCategoryRepository extends CrudRepository<TabCategoryEntity, String> {

    List<TabCategoryEntity> findAll();
}
