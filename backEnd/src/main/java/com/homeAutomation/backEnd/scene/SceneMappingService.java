package com.homeAutomation.backEnd.scene;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SceneMappingService {

    private final SceneMappingRepository sceneMappingRepository;

    @Autowired
    public SceneMappingService(SceneMappingRepository sceneMappingRepository) {
        this.sceneMappingRepository = sceneMappingRepository;
    }
}
