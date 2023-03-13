package com.example.restaurantmenu;

public class landmarksModel {

    private String landmarkTitle;
    private String landmarkInfo;
    private int landmarkImage;

    public landmarksModel(String landmarkTitle, String landmarkInfo, int landmarkImage) {
        this.landmarkTitle = landmarkTitle;
        this.landmarkInfo = landmarkInfo;
        this.landmarkImage = landmarkImage;
    }

    public String getLandmarkTitle() {
        return landmarkTitle;
    }

    public void setLandmarkTitle(String landmarkTitle) {
        this.landmarkTitle = landmarkTitle;
    }

    public String getLandmarkInfo() {
        return landmarkInfo;
    }

    public void setLandmarkInfo(String landmarkInfo) {
        this.landmarkInfo = landmarkInfo;
    }

    public int getLandmarkImage() {
        return landmarkImage;
    }

    public void setLandmarkImage(int landmarkImage) {
        this.landmarkImage = landmarkImage;
    }
}
