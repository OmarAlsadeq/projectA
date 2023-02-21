package Controllers;

import Models.User;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

@Controller
public class AuthenticationController {
    public User getUserFromSession(HttpSession session) {
        return null;
    }
}
