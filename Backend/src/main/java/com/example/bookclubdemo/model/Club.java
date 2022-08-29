package com.example.bookclubdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "club")
@Getter
@Setter
@ToString
public class Club {
    @Id
    @GeneratedValue
    private Long id;
    private String clubName;
    private String meetingTime;
    private int members;

    @ManyToOne
    @JoinColumn(name = "book_id")
    @JsonIgnore
    private Book book;

    public Club() {
    }

    public Club(Long id, String clubName, String meetingTime, int members) {
        this.id = id;
        this.clubName = clubName;
        this.meetingTime = meetingTime;
        this.members = members;
    }

}
