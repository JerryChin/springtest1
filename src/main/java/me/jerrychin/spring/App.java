package me.jerrychin.spring;

import com.memorynotfound.Hello;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.net.URLClassLoader;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger log = LogManager.getLogger(App.class);

    public static void main( String[] args ) {

        log.error("thread context {}", Arrays.toString(((URLClassLoader) Thread.currentThread().getContextClassLoader()).getURLs()));



        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");

        IndexApp app = (IndexApp) context.getBean("indexApp", "1");


        log.error("app: {}", app.print());
        log.error("app: {}", context.getBean(Hello.class));


    }
}
