package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_message")
    private Integer id;

    @Column(name = "likes", nullable = false)
    private Integer likes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_chat", nullable = false)
    private Chat chat;

    public Message(Integer likes, Chat chat) {
        this.likes = likes;
        this.chat = chat;
    }

    public Message() {
    }

    // constructors, getters and setters

}