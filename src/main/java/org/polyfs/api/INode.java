package org.polyfs.api;

import java.util.List;

/**
 * Created by adaolena on 25/03/15.
 */
public interface INode extends IParent{

    List<IElement> getChild();
    List<INode> getChildNode();
    INode getParent();
    INodePersister getINodePersister();

}
