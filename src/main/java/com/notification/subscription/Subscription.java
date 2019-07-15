package com.notification.subscription;

import com.notification.enums.NotificationType;

import java.util.HashSet;
import java.util.Set;

public abstract class Subscription {
    protected Long dailyLimit;
    protected Set<NotificationType> notificationTypes=new HashSet<>();

    public Long getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(Long dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public Set<NotificationType> getNotificationTypes() {
        return notificationTypes;
    }

    public void setNotificationTypes(Set<NotificationType> notificationTypes) {
        this.notificationTypes = notificationTypes;
    }
}
