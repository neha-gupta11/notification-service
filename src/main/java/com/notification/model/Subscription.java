package com.notification.model;

import com.notification.enums.NotificationType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.util.HashSet;
import java.util.Set;

@MappedSuperclass
@Getter
@Setter
public abstract class Subscription extends BaseEntity {
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
