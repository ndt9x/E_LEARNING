package com.example.kieutrang.database;

/**
 * Created by KieuTrang on 10/30/2015.
 */
public class Vocabulary {
    private int id;
    private String lesson, tenchu, phienam, nghia, vidu;

    public Vocabulary(int id, String lesson, String tenchu, String phienam,
            String nghia, String vidu) {
        super();
        this.id = id;
        this.lesson = lesson;
        this.tenchu = tenchu;
        this.phienam = phienam;
        this.nghia = nghia;
        this.vidu = vidu;
    }
    public Vocabulary(String lesson, String tenchu, String phienam,
            String nghia, String vidu) {
        super();
        this.lesson = lesson;
        this.tenchu = tenchu;
        this.phienam = phienam;
        this.nghia = nghia;
        this.vidu = vidu;
    }

    public Vocabulary() {
        super();
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getPhienam() {
        return phienam;
    }

    public void setPhienam(String phienam) {
        this.phienam = phienam;
    }

    public String getTenchu() {

        return tenchu;
    }

    public void setTenchu(String tenchu) {
        this.tenchu = tenchu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVidu() {

        return vidu;
    }

    public void setVidu(String vidu) {
        this.vidu = vidu;
    }

    public String getNghia() {

        return nghia;
    }

    public void setNghia(String nghia) {
        this.nghia = nghia;
    }
}
