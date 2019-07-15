package com.notification.services;

import com.notification.Notification;
import com.notification.enums.NotificationType;
import com.notification.user.EndUser;

import java.util.List;

public class EmailService {
    private NotificationService notificationService;

    public void sendEmailToUsers(List<EndUser> endUsers,String email){
        endUsers.forEach(endUser -> {
            if(sendEmail(endUser,email)){
                Notification notification=new Notification(NotificationType.EMAIL,endUser);
                notificationService.save(notification);
            }
        });
    }

    private boolean sendEmail(EndUser endUser,String content){
        return true;
    }

}
