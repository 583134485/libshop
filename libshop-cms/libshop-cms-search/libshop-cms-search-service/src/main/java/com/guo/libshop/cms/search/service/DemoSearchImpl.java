package com.guo.libshop.cms.search.service;

import com.guo.libshop.cms.search.api.DemoSearch;
import org.springframework.stereotype.Service;

@Service
public class DemoSearchImpl implements DemoSearch {
    @Override
    public String DemoSearch(String s) {
        return "Hello Darling";
    }
}
