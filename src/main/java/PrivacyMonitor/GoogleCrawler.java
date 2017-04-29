package PrivacyMonitor;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import java.util.List;

/**
 * Created by julianfrielinghaus on 29.04.17.
 */
public class GoogleCrawler implements Crawler
{
    public GoogleCrawler()
    {
        try
        {
            HttpResponse<JsonNode> jsonResponse = Unirest.get("https://www.googleapis.com/customsearch/v1")
                    .header("key", "application/json")
                    .queryString("key", secrets.GoogleApiKey)
                    .queryString("q", "facebook")
                    .queryString("cx","017576662512468239146:omuauf_lfve")
                    .asJson();

            System.out.println(jsonResponse.toString());
        }
        catch (Exception e)
        {
            System.out.println("Exception raised");
            System.out.println(e.toString());
        }

    }

    public List<Result> crawl(PrivacyUser user)
    {
        return null;
    }
}
