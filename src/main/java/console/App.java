package console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.AppService;

public class App {

	
		private static final Logger LOG = LoggerFactory.getLogger(App.class); 
		public static void main(String[] args) {
			AppService nvAppService = new AppService();
			nvAppService.executer("Hello");
			LOG.info("Bonjour Slf4J !");
			LOG.info("Implementation Logback");

	}

}
