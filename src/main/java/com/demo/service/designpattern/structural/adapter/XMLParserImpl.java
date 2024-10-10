package com.demo.service.designpattern.structural.adapter;

import org.json.JSONObject;
import org.json.XML;

public class XMLParserImpl implements XMLParser {

    @Override
    public String parseXML(String json) {
        String xml = XML.toString(new JSONObject(json));
        return "Parsed XML: " + xml;
    }
}