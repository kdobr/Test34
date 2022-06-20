import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
WebDriver wd;

@BeforeTest
public void start(){

    System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
    wd = new ChromeDriver();

    wd.navigate().to("https://trello.com/");

}

@Test
    public void login1() throws InterruptedException {
    WebElement element = wd.findElement(By.cssSelector("div[class='UiHeaderNavstyles__Skip-sc-1ne5rbv-0 BYsQb']"));
    //WebElement element1 = wd.findElement(By.cssSelector("div.UiHeaderNavstyles__Skip-sc-1ne5rbv-0 BYsQb"));
   // WebElement element2 = wd.findElement(By.className("UiHeaderNavstyles__Skip-sc-1ne5rbv-0 BYsQb"));

Thread.sleep(3000);
}


@AfterTest
    public void after(){
    wd.quit();
}
}
