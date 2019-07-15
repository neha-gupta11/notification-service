package com.notification.subscription;

import com.notification.enums.NotificationType;

import java.util.Set;

public class GoldSubscription extends Subscription {
    public GoldSubscription() {
        this.dailyLimit=1000000L;
        this.notificationTypes.add(NotificationType.EMAIL);
        this.notificationTypes.add(NotificationType.SMS);
    }
}
