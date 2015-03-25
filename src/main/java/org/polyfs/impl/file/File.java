package org.polyfs.impl.file;

import org.polyfs.api.IElement;
import org.polyfs.api.IPersister;
import org.polyfs.api.RootNode;

/**
 * Created by adaolena on 25/03/15.
 */
public class File implements IElement {
    @Override
    public byte[] getData() {
        return new byte[0];
    }

    @Override
    public IPersister getPersister() {
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
