package info.hellena.api.dto;

import java.time.LocalDate;

public record Alerts(boolean filter,
                     LocalDate rankLastSeen,
                     String myFeed,
                     boolean companionHelper) {
}
