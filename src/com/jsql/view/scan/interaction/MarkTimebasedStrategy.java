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

import org.apache.log4j.Logger;

import com.jsql.view.swing.MediatorGUI;

/**
 * Mark the injection as invulnerable to a time based injection.
 */
public class MarkTimebasedStrategy implements IInteractionCommand {
    public static final Logger LOGGER = Logger.getLogger(MarkTimebasedStrategy.class);

    /**
     * @param interactionParams
     */
    public MarkTimebasedStrategy(Object[] interactionParams) {
        // Do nothing
    }

    @Override
    public void execute() {
        LOGGER.trace("Using Time based injection.");
    }
}
