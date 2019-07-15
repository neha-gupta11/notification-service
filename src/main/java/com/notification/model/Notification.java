package com.notification.model;

import com.notification.enums.NotificationType;
import com.notification.model.EndUser;
import com.notification.model.Subscriber;

import java.util.Date;

public class Notification {
    private NotificationType type;
    private Boolean delivered;
    private Date createdOn;
    private EndUser user;
    private Subscriber subscriber;

    public NotificationType getType() {
        return type;
    }

    public Boolean getDelivered() {
        return delivered;
    }

    public Date getCreatedOn() {
        return createdOn;
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
        this.createdOn=new Date();
        this.delivered=false;
        this.subscriber=subscriber;
    }


}
