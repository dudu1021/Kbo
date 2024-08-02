package com.kbo.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class KboRankingService {

    public void getKboRankings() {
        System.setProperty("webdriver.chrome.driver", "/src/main/chromedriver"); // Update the path as necessary
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.koreabaseball.com/");

            // Wait for the element to ensure the page has loaded
            WebDriverWait wait = new WebDriverWait(driver, 10);
            List<WebElement> tableElements = driver.findElements(By.cssSelector("#divTeamRank table"));

            if (tableElements.isEmpty()) {
                System.out.println("팀 랭킹 테이블을 찾을 수 없습니다.");
                return;
            }

            WebElement table = tableElements.get(0); // Assuming there is only one such table
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                List<WebElement> cells = row.findElements(By.cssSelector("th, td"));
                for (WebElement cell : cells) {
                    System.out.print(cell.getText() + " ");
                }
                System.out.println(); // Print a newline at the end of each row
            }
        } finally {
            if (driver != null) {
                driver.quit(); // Close the browser
            }
        }
    }
}