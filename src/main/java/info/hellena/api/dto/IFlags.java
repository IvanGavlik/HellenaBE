package info.hellena.api.dto;

public record IFlags(FeedVersion feed_version,
                     AdvancedSettingsDefault advanced_settings_default_values,
                     SubmitArticle submit_article_on,
                     OnBoardingVersion my_feed_onboarding_version,
                     PostCardVersion post_card_version,
                     AdditionalInteractionButton additional_interaction_button
                     ) {
    public static IFlags defaultIFlags() {
        return new IFlags(
                new FeedVersion(true, 7),
                new AdvancedSettingsDefault(true, null),
                new SubmitArticle(true),
                new OnBoardingVersion(true, "v3"),
                new PostCardVersion(true, "v1"),
                new AdditionalInteractionButton(true, "bookmark")
                );
    }
}
record FeedVersion(boolean enabled,
                   int value) {
}

record SubmitArticle(boolean enabled) {  }
record OnBoardingVersion(boolean enabled, String value) {  }
record PostCardVersion(boolean enabled, String value) {  }
record AdditionalInteractionButton(boolean enabled, String value) {  }


