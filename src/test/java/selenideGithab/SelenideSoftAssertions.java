package selenideGithab;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertions {

    @BeforeAll

    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://github.com/";
    }

    @Test

    void SoftAssertionsForJunit5IsPresent () {

//- Откройте страницу Selenide в Github
//- Перейдите в раздел Wiki проекта
//- Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
//- Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5


        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $(byText("SoftAssertions")).click();
        $(".gollum-markdown-content").shouldHave(text("JUnit5 extension - "),
                text("com.codeborne.selenide.junit5.SoftAssertsExtension"));

    }

}
