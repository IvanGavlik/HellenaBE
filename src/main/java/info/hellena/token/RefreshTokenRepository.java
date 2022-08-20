package info.hellena.token;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends CrudRepository<RefreshTokenEntity, String> {

    Optional<RefreshTokenEntity> findByToken(String token);
}
