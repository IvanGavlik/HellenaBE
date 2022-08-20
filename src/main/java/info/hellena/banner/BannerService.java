package info.hellena.banner;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Service
public class BannerService implements BannerDomain {
    @Override
    public List<Banner> getAllBanners() {
        Banner b = new BannerEntity();
        b.setCta("cta");
        b.setSubtitle("Subtitle");
        b.setTheme("dracula");
        b.setTimestamp(LocalDateTime.now());
        b.setTitle("Title");
        b.setUrl("url");
        List<Banner> list = new ArrayList<>();
        list.add(b);
        return list;
    }
}
