package com.example.springboot_assignment;

import org.apache.tomcat.websocket.server.WsHttpUpgradeHandler;

public class UserServiceException extends RuntimeException{

private static final long serialVersionUID = 13874738388738L;

public UserServiceException(String message)
{
    super(message);
}
}
