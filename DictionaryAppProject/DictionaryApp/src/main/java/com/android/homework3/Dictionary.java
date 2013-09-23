package com.android.homework3;

/**
 * Created by Руслан on 23.09.13.
 */


import java.net.MalformedURLException;
import java.net.URL;

public class Dictionary {
    URL request;

    Dictionary(String s) throws MalformedURLException {
        request = new URL("https://translate.yandex.net/api/v1.5/tr.json/translate?" +
                "key=trnsl.1.1.20130923T111105Z.d461ad359432a880.b1bbf827f59c7207f6aa527fc2b67ecdf52daf68" +
                "&text=дно" +
                "&lang=en");
    }
}
