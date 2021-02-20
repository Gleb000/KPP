package by.fokin.laba1KPP.controller;

import by.fokin.laba1KPP.VectorService.VectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vector")
public class VectorController {

    int b = 85;

    @Autowired
    VectorService vectorService;

    @GetMapping
    public String calcVector(
            @RequestParam("x1") int x1,
            @RequestParam("y1") int y1,
            @RequestParam("x2") int x2,
            @RequestParam("y2") int y2
    ) {
        return vectorService.calculation(x1, y1, x2, y2);
    }
}
