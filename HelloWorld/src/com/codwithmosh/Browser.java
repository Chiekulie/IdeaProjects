package com.codwithmosh;

public class Browser {
    public void navigate (String address){
String ip = findIpAddress(address);
String html = sendHttpReqest(ip);
    }

    private String sendHttpReqest(String ip) {
        return "<html><html";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }

}

