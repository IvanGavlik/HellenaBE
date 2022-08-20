package info.hellena.settings;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdvancedSettingsRepository extends CrudRepository<AdvancedSettingsEntity, String> {
    List<AdvancedSettingsEntity> findAll();
}
