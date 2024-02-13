package lt.techin.kristinaglebenkoviene.test;

import lt.techin.kristinaglebenkoviene.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainPageTest extends BasePageTest{

    @Test
    void moveToPrestaShopPage(){
        MainPage mainPage = new MainPage(driver);
        Assertions.assertEquals("http://192.168.89.19/", driver.getCurrentUrl());
        Assertions.assertEquals("PrestaShop", driver.getTitle());
    }

}
