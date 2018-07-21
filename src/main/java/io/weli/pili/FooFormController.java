package io.weli.pili;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FooFormController {

    @GetMapping("/fooform")
    public String greetingForm(Model model) {
        model.addAttribute("foo", new FooForm());
        return "fooform";
    }

    @PostMapping("/fooform")
    public String greetingSubmit(@ModelAttribute(name = "foo") FooForm foo) {
        return "result";
    }
}
