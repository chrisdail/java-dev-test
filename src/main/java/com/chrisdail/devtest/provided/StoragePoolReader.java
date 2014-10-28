package com.chrisdail.devtest.provided;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public interface StoragePoolReader {
    public void readStoragePools(Reader reader) throws IOException;
    public List<StoragePool> getPools();
    public StoragePool getPool(String id);
}
