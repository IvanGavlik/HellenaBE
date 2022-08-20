package info.hellena.api.dto;

import java.time.LocalDateTime;

public record UserDto(String id,
                      String name,
                      String image,
                      String username,
                      String permalink,
                      String bio,
                      String twitter,
                      String github,
                      String hashnode,
                      String createdAt,
                      Boolean infoConfirmed) {
}
