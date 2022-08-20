package info.hellena.api.dto;

import java.time.LocalDateTime;

public record CommentDto(String id,
                         String content,
                         String contentHtml,
                         String createdAt,
                         String lastUpdatedAt,
                         String permalink,
                         UserDto author,
                         Boolean upvoted,
                         CommentConnectionDto children,
                         PostDto post,
                         int numUpvotes) {
}
