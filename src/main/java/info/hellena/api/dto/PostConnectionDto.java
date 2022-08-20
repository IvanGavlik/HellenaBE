package info.hellena.api.dto;

public record PostConnectionDto(PageInfoDto pageInfo,
                                PostEdgeDto[] edges,
                                String query) {
}
