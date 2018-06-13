package com.thecoolguy.rumaan.fileio;

import com.thecoolguy.rumaan.fileio.utils.Utils;

import com.thecoolguy.rumaan.fileio.utils.Utils.URLParser;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class UrlTest {

    // TODO: check for more cases

    @Test
    public void check_UrlFromEncryptUrl() {
        String testUrl = "https://file.io/dfW34/dwnld";
        String check = "https://file.io/dfW34";

        String url = URLParser.INSTANCE.parseEncryptUrl(testUrl);
        assertEquals(check, url);
    }

}