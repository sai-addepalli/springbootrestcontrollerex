package com.zetcode.service;

import java.util.List;

public interface ILinkService {
    List<String> getLinks();
    void addLink(String link);
}
