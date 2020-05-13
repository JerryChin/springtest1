package me.jerrychin.spring;

import javax.annotation.PostConstruct;

/**
 * @author Jerry Chin
 */
public class IndexApp {
    private IndexService service;

    public String print() {
        return service.serve();
    }

    public void setService(final IndexService service) {
        this.service = service;
    }


    @PostConstruct
    public void postConstruct() {
        System.err.println("post construct!");
    }
}
