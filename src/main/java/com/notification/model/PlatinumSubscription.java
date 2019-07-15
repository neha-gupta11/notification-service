package com.notification.model;

import com.notification.enums.NotificationType;

public class PlatinumSubscription extends Subscription {
    public PlatinumSubscription() {
        this.dailyLimit=Long.MAX_VALUE;
        this.notificationTypes.add(NotificationType.EMAIL);
        this.notificationTypes.add(NotificationType.SMS);
        this.notificationTypes.add(NotificationType.PUSH);
    }
}
