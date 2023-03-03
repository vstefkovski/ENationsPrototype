package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_article")
    private Integer id;

    private String title;

    private String text;

    private Integer likes;

    @ManyToOne
    @JoinColumn(name = "id_newspaper", referencedColumnName = "id_newspaper")
    private Newspaper newspaper;

    private String category;

    @Column(name="created_at")
    private Timestamp createdAt;

    public Article(String title, String text, Integer likes, Newspaper newspaper, String category) {
        this.title = title;
        this.text = text;
        this.likes = likes;
        this.newspaper = newspaper;
        this.category = category;
    }

    public Article() {
    }
}
