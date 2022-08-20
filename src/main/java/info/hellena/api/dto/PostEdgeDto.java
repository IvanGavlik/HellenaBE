package info.hellena.api.dto;

public record PostEdgeDto(
        PostDto node,
        String cursor) {
}
