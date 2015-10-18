package pl.postrowski.probablycoolmusicdownloader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.function.Consumer;

/**
 * Created by ostrz on 18.10.2015.
 */
public class WebContentParser
{
    public void getPageBody( String url, Consumer<Document> pageConsumer )
    {
        try
        {
            final Document document = Jsoup.connect(url).get();

            pageConsumer.accept(document);

            //String text = doc.body().text();
            //System.out.print(text);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
