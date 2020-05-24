package com.zetcode.service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinkService implements ILinkService{

    ArrayList<String> links = new ArrayList<String>();

    @Override
    public List<String> getLinks() {
        return links;
    }

    @Override
    public void addLink(String link) {
        this.links.add(link);
    }
}
