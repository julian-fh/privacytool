package PrivacyMonitor;

import com.restfb.*;
import com.restfb.types.User;

import java.util.List;

/**
 * Created by julianfrielinghaus on 29.04.17.
 */
public class FacebookCrawler implements Crawler
{
    public FacebookCrawler()
    {
        FacebookClient.AccessToken accessToken =
                new DefaultFacebookClient(secrets.FacebookApiKey, Version.VERSION_2_2).obtainAppAccessToken(secrets.FacebookApiKey, secrets.FacebookApiSecret);



        //FacebookClient facebookClient = new DefaultFacebookClient(accessToken.getAccessToken(), Version.VERSION_2_2);
        //FacebookClient facebookClient = new DefaultFacebookClient(secrets.SoerenApiKey, Version.VERSION_2_2);
        FacebookClient facebookClient = new DefaultFacebookClient(secrets.JulianApiKey, Version.VERSION_2_2);

        Connection<User> publicSearch = facebookClient.fetchConnection("search", User.class,
                Parameter.with("q", "Julian Frielinghaus"), Parameter.with("type", "user"));

        System.out.println(publicSearch.getData().toString());
        System.out.println();

        User searchedUser = facebookClient.fetchObject("me", User.class);

        System.out.println(searchedUser);

    }

    public List<Result> crawl (PrivacyUser user)
    {
        return null;
    }
}
