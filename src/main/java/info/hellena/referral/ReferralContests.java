package info.hellena.referral;

import java.time.LocalDateTime;

public interface ReferralContests {

    String getId();

    void setId(String id);

    LocalDateTime getStartAt();

    void setStartAt(LocalDateTime startAt);

    LocalDateTime getEndAt();

    void setEndAt(LocalDateTime endAt);
}
