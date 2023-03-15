package DesignPatterns.Structural.Adapter;

public class AdapterXMLtoJSON implements XMLmethod{

    private final JSONfile json;

    public AdapterXMLtoJSON() {
        json = new JSONfile();
    }

    @Override
    public void displayMenus(XmlData xmlData) {
     JsonData jsonData = convertXMLtoJSON(xmlData);
     json.displayMenus(jsonData);
    }
    public JsonData convertXMLtoJSON(XmlData xmlData){
        /*
        conversion process takesplace
         */
        return new JsonData();
    }
}
