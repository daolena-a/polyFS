package org.polyfs.api;

/**
 * Created by adaolena on 25/03/15.
 */
public interface IPersister {
    void write(IElement element);
    void getIElement(long id);
}
