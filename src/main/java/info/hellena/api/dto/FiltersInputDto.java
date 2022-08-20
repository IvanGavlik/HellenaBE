package info.hellena.api.dto;

public record FiltersInputDto(String[] includeSources,
                              String[] excludeSources,
                              String[] includeTags,
                              String[] blockedTags) {
}
