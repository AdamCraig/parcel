import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Expensive Parcel Service");
  }

  @Test
  public void calculateParcelTest() {
    goTo("http://localhost:4567/");
    fill("#length").with("10");
    fill("#width").with("5");
    fill("#height").with("10");
    fill("#weight").with("2");
    fill("#distance").with("100");
    submit(".btn");
    assertThat(pageSource()).contains("604");
  }
}
