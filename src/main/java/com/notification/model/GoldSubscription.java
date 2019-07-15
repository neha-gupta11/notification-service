package com.notification.model;

import com.notification.enums.NotificationType;

import javax.persistence.Entity;

@Entity
public class GoldSubscription extends Subscription {
    public GoldSubscription() {
        this.dailyLimit=1000000L;
        this.notificationTypes.add(NotificationType.EMAIL);
        this.notificationTypes.add(NotificationType.SMS);
    }
}
