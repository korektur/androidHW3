package com.android.homework3;

/**
 * Created by Руслан on 23.09.13.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PictureFinder {
    private static String URLRequest = "http://xmlsearch.yandex.ru/xmlsearch?user=akhundov2&key=03.65073018:36dc3b1abca1ab70fe83ec7294af1005" +
            "&query=";

    private static String sendRequest(String words) {
        String result = "";
        try {
            URL request = new URL(URLRequest + words);
            HttpURLConnection connection = (HttpURLConnection) request.openConnection();
            connection.connect();
            int code = connection.getResponseCode();
            if (code == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    result += inputLine;
                }

                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void getPictures(String words) {
        sendRequest(words);
    }
}
