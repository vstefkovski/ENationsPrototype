package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "chat")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chat")
    private Integer id;

    @Column(name = "channel_id", nullable = false)
    private Integer channelId;

    @Column(name = "channel_type", nullable = false)
    private Integer channelType;

    public Chat(Integer channelId, Integer channelType) {
        this.channelId = channelId;
        this.channelType = channelType;
    }

    public Chat() {
    }
}