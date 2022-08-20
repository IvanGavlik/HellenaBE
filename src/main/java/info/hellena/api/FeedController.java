package info.hellena.api;

import info.hellena.api.dto.*;
import info.hellena.settings.AdvancedSettings;
import info.hellena.settings.SettingsService;
import info.hellena.tabCategory.TabCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class FeedController {

    private final TabCategoryService tabCategoryService;
    private final SettingsService settingsService;

    @Autowired
    public FeedController(TabCategoryService tabCategoryService, SettingsService settingsService) {
        this.tabCategoryService = tabCategoryService;
        this.settingsService = settingsService;
    }

    @QueryMapping
    public PostConnectionDto anonymousFeed(@Argument LocalDateTime now, @Argument String after, @Argument int first, @Argument Ranking ranking, @Argument FiltersInputDto filters, @Argument Integer version) {
        if (version == null) {
            version = 1;
        }

        if (version >= 2 && Ranking.POPULARITY.equals(ranking)) {
            System.out.println("anonymousFeed version 2");
//            return feedResolverV2();
        }
        System.out.println("anonymousFeed version 1");
//        return anonymousFeedResolverV1(source, args, ctx, info);
        return def();
    }

    private PostConnectionDto def() {
        PageInfoDto pageInfoDto = new PageInfoDto(true, false, null, "YXJyYXljb25uZWN0aW9uOjE2");
        PostEdgeDto[] postEdgeDtos = new PostEdgeDto[0];
        PostConnectionDto postConnectionDto = new PostConnectionDto(pageInfoDto, postEdgeDtos, null);
        return postConnectionDto;
    }

    @QueryMapping
    public List<TagsCategory> tagsCategories() {
        System.out.println("radi  3 :) ");
        return this.tabCategoryService.getAll().stream()
                .map(el -> new TagsCategory(
                        el.getId(), el.getEmoji(), el.getTitle(), new String[] {"Geeks", "for", "Geeks"}
                ))
                .collect(Collectors.toList());
    }

    @QueryMapping
    public List<AdvancedSettings> advancedSettings() {
        return this.settingsService.getFeatureAdvancedSettings(true);
    }

}


