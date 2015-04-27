package pl.mmalik.portlet.helloWorld.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class HelloWordController {

	@RenderMapping
	public String helloWord(RenderResponse response, RenderRequest request) {
		return "hello/helloWorld";
	}
}
