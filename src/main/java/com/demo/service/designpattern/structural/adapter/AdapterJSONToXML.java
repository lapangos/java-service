package com.demo.service.designpattern.structural.adapter;

public class AdapterJSONToXML implements XMLParser{
    private JSONParser jsonParser;

    public AdapterJSONToXML(JSONParser jsonParser) {
        this.jsonParser = jsonParser;
    }

    @Override
    public String parseXML(String json) {
        return jsonParser.parseJSON(json);
    }
}