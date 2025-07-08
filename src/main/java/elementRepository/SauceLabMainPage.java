package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SauceLabMainPage {

    WebDriver driver;

    public SauceLabMainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    public By menuButton = By.id("react-burger-menu-btn");
    public By logoutButton = By.id("logout_sidebar_link");
    public By sortDropdownFilter = By.xpath("//select[@class='product_sort_container']");

    // Methods
    public void openMenu(){
        driver.findElement(menuButton).click();
    }

    public void clickLogout(){
        driver.findElement(logoutButton).click();
    }

    public void verifyLogout(){
        System.out.println("Reached");
        WebElement element1 = driver.findElement(By.id("login-button"));
        WebElement element2 = driver.findElement(By.xpath("//div[@id='login_credentials']/h4"));

        Assert.assertTrue(element1.getText().contains("Login"));
        Assert.assertTrue(element2.getText().contains("Accepted usernames"));
    }

    public void clickSortingFilter(){
        WebElement sortDropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        sortDropdown.click();
    }

    public void sortFilter(String sort)
    {
        if(sort.equalsIgnoreCase("High to Low"))
        {   WebElement sortDropdown = driver.findElement(sortDropdownFilter);
            Select select = new Select(sortDropdown);
            select.selectByVisibleText("Price (high to low)");
        }
        if(sort.equalsIgnoreCase("Low to High"))
        {   WebElement sortDropdown = driver.findElement(sortDropdownFilter);
            Select select = new Select(sortDropdown);
            select.selectByVisibleText("Price (low to high)");
        }
        if(sort.equalsIgnoreCase("Z to A"))
        {   WebElement sortDropdown = driver.findElement(sortDropdownFilter);
            Select select = new Select(sortDropdown);
            select.selectByVisibleText("Name (Z to A)");
        }
    }
}