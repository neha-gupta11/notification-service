package com.notification;

import com.notification.enums.NotificationType;
import com.notification.user.EndUser;

import java.util.Date;

public class Notification {
    private NotificationType type;
    private Boolean delivered;
    private Date createdOn;
    private EndUser user;

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

    public Notification(NotificationType type, EndUser user) {
        this.type = type;
        this.user = user;
        this.createdOn=new Date();
        this.delivered=false;
    }


}
