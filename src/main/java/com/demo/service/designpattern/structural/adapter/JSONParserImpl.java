package com.demo.service.designpattern.structural.adapter;

import org.json.JSONObject;
import org.json.XML;

public class JSONParserImpl implements JSONParser {

    @Override
    public String parseJSON(String xml) {
        JSONObject json = XML.toJSONObject(xml);
        return "Parsed JSON: " + json;
    }
}