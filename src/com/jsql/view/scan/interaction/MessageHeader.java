/*******************************************************************************
 * Copyhacked (H) 2012-2014.
 * This program and the accompanying materials
 * are made available under no term at all, use it like
 * you want, but share and discuss about it
 * every time possible with every body.
 * 
 * Contributors:
 *      ron190 at ymail dot com - initial implementation
 ******************************************************************************/
package com.jsql.view.scan.interaction;

import java.util.Map;

import com.jsql.model.bean.HTTPHeader;
import com.jsql.view.swing.MediatorGUI;

/**
 * Append a text to the tab Header.
 */
public class MessageHeader implements IInteractionCommand {
    // The text to append to the tab
    private String url;
    private String cookie;
    private String post;
    private String header;
    private Map<String, String> response;
    private String source;

    /**
     * @param interactionParams Text to append
     */
    @SuppressWarnings("unchecked")
    public MessageHeader(Object[] interactionParams) {
        Map<String, Object> params = (Map<String, Object>) interactionParams[0];
        url = (String) params.get("Url");
        cookie = (String) params.get("Cookie");
        post = (String) params.get("Post");
        header = (String) params.get("Header");
        response = (Map<String, String>) params.get("Response");
        source = (String) params.get("Source");
    }

    @Override
    public void execute() {
        MediatorGUI.bottomPanel().listHTTPHeader.add(new HTTPHeader(url, cookie, post, header, response, source));
    }
}
