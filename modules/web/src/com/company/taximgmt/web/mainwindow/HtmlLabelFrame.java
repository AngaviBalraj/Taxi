package com.company.taximgmt.web.mainwindow;

import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Label;

import javax.inject.Inject;
import java.util.Map;


   public class HtmlLabelFrame extends AbstractFrame {

    private static final String HTML = "" +
            "<ul>" +
            "  <li><b>DASHBOARD</b></li>" +
          //  "  <li>itemized lists</li>" +
            //"  <li>etc.</li>" +
            "</ul> " ;
           // "are preserved.";

    @Inject
    private Label htmlLabel;

    @Override
    public void init(Map<String, Object> params) {
        htmlLabel.setValue(HTML);
    }
}