package info.hellena.api.dto;

// TODO LoggedUser
// TODO IFlags
// TODO PostBootData postData,
public record Boot(AnonymousUser anonymousUser,
                   AccessToken accessToken,
                   Alerts alerts,
                   Visit visit,
                   RemoteSettings settings,
                   IFlags flags) {
}
