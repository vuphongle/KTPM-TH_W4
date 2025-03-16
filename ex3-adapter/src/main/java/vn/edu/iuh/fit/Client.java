package vn.edu.iuh.fit;

public class Client {
    public static void main(String[] args) {
        XMLService xmlService = new XMLService();

        JSONService adapter = new JSONToXMLAdapter(xmlService);

        String jsonInput = "{\"message\": \"Xin chào\"}";
        adapter.processJSON(jsonInput);
    }
}