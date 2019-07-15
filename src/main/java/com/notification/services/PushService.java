package com.notification.services;

import com.notification.model.Notification;
import com.notification.enums.NotificationType;
import com.notification.model.EndUser;
import com.notification.model.Subscriber;

import java.util.List;

public class PushService {

    private NotificationService notificationService;

    public void sendPushNotificationToUsers(List<EndUser> endUsers, String content, Subscriber sender){
        endUsers.forEach(endUser -> {
            if(sendPushNotification(endUser,content)){
                Notification notification=new Notification(NotificationType.PUSH,endUser,sender);
                notificationService.save(notification);
            }
        });
    }


    private boolean sendPushNotification(EndUser endUser, String content){
        return true;
    }
}
