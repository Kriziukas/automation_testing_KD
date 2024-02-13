package lt.techin.kristinaglebenkoviene;

import com.google.common.collect.FluentIterable;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class QaPage extends BasePage {
    public QaPage(WebDriver driver) {
        super(driver);
    }
    public boolean checkIfListContainsProduct(String productName){
        for (String specialName : putItemsIntoList()) {
            if (specialName.contains(productName)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> putItemsIntoList() {
        ArrayList<String> itemsList = new ArrayList<>();
        WebElement[] items = new WebElement[0];
        for (WebElement item : items) {
            itemsList.add(item.getText());
        }
        return itemsList;
    }
    public boolean checkIfRequiredItemIsDisplayed(String productName) {
        WebElement requiredItem = driver.findElement(By.linkText(productName));
        return requiredItem.isDisplayed();
    }
}
