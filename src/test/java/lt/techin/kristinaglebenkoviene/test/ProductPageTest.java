package lt.techin.kristinaglebenkoviene.test;

import com.sun.tools.javac.Main;
import lt.techin.kristinaglebenkoviene.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ProductPageTest extends BasePageTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/products.csv", numLinesToSkip = 1)
    void readProductsFromCSV (String productName) {
        System.out.println("Product name: " + productName);
    }

//    @Test
//    public void testIfItemExists(){
//        MainPage mainPage = new MainPage(driver);
//
//    }
}
