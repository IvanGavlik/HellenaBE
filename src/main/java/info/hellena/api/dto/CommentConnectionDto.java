package info.hellena.api.dto;

public record CommentConnectionDto(PageInfoDto pageInfo,
                                   CommentEdgeDto[] edges) {
}
