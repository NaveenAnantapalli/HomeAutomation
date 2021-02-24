package com.homeAutomation.backEnd.scene;


import com.homeAutomation.backEnd.user.Users;

import javax.persistence.*;

@Entity
@Table
public class SceneMapping {

    @Id
    @SequenceGenerator(
            name = "sceneMapping_sequence",
            sequenceName = "sceneMapping_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sceneMapping_sequence"
    )
    private Long sceneMappingid;
    private String sceneName;
    private String sceneCondition;
    private String sceneProducts;//format : pid-pstatus

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public SceneMapping() {
    }

    public SceneMapping(Long id, String sceneName, String sceneCondition, String sceneProducts) {
        this.sceneMappingid = id;
        this.sceneName = sceneName;
        this.sceneCondition = sceneCondition;
        this.sceneProducts = sceneProducts;
    }

    public Long getSceneMappingid() {
        return sceneMappingid;
    }

    public void setSceneMappingid(Long sceneMappingid) {
        this.sceneMappingid = sceneMappingid;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public String getSceneCondition() {
        return sceneCondition;
    }

    public void setSceneCondition(String sceneCondition) {
        this.sceneCondition = sceneCondition;
    }

    public String getSceneProducts() {
        return sceneProducts;
    }

    public void setSceneProducts(String sceneProducts) {
        this.sceneProducts = sceneProducts;
    }


    @Override
    public String toString() {
        return "SceneMapping{" +
                "sceneMappingid=" + sceneMappingid +
                ", name='" + sceneName + '\'' +
                ", sceneCondition='" + sceneCondition + '\'' +
                ", sceneProducts='" + sceneProducts + '\'' +
                '}';
    }
}