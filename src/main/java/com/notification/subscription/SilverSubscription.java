package com.notification.subscription;

import com.notification.enums.NotificationType;

import java.util.Set;

public class SilverSubscription extends Subscription {
    public SilverSubscription() {
        this.dailyLimit=100000L;
        this.notificationTypes.add(NotificationType.EMAIL);
    }
}
