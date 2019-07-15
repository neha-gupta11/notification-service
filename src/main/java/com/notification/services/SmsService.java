package com.notification.services;

import com.notification.model.Notification;
import com.notification.enums.NotificationType;
import com.notification.model.EndUser;
import com.notification.model.Subscriber;

import java.util.List;

public class SmsService {

    private NotificationService notificationService;

    public void sendSmsToUsers(List<EndUser> endUsers, String content, Subscriber sender){
        endUsers.forEach(endUser -> {
            if(sendSms(endUser,content)){
                Notification notification=new Notification(NotificationType.SMS,endUser,sender);
                notificationService.save(notification);
            }
        });
    }


    private boolean sendSms(EndUser endUser, String content){
        return true;
    }

}
