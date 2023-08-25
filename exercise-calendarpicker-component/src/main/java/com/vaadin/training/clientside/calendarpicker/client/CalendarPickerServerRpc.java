package com.vaadin.training.clientside.calendarpicker.client;

import java.util.Date;

import com.vaadin.shared.communication.ServerRpc;

public interface CalendarPickerServerRpc extends ServerRpc {

    public void setDate(Date newValue);

}
