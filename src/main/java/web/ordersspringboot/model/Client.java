package web.ordersspringboot.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="hasCard")
    private boolean hasCard;
    @Column(name="birthday")
    private Date birthday;

    public Client(boolean hasCard, Date birthday) {
        this.hasCard = hasCard;
        this.birthday = birthday;
    }

    public Client() {
    }

    public Client(boolean hasCard) {
        this.hasCard = hasCard;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isHasCard() {
        return hasCard;
    }

    public void setHasCard(boolean hasCard) {
        this.hasCard = hasCard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
