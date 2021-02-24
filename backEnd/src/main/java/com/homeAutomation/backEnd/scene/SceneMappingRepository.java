package com.homeAutomation.backEnd.scene;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SceneMappingRepository extends JpaRepository<SceneMapping,Long> {
}
