package info.hellena.api;

import info.hellena.banner.Banner;
import info.hellena.banner.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;


@Controller
public class BannerController {

    private BannerService bannerService;

    @Autowired
    public BannerController(BannerService bannerService) {
        this.bannerService = bannerService;
    }

    @QueryMapping
    public Banner banner(@Argument LocalDateTime lastSeen) {
        System.out.println("radi :) ");
        return this.bannerService.getAllBanners().get(0);
    }


}
