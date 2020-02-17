package com.example.Nube.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;

/**
 * TimeServiceImpl
 */
@Service
public class TimeServiceImpl implements TimeService {

    Calendar c;

    @Override
    public String time() {
        return c.getTime().toString();
    }

    public TimeServiceImpl() {
        c = new GregorianCalendar();
    }

    
    
}