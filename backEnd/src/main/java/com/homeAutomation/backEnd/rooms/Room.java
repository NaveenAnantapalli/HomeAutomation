package com.homeAutomation.backEnd.rooms;

import com.homeAutomation.backEnd.user.Users;

import javax.persistence.*;

@Entity
@Table
public class Room {
    @Id
    @SequenceGenerator(
            name = "room_sequence",
            sequenceName = "room_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "room_sequence"
    )
    private Long roomId;
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public Room() {
    }

    public Room(Long id, String name) {
        this.roomId = id;
        this.name = name;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Rooms{" +
                "id=" + roomId +
                ", name='" + name + '\'' +
                '}';
    }
}
