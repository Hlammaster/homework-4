import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class ActionsTest {


    @Test
    void ActionsTest(){
        open(" https://the-internet.herokuapp.com/drag_and_drop");
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).perform();
        sleep(6000);




    }
}
