package com.mooco.moocochat.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_id")
    private Long id;

    @Column
    private Long senderId;

    @ManyToOne
    @JoinColumn(name = "chat_room_id")
    private ChatRoom chatRoom;


    @Column
    private Long roomId;

    @OneToMany(mappedBy = "chat")
    private List<ChatLike> chatLikes = new ArrayList<>();

    @Column
    private String content;



    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createAt;


}
