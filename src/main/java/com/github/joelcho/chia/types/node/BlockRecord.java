// File created at: Thursday, April 22, 2021
// File encoding  : UTF-8
// Line separator : LF
// Tab stop       : 4 spaces
// IDE            : IntelliJ IDEA community edition
package com.github.joelcho.chia.types.node;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.joelcho.chia.converter.ClassgroupElementConverter;
import com.github.joelcho.chia.converter.Uint128Converter;
import com.github.joelcho.chia.converter.Uint64Converter;
import com.github.joelcho.chia.types.ClassgroupElement;
import com.github.joelcho.chia.types.primitive.Bytes32;
import com.github.joelcho.chia.types.primitive.Uint128;
import com.github.joelcho.chia.types.primitive.Uint64;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

/**
 * @author Joel
 */
@Data
public class BlockRecord {
    private Bytes32 headerHash;
    private Bytes32 prevHash;
    private long height;
    private Uint128 weight;
    private Uint128 totalIters;
    private short signagePointIndex;
    private ClassgroupElement challengeVdfOutput;
    private ClassgroupElement infusedChallengeVdfOutput;
    private Bytes32 rewardInfusionNewChallenge;
    private Bytes32 challengeBlockInfoHash;
    private Uint64 subSlotIters;
    private Bytes32 poolPuzzleHash;
    private Bytes32 farmerPuzzleHash;
    private Uint64 requiredIters;
    private int deficit;
    private boolean overflow;
    private long prevTransactionBlockHeight;

    private Uint64 timestamp;
    private Bytes32 prevTransactionBlockHash;
    private Uint64 fees;
    private List<Coin> rewardClaimsIncorporated;

    private List<Bytes32> finishedChallengeSlotHashes;
    private List<Bytes32> finishedInfusedChallengeSlotHashes;
    private List<Bytes32> finishedRewardSlotHashes;

    private SubEpochSummary subEpochSummaryIncluded;

    public Bytes32 getHeaderHash() {
        return headerHash;
    }

    public Bytes32 getPrevHash() {
        return prevHash;
    }

    public long getHeight() {
        return height;
    }

    public Uint128 getWeight() {
        return weight;
    }

    public Uint128 getTotalIters() {
        return totalIters;
    }

    public short getSignagePointIndex() {
        return signagePointIndex;
    }

    public ClassgroupElement getChallengeVdfOutput() {
        return challengeVdfOutput;
    }

    public ClassgroupElement getInfusedChallengeVdfOutput() {
        return infusedChallengeVdfOutput;
    }

    public Bytes32 getRewardInfusionNewChallenge() {
        return rewardInfusionNewChallenge;
    }

    public Bytes32 getChallengeBlockInfoHash() {
        return challengeBlockInfoHash;
    }

    public Uint64 getSubSlotIters() {
        return subSlotIters;
    }

    public Bytes32 getPoolPuzzleHash() {
        return poolPuzzleHash;
    }

    public Bytes32 getFarmerPuzzleHash() {
        return farmerPuzzleHash;
    }

    public Uint64 getRequiredIters() {
        return requiredIters;
    }

    public int getDeficit() {
        return deficit;
    }

    public boolean isOverflow() {
        return overflow;
    }

    public long getPrevTransactionBlockHeight() {
        return prevTransactionBlockHeight;
    }

    public Uint64 getTimestamp() {
        return timestamp;
    }

    public Bytes32 getPrevTransactionBlockHash() {
        return prevTransactionBlockHash;
    }

    public Uint64 getFees() {
        return fees;
    }

    public List<Coin> getRewardClaimsIncorporated() {
        return rewardClaimsIncorporated;
    }

    public List<Bytes32> getFinishedChallengeSlotHashes() {
        return finishedChallengeSlotHashes;
    }

    public List<Bytes32> getFinishedInfusedChallengeSlotHashes() {
        return finishedInfusedChallengeSlotHashes;
    }

    public List<Bytes32> getFinishedRewardSlotHashes() {
        return finishedRewardSlotHashes;
    }

    public SubEpochSummary getSubEpochSummaryIncluded() {
        return subEpochSummaryIncluded;
    }
}
