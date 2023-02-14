package tech.solres.dms.dmsmsbe.demo;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {
    private final MessageSource messageSource;

    public DemoController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping
    public ResponseEntity<String> sayHello(@RequestHeader(value = "Accept-language", required = false)
                                           Locale locale){

        return ResponseEntity.ok(messageSource.getMessage("common.greeting",null, LocaleContextHolder.getLocale()));
    }
}
