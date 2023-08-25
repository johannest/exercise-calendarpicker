package com.vaadin.training.clientside.calendarpicker.demo;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.training.clientside.calendarpicker.CalendarPicker;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("demo")
@Title("CalendarPicker Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class, widgetset = "com.vaadin.training.clientside.calendarpicker.demo.DemoWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();

        final CalendarPicker calendarPicker = new CalendarPicker();
        layout.addComponent(calendarPicker);

        Button button = new Button("Show value", new ClickListener() {

            @Override
            public void buttonClick(ClickEvent event) {
                Notification.show(calendarPicker.getDate().toString());
            }
        });
        layout.addComponent(button);

        setContent(layout);
    }
}
