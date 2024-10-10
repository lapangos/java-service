package com.demo.service.designpattern.structural.adapter;

public class AdapterXMLToJSON implements JSONParser {
    private XMLParser xmlParser;

    public AdapterXMLToJSON(XMLParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @Override
    public String parseJSON(String json) {
        return xmlParser.parseXML(json);
    }
}