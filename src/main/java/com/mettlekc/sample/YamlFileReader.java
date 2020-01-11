package com.mettlekc.sample;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class YamlFileReader {

    public final static void main(String[] args) {
        Yaml yaml = new Yaml();
        InputStream inputStream = YamlFileReader.class
                .getClassLoader()
                .getResourceAsStream("aerospike-profile.yaml");
        Map<String, Object> obj = yaml.load(inputStream);
        System.out.println(obj);
    }

}
