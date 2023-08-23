package com.vaadin.training.clientside.calendarpicker.client;

import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;

@Connect(com.vaadin.training.clientside.calendarpicker.CalendarPicker.class)
public class CalendarPickerConnector extends AbstractComponentConnector
        implements ValueChangeHandler<Date> {

    public CalendarPickerConnector() {
        // TODO: register the connector as value change handler to the widget
    }

    @Override
    protected Widget createWidget() {
        return GWT.create(DatePicker.class);
    }

    @Override
    public DatePicker getWidget() {
        return (DatePicker) super.getWidget();
    }

    @Override
    public CalendarPickerState getState() {
        return (CalendarPickerState) super.getState();
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);
        // TODO: set the date from state to the widget
    }

    @Override
    public void onValueChange(ValueChangeEvent<Date> date) {
        // TODO: send the date to the server side using rpc
    }
}
