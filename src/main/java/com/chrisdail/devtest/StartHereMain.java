package com.chrisdail.devtest;

import java.io.IOException;
import java.io.InputStreamReader;
import com.chrisdail.devtest.provided.StoragePool;
import com.chrisdail.devtest.provided.StoragePoolReader;

/**
 * Java Programming Test.
 * 
 * GOAL: The purpose of this project is to parse the StoragePools.txt file.
 * Each row in this file should be mapped to a StoragePool object. This main
 * class uses a StoragePoolReader to read all records from all pools.
 * 
 * - Skeleton application is provided for convenience. You should not need to
 *   modify anything in com.chrisdail.devtest.provided
 * - The com.chrisdail.devtest.provided.StoragePoolReader is an interface you need to
 *   implement.
 * - StoragePools.txt is the sample file you will be reading/parsing
 * - StoragePools.txt is a comma separate (CSV) file. Each comma denotes a separate
 *   value with the first row defining the names of each field.
 * - All sizes are in GigaBytes
 * - Storage Pool Sizes are:
 *   - totalSize = Total number of GB available on the drive
 *   - usedSize = Total number of GB used on the drive
 *   - freeSize = Number of GB available (not used)
 * - Get as much done as you can. If is perfectly acceptable not to complete the
 *   task. That is fine. A partial solution is better than no solution. Do as
 *   much as you can.
 *   
 * Hints:
 * - Some helper libraries have been included on the classpath: apache commons etc.
 * - Look at org.apache.commons.io.IOUtils.readLines() for reading from a Reader
 * - Feel free to use the internet as a reference (google)
 * - If you get stuck or need a clarification, feel free to ask
 */
public class StartHereMain {
    public static void main(String[] args) throws IOException {
        // TODO: Change this to be your implementation of StoragePoolReader
        StoragePoolReader poolReader = null; //new StoragePoolReaderImpl();
        
        poolReader.readStoragePools(new InputStreamReader(StartHereMain.class.getResourceAsStream("StoragePools.txt")));
        for (StoragePool pool: poolReader.getPools()) {
            System.out.println(String.format("%s %s (%s)", pool.getId(), pool.getPoolName(), pool.getRaidLevel()));
            System.out.println(String.format("  Used:  %sGB", pool.getUsedSize()));
            System.out.println(String.format("  Total: %sGB", pool.getTotalSize()));
            System.out.println(String.format("  Free:  %sGB", pool.getFreeSize()));
        }
    }
}
