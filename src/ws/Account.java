package ws;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "account")
@XmlAccessorType(XmlAccessType.FIELD)
public class Account {
    @XmlAttribute
    private Long id;
    @XmlElement
    private double balance;
    private Date creationDate;
    private boolean active;

    public Account() {
    }

    public Account(Long id, double balance, Date creationDate, boolean active) {
        this.id = id;
        this.balance = balance;
        this.creationDate = creationDate;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
