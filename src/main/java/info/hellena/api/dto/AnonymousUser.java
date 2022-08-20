package info.hellena.api.dto;

import java.time.LocalDateTime;

public record AnonymousUser(String id,
                            LocalDateTime firstVisit,
                            String referrer,
                            boolean isFirstVisit) {
}
