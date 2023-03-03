import com.codeborne.selenide.Condition;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SolutionsTest {
    @BeforeAll
    static void beforeAll() {
        browserSize = "1920x1080";

    }
    @Test
    void SolutionsTest(){
        open("https://github.com/");
        $(".header-menu-wrapper");$(byText("Solutions")).hover();
        $("[href='/enterprise']").click();
        $("div.col-9-max").shouldHave(Condition.text("Build like the best"));

    }

}

