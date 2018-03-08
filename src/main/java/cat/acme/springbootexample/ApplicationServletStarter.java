package cat.acme.springbootexample;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ApplicationServletStarter extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(ApplicationStarter.class);
	}

}
