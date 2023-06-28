package com.sofia.notificationservice.controller;

import com.sofia.notificationservice.model.Notifications;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @GetMapping(value = "/{notificationId}")
    public Notifications getNotification(@PathVariable("notificationId") String notificationId) {

        //Adding hard coded value to model for testing
        Notifications notificationOne = new Notifications(notificationId,
                "Notification description for " + notificationId);

        return notificationOne;
    }

}
