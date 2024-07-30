import java.util.*;
public class ProxyImage implements Image {
    private String url;
    private RealImage realImage;
    private static Map<String, RealImage> cache = new HashMap<>();

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = cache.get(url);
            if (realImage == null) {
                realImage = new RealImage(url);
                cache.put(url, realImage);
            }
        }
        realImage.display();
    }
}