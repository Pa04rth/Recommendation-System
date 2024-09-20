
public class XMLDataIngestor extends DataIngestor {
    public XMLDataIngestor(String filename) {
        System.out.println("Loading XML file " + filename);
    }

    @Override
    public void loadData() {
        // Load XML file using JDOM
        System.out.println("Loading XML Data!");
    }

}
