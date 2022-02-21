package service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupParser {
    public static String parsURL() {
        System.out.println("method parse url - start");
        Document doc = null;
        try {
            doc = Jsoup.connect("http://34.135.157.38:8085/tomcattest/send-json.jsp").ignoreContentType(true).
                    get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("method parse url - end");
        System.out.println(String.valueOf(doc.text()));
        String str = String.valueOf(doc.text());
        return str;

    }
}
