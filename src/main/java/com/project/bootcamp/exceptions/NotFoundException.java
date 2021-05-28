package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;
import sun.plugin2.message.Message;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NO_RECORD_FOUND);
    }
}

