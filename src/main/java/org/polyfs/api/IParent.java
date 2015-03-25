package org.polyfs.api;

/**
 * Created by adaolena on 25/03/15.
 */
public interface IParent {
    long getID();
    String getName();
    String getPath();
    RootNode getRoot();
}
