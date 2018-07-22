package io.weli.pili;

import io.weli.pili.search.PiliEmoji;
import io.weli.pili.search.PiliEmojiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private PiliEmojiRepo repo;

    Pageable pageable = PageRequest.of(0, 3);

    @GetMapping("/")
    public String search(@RequestParam(value = "keyword", defaultValue = "*") String keyword, Model model) {
        model.addAttribute("message", keyword);
        model.addAttribute("results", repo.findAllByName(keyword));
        return "index";
    }

}
