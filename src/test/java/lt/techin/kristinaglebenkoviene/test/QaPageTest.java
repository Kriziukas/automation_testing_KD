package lt.techin.kristinaglebenkoviene.test;

import lt.techin.kristinaglebenkoviene.MainPage;
import lt.techin.kristinaglebenkoviene.QaPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class QaPageTest extends BasePageTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/products.csv", numLinesToSkip = 1)
    void testIfItemExitsInTheList(String productNameCsv) {
        QaPage qaPage = new QaPage(driver);
        qaPage.putItemsIntoList();
        Assertions.assertTrue(qaPage.checkIfListContainsProduct(productNameCsv), productNameCsv + " does not exist in the Presta shop.");
        qaPage.checkIfRequiredItemIsDisplayed(productNameCsv);

    }
}
