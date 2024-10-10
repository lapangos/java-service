package com.demo.service.designpattern.structural.adapter;

public class MainClass {
    public static void main(String[] args) {
        XMLParser xmlParser = new XMLParserImpl();
        JSONParser adapter = new AdapterXMLToJSON(xmlParser);

        String json = "{ \"name\": \"John\", \"age\": 30 }";
        String result = adapter.parseJSON(json);

        System.out.println(result);

        JSONParser jsonParser = new JSONParserImpl();
        XMLParser xmlAdapter = new AdapterJSONToXML(jsonParser);

        String xml = "<name>John</name><age>30</age>";
        String result1 = xmlAdapter.parseXML(xml);

        System.out.println(result1);
    }
}