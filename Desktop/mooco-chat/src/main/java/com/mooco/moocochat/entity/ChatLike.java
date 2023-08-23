package com.mooco.moocochat.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chat_like")
public class ChatLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_like_id")
    private Long id;

    @Column
    private Long userId;

    @Column
    private Long chatId;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createAt;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;
}
