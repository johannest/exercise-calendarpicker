package com.vaadin.training.clientside.calendarpicker;

import java.util.Date;

import com.vaadin.training.clientside.calendarpicker.client.CalendarPickerServerRpc;
import com.vaadin.training.clientside.calendarpicker.client.CalendarPickerState;

public class CalendarPicker extends com.vaadin.ui.AbstractComponent {

    private CalendarPickerServerRpc rpc = new CalendarPickerServerRpc() {
    };

    public CalendarPicker() {
        registerRpc(rpc);
    }

    @Override
    public CalendarPickerState getState() {
        return (CalendarPickerState) super.getState();
    }

    public Date getDate() {
        return new Date();
        // TODO: return the date user has selected
    }
}
