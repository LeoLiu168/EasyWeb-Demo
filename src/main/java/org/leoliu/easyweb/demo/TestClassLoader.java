package org.leoliu.easyweb.demo;

import org.leoliu.easyweb.utils.PropsUtil;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

public class TestClassLoader {

    public static void main(String[] args) throws Exception {

        Properties props = PropsUtil.loadProps("easyweb.properties");
        String packageName = props.getProperty("easyweb.framework.app.base_package");

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        Enumeration<URL> urls = classLoader.getResources(packageName.replace(".", "/"));

        System.out.println(urls.toString());

        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            String path = url.getPath();
            System.out.println(path);
            String packagePath = path.replaceAll("%20", " ");
            System.out.println(packagePath);
            System.out.println(url.getProtocol());

            File[] files = new File(packagePath).listFiles();

            for(File file : files){
                String fileName = file.getName();
                System.out.println(fileName);
            }

        }
    }
}

