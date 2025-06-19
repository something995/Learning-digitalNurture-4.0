public class FactoryPattern {
    interface Document {
        void open();
    }
    static class WordDoc implements Document {
        public void open() {
            System.out.println("Word Document Opened");
        }
    }
    static class PdfDoc implements Document {
        public void open() {
            System.out.println("PDF Document Opened");
        }
    }
    static class DocFactory {
        static Document get(String type) {
            if (type.equals("word")) return new WordDoc();
            if (type.equals("pdf")) return new PdfDoc();
            return null;
        }
    }
    public static void main(String[] args) {
        Document d = DocFactory.get("pdf");
        d.open();
    }
}