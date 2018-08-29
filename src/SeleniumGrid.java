import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("Chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		
		
		WebDriver driver=new RemortWebDriver();
		
		
		

	}

}
