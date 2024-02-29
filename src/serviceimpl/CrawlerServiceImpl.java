package serviceimpl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import service.CrawlerService;

import java.io.IOException;

public class CrawlerServiceImpl implements CrawlerService {
    void findNamesFromWeb() throws IOException {
        Document dc = Jsoup.connect("데이터를 가져올 주소").get();
    }
}