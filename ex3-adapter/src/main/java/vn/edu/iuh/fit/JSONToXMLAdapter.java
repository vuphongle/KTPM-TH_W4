package vn.edu.iuh.fit;

public class JSONToXMLAdapter implements JSONService{
    private XMLService xmlService;

    public JSONToXMLAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public void processJSON(String jsonData) {
        System.out.println("Adapter nhận đầu vào JSON, chuyển tiếp sang XMLService...");
        xmlService.processXML(jsonData);
    }
}
