
public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new WordDocumentFactory();
        Document document = factory.createDocument();
        document.print();

        factory = new PdfDocumentFactory();
        document = factory.createDocument();
        document.print();

        factory = new ExcelDocumentFactory();
        document = factory.createDocument();
        document.print();
    }
}