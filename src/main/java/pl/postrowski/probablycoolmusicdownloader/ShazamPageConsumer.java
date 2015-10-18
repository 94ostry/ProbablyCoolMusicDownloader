package pl.postrowski.probablycoolmusicdownloader;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.function.Consumer;

/**
 * Created by ostrz on 18.10.2015.
 */
public class ShazamPageConsumer implements Consumer<Document>
{
    public static final String URL = "http://www.shazam.com/charts/top-100/poland";

    @Override
    public void accept(Document document)
    {
        Elements containerElements = document.getElementsByClass("ti__container");

        for (Element ti__container : containerElements )
        {
            Element ti__title = ti__container.getElementsByClass("ti__title").first();
            Element ti__artist = ti__container.getElementsByClass("ti__artist").first();

            System.out.println(ti__title.text());
            System.out.println(ti__artist.text());
        }
    }
}
