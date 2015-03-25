package org.polyfs.impl.file;

import org.polyfs.api.IElement;
import org.polyfs.api.INode;
import org.polyfs.api.INodePersister;
import org.polyfs.api.RootNode;

import java.util.List;

/**
 * Created by adaolena on 25/03/15.
 */
public class Directory implements INode {
    @Override
    public List<IElement> getChild() {
        return null;
    }

    @Override
    public List<INode> getChildNode() {
        return null;
    }

    @Override
    public INode getParent() {
        return null;
    }

    @Override
    public INodePersister getINodePersister() {
        return null;
    }

    @Override
    public long getID() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public RootNode getRoot() {
        return null;
    }
}
