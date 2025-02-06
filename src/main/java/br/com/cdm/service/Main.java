package br.com.cdm.service;

public class Main {

    public static void main(String[] args) {
        String coinJson = "{ \"coin_id\": 1, \"country\": \"Brazil\", \"price\": 4.50, \"weight\": 1.25 } , " +
                "{ \"coin__id\": 2, \"country\": \"US\", \"price\": 5.50}"; // missing weight

        String stampJson = "{ \"stamp_id\": 1, \"country\": \"Nicaragua\", \"price\": 1.15, \"mainPicture\": \"Red Flower\"} , " +
                "{ \"stamp_id\": 2, \"country\": \"Canada\", \"price\": 0.75, \"main_picture\": \"Tree Flower\"}";

        ShowCollection collection = new ShowCollection();
        System.out.println("Coin Collection ================================================================");
        collection.printAllItems(coinJson);

        System.out.println("Stamp Collection ===============================================================");
        collection.printAllItems(stampJson);
    }
}
