package org.mouthaan.noteit.hooks;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;


public class BrowserHooks {

    @Before
    public void setup() {
        Configuration.browser = "safari";
        Configuration.baseUrl = "http://localhost:4200";
    }
}
