package com.neweasesoft.dataplus.ui.backstage.client;

import com.google.gwt.core.client.EntryPoint;
import org.dominokit.domino.ui.cards.Card;
import org.dominokit.domino.ui.layout.Layout;
import org.dominokit.domino.ui.splitpanel.HSplitPanel;
import org.dominokit.domino.ui.splitpanel.SplitPanel;
import org.dominokit.domino.ui.splitpanel.VSplitPanel;
import org.dominokit.domino.ui.style.Color;

import java.util.logging.Logger;

import static org.jboss.elemento.Elements.div;

/**
 * 应用程序入口类
 *
 * @author fushuwei
 */
public class AppEntryPoint implements EntryPoint {

    private static final Logger logger = Logger.getLogger(AppEntryPoint.class.getName());

    private Layout layout;

    @Override
    public void onModuleLoad() {

        logger.info("AppEntryPoint onModuleLoad...");

        layout = Layout.create("数据中台");

        layout.appendChild(
            Card.create("COMBINED SPLIT PANELS")
                .appendChild(
                    HSplitPanel.create()
                        .appendChild(
                            SplitPanel.create()
                                .setWidth("20%")
                                .appendChild(
                                    div()
                                        .css("demo-split-div", Color.INDIGO_LIGHTEN_5.getBackground())))
                        .appendChild(
                            SplitPanel.create()
                                .setWidth("50%")
                                .appendChild(
                                    VSplitPanel.create()
                                        .appendChild(
                                            SplitPanel.create()
                                                .setHeight("20%")
                                                .appendChild(
                                                    div()
                                                        .css(
                                                            "demo-split-div",
                                                            Color.INDIGO_LIGHTEN_5.getBackground())))
                                        .appendChild(
                                            SplitPanel.create()
                                                .setHeight("50%")
                                                .appendChild(
                                                    div()
                                                        .css(
                                                            "demo-split-div",
                                                            Color.BLUE_GREY_LIGHTEN_5.getBackground())))
                                        .appendChild(
                                            SplitPanel.create()
                                                .setHeight("30%")
                                                .appendChild(
                                                    div()
                                                        .css(
                                                            "demo-split-div",
                                                            Color.INDIGO_LIGHTEN_5.getBackground())))
                                        .setHeight("100%")))
                        .appendChild(
                            SplitPanel.create()
                                .setWidth("30%")
                                .appendChild(
                                    div()
                                        .css("demo-split-div", Color.INDIGO_LIGHTEN_5.getBackground())))
                        .setHeight("400px"))
                .element());
    }
}
