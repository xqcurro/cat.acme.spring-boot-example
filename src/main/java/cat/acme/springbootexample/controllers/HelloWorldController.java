package cat.acme.springbootexample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWorld() {
		if (HelloWorldController.log.isDebugEnabled()) {
			HelloWorldController.log.debug("[helloWorld] ::: Debug message.");
		}
		if (HelloWorldController.log.isInfoEnabled()) {
			HelloWorldController.log.info("[helloWorld] ::: Info message.");
		}
		return "Hello world!";
	}

}
