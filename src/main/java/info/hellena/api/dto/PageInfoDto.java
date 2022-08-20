package info.hellena.api.dto;

public record PageInfoDto(boolean hasNextPage,
                          boolean hasPreviousPage,
                          String startCursor,
                          String endCursor) {
}
