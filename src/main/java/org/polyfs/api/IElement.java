package org.polyfs.api;

/**
 * Created by adaolena on 25/03/15.
 */
public interface IElement {
    long getID();
    byte[] getData();
    IPersister getPersister();
}
