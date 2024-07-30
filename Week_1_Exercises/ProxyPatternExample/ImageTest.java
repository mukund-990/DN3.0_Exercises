
public class ImageTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Frandom%2F&psig=AOvVaw1pXrj3ZjnoLxCi9qgOMUgf&ust=1722363499875000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCIC--5TuzIcDFQAAAAAdAAAAABAE");

        image.display();

        image.display();
    }
}