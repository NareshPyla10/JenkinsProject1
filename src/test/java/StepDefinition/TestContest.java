package StepDefinition;

import fileReader.FileReaderManager;
import pageObjectManager.PageObjectManager;
import webDriverManager.WebDriverManager;

public class TestContest {
    private WebDriverManager webDriverManager;
    private FileReaderManager fileReaderManager;
    private PageObjectManager pageObjectManager;

    public TestContest(){
        webDriverManager = WebDriverManager.getWebDriverManager();
        fileReaderManager =FileReaderManager.getFileReaderManager();
        pageObjectManager = new PageObjectManager(webDriverManager.createDriver(fileReaderManager.getPropertyFileReader().getProperty("browser")));
    }

    public WebDriverManager getWebDriverManager(){
        return webDriverManager;
    }

    public FileReaderManager fileReaderManager(){
        return fileReaderManager;
    }

    public PageObjectManager pageObjectManager(){
        return pageObjectManager;
    }

}
