package info.hellena.api.dto;

public record TocItemDto(String text,
                         String id,
                         TocItemDto[] children) {
}
