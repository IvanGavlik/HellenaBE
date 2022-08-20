package info.hellena.token;

import java.time.LocalDateTime;

public interface RefreshToken {

    String getToken();

    void setToken(String token);

    String getUserId();

    void setUserId(String userId);

    LocalDateTime getCreatedAt();

    void setCreatedAt(LocalDateTime createdAt);
}
