package com.data.jpa.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "instructor_details")
public class InstructorDetail {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "youtube_channel")
    private String youtube_channel;
    @Column(name = "hobby")
    private String hobby;

    public InstructorDetail(){}

    public InstructorDetail( String youtube_channel, String hobby) {
        this.youtube_channel = youtube_channel;
        this.hobby = hobby;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getYoutube_channel() {
        return youtube_channel;
    }

    public void setYoutube_channel(String youtube_channel) {
        this.youtube_channel = youtube_channel;
    }

    @Override
    public String toString() {
        return "InstructorDetail{" +
                "id=" + id +
                ", youtube_channel='" + youtube_channel + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}

