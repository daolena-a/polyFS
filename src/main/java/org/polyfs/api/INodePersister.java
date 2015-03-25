package org.polyfs.api;

/**
 * Created by adaolena on 25/03/15.
 */
public interface INodePersister {
    void write(INode node);
    void getINode(long id);
}
