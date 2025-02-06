package br.com.cdm.service;

import java.util.Arrays;

public class ShowCollection {
    private final ObjectConverter converter = new ObjectConverter();

    public void printAllItems(String items) {
        Arrays.stream(items.split(" , ")).forEach(
                item -> {
                    System.out.println("Json format: " + item);
                    Object itemObject = converter.convertItem(item);
                    System.out.println(itemObject);
                }
        );
    }

}
