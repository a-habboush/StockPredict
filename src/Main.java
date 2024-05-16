import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://stockanalysis.com/list/sp-500-stocks/";
        try {
            final Document document = Jsoup.connect(url).get();
            System.out.println(document.outerHtml());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}