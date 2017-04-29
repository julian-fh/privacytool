package PrivacyMonitor;

import java.util.List;

/**
 * Created by julianfrielinghaus on 29.04.17.
 */
public interface Crawler
{
    abstract List<Result> crawl(PrivacyUser user);
}
