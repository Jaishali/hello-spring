package org.launchcode.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="hello")
public class HelloSpringController {
  /*  @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }*/
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "goodbye, Spring!";
    }
    @RequestMapping(value="hellogoodbye", method = {RequestMethod.GET, RequestMethod.POST})
    public String hellogoodbye(){
        return "hellogoodbye, Spring!";
    }
    // Responds to get requests at /hello?coder=LaunchCoder
  /*  @GetMapping("hello")
    @ResponseBody
    public String hello(@RequestParam String coder) {
        return "Hello, " + coder + "!";
    }*/
    // Responds to get requests at /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name) {
        return "Hello, " + name + "!";
    }


    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @PostMapping
    public String hello(@RequestParam String coder) {
        return "Hello, " + coder + "!";
    }
    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/hello'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
