package com.mooco.moocochat.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chat_room")
public class ChatRoom {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_room_id")
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "chat_room")
    private List<ChatJoin> chatJoins = new ArrayList<>();


    @Column(nullable = true)
    private Long noticeChatId;

    @OneToMany(mappedBy = "chat_room")
    private List<Chat> chats = new ArrayList<>();







}
