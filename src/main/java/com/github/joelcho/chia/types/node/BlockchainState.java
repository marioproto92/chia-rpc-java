// File created at: Thursday, April 22, 2021
// File encoding  : UTF-8
// Line separator : LF
// Tab stop       : 4 spaces
// IDE            : IntelliJ IDEA community edition
package com.github.joelcho.chia.types.node;

import com.github.joelcho.chia.types.primitive.Uint128;
import com.github.joelcho.chia.types.primitive.Uint64;
import lombok.Data;

/**
 * @author Joel
 */
@Data
public class BlockchainState {
    private Uint64 difficulty;
    private boolean genesisChallengeInitialized;
    private long mempoolSize;
    private BlockRecord peak;
    private Uint128 space;
    private Uint64 subSlotIters;
    private SyncStatus sync;

    public Uint64 getDifficulty() {
        return difficulty;
    }

    public boolean isGenesisChallengeInitialized() {
        return genesisChallengeInitialized;
    }

    public long getMempoolSize() {
        return mempoolSize;
    }

    public BlockRecord getPeak() {
        return peak;
    }

    public Uint128 getSpace() {
        return space;
    }

    public Uint64 getSubSlotIters() {
        return subSlotIters;
    }

    public SyncStatus getSync() {
        return sync;
    }
}
