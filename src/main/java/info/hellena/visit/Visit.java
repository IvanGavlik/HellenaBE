package info.hellena.visit;

import java.time.LocalDateTime;

public interface Visit {
    String getUserId();

    void setUserId(String userId);

    String getApp();

    void setApp(String app);

    LocalDateTime getVisitedAt();

    void setVisitedAt(LocalDateTime visitedAt);
}
