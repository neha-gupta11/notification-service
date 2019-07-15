package com.notification.model;

import com.notification.enums.NotificationType;
import com.notification.model.EndUser;
import com.notification.model.Subscriber;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Notification extends BaseEntity{
    private NotificationType type;
    private Boolean delivered;
    private EndUser user;
    private Subscriber subscriber;

    public NotificationType getType() {
        return type;
    }

    public Boolean getDelivered() {
        return delivered;
    }

    public EndUser getUser() {
        return user;
    }

    public void setDelivered(Boolean delivered) {
        this.delivered = delivered;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public Notification(NotificationType type, EndUser user,Subscriber subscriber) {
        this.type = type;
        this.user = user;
//        this.createdDate=new Date();
//        setCreatedDate(Loc);
        this.delivered=false;
        this.subscriber=subscriber;
    }


}
