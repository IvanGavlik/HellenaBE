package info.hellena.api;

import info.hellena.api.dto.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class BootController {

    @GetMapping(value = "/api/boot")
     public Boot boot(HttpServletRequest request) {

        List<Cookie> cookieList = Arrays.stream(request.getCookies())
                .map(el -> {
                    Optional<CookieKey> cookeKey = CookieKey.of(el.getName());
                    if (cookeKey.isPresent()) {
                        return new Cookie(cookeKey.get(), el.getValue());
                    }
                    return null;
                } )
                .filter(el -> el != null)
                .collect(Collectors.toList());

        var user = new AnonymousUser("Bmn8ufKTrvG62VVEuvbxO", LocalDateTime.now().minusDays(1), null, false);
        var alerts = new Alerts(true, null, null, true);
        var visit = new Visit(UUID.randomUUID().toString(), UUID.randomUUID().toString());
        var settings = new RemoteSettings(true, false, "darcula", "eco", false, true, true, false, false, false, false, true, null);

        return new Boot(user, null, alerts,  visit,  settings, IFlags.defaultIFlags());
    }

    @GetMapping("/api/boot/companion")
    public Boot companion() {
        return null;
    }

    @GetMapping("/api/boot/features")
    public IFlags features() {
        return IFlags.defaultIFlags();
    }
}



