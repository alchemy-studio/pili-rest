package io.weli.pili;

import io.weli.pili.search.PiliEmojiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController {

    @Autowired
    private PiliEmojiRepo repo;

    Pageable pageable = PageRequest.of(0, 3, Sort.by("name"));

    @GetMapping("/")
    public String search(@RequestParam("keyword") String keyword, Model model) {
        model.addAttribute("message", keyword);
        return "index";
    }

//    @GetMapping("/{keyword:.+}")
//    public String handleQuery(@RequestParam("keyword") String keyword) {
//        repo.query(keyword, pageable);
//        return "index";
//    }
}
