package springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ErrorTriggerController {

    @RequestMapping("/")
    public String index() {
        return "This is the errorTriggerController! Waaaaaaghhh";
    }

    @RequestMapping("/triggerStackTrace")
    public void triggerStackTrace() {
        new Exception().printStackTrace();
    }

}
