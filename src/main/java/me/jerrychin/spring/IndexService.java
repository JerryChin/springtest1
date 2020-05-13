package me.jerrychin.spring;

/**
 * @author Jerry Chin
 */
public class IndexService implements IService {
    @Override
    public String serve() {
        return "Hello World";
    }
}