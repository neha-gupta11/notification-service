package com.notification.model;

import com.notification.enums.NotificationType;

public class SilverSubscription extends Subscription {
    public SilverSubscription() {
        this.dailyLimit=100000L;
        this.notificationTypes.add(NotificationType.EMAIL);
    }


}
