package io.weli.pili.upload;

import com.github.houbb.opencc4j.util.ZhConverterUtil;
import io.weli.pili.search.PiliEmoji;
import io.weli.pili.search.PiliEmojiRepo;
import io.weli.pili.upload.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.UUID;

@Controller
public class BulkImportController {

    private final StorageService storageService;

    @Autowired
    private PiliEmojiRepo repo;


    @Autowired
    public BulkImportController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping("/import")
    public String bulkImport() throws Exception {
        repo.deleteAll();



        final File folder = new File("/tmp/pili/");

        for (final File file : folder.listFiles()) {
            System.out.println("processing " + file.getName());
//            MultipartFile multipartFile =
//                    new MockMultipartFile(file.getName(), new FileInputStream(file));

//            storageService.store(multipartFile);
            String id = UUID.randomUUID().toString();
            repo.save(
                    new PiliEmoji(id,
                            ZhConverterUtil.convertToSimple(file.getName()),
                            file.getName()));
        }

        return "done";
    }
}
