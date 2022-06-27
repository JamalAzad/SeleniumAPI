import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;

public class Browser {

    public static void main(String[] args) throws InterruptedException {
        // ^ "throws InterruptedException" this is a class for making a time-out to close the browser!

        // This is to set path of the chromedriver
        String chromeDriverPath = "C:\\Users\\Jamal\\IdeaProjects\\Browser\\drivers\\chromedriver.exe";
        // Setting drivers to control the Chrome browser.
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        //declaring object of WebDriver class form external maven external libraries.
        WebDriver driver = new ChromeDriver();
        //User input for desire URL to open in the Chrome browser!
        String url = "https://www.izaanschool.com/";
        //Invoking driver to get the URL from the user and open it!
        driver.get(url);
        // Simple wording: after opening the Chrome browser successfully!
        System.out.println("Chrome browser opened with " + url + " URL!");
               // driver.close();
        // Simple wording: after closing the Chrome browser successfully!
        System.out.println("OK; Let us complete other steps of the Assignment!");
        driver.get("https://www.izaanschool.com/apply");
        System.out.println("Browsed the url https://www.izaanschool.com/apply");
        //Navigate the browser to specific URL (This an alternate option for get() method).
        driver.navigate().to("https://www.izaanschool.com");
        System.out.println("Navigated to url https://www.izaanschool.com");
        //Pressing the browser’s back button
        driver.navigate().back();
        System.out.println("Back to previous page:  https://www.izaanschool.com/apply");
        //Pressing the browser’s forward button
        driver.navigate().forward();
        System.out.println("Forward to next page url: Here it was: https://www.izaanschool.com");
        // to refresh current website page
        driver.navigate().refresh();
        System.out.println("Page refreshed");

        //NEXT PART OF THE QUESTION
        // Navigate to Url
        System.out.println("Browser's interaction started......");

        driver.get("https://google.com");
        // Enter text "q" and perform keyboard action "Enter"
        driver.findElement(By.name("q")).sendKeys("www.izaanschool.com" + Keys.ENTER); //Why we have to use "q" for By.name()??
        // Store 'SearchInput' element
        WebElement searchInput;
        searchInput = driver.findElement(By.name("q"));
        searchInput.clear();
        // to create a time-out clock before closing the browser.
        Thread.sleep(10000);
        //Invoking driver to close the browser!
        driver.close();
        System.out.println("Great! Bye Bye!!!");
    }

}