package info.hellena.tabCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TabCategoryService implements TabCategoryDomain {

    private TabCategoryRepository tabCategoryRepository;

    @Autowired
    public TabCategoryService(TabCategoryRepository tabCategoryRepository) {
        this.tabCategoryRepository = tabCategoryRepository;
    }

    @Override
    public List<TabCategory> getAll() {
        List<TabCategory> categories = new ArrayList<>();
        var c = new TabCategoryEntity();
        c.setId("6");
        c.setEmoji(":)");
        c.setCreatedAt(LocalDateTime.now());
        c.setTitle("test");
        c.setUpdatedAt(LocalDateTime.now());
        c.setTags("test 1, test 2");
        categories.add(c);
        return categories;
/*        return this.tabCategoryRepository.findAll().stream()
                .map(el -> (TabCategory) el)
                .sorted(Comparator.comparing(TabCategory::getTitle))
                .collect(Collectors.toList());

 */
    }
}
