import java.net.URL;
import java.util.ResourceBundle;

public class DemoController extends FXMLController {
	
	public DemoController(String message) {
		System.out.println(message);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("initializing");		
	}
}
