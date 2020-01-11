package com.mettlekc.sample;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class YamlFileReader {

    public final static void main(String[] args) {
        Map<String, Object> load = load("aerospike-profile.yaml");
        System.out.println(load);
        System.out.println(load("mysql-profile.yaml"));
    }

    private static Map<String, Object> load(final String fileName) {
        Yaml yaml = new Yaml();
        InputStream inputStream = YamlFileReader.class
                .getClassLoader()
                .getResourceAsStream(fileName);
        return yaml.load(inputStream);
    }

}
