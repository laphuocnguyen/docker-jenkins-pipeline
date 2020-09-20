package testapp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAppController {
    @RequestMapping("/greetings")
    public String hello() {
        return "Hello Friends, This is Sharad Durgawad a DevOps Cloud Enthusiast !!!";
    } 
}