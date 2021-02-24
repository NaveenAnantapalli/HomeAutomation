package com.homeAutomation.backEnd.scene;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/scene")
public class SceneMappingController {

    private final SceneMappingService sceneMappingService;

    @Autowired
    public SceneMappingController(SceneMappingService sceneMappingService) {
        this.sceneMappingService = sceneMappingService;
    }
}
