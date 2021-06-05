// File created at: Thursday, April 22, 2021
// File encoding  : UTF-8
// Line separator : LF
// Tab stop       : 4 spaces
// IDE            : IntelliJ IDEA community edition
package com.github.joelcho.chia.types.node;

import lombok.Data;

/**
 * @author Joel
 */
@Data
public class SyncStatus {
    private boolean syncMode;
    private long syncProgressHeight;
    private long syncTipHeight;
    private boolean synced;

    public boolean isSyncMode() {
        return syncMode;
    }

    public long getSyncProgressHeight() {
        return syncProgressHeight;
    }

    public long getSyncTipHeight() {
        return syncTipHeight;
    }

    public boolean isSynced() {
        return synced;
    }
}
