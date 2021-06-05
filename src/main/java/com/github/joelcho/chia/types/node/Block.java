// File created at: Thursday, April 22, 2021
// File encoding  : UTF-8
// Line separator : LF
// Tab stop       : 4 spaces
// IDE            : IntelliJ IDEA community edition
package com.github.joelcho.chia.types.node;

import com.github.joelcho.chia.types.primitive.Bytes32;
import lombok.Data;

import java.util.List;

/**
 * @author Joel
 */
@Data
public class Block {
    private List<EndOfSubSlotBundle> finishedSubSlots;
    private RewardChainBlock rewardChainBlock;
    private VDFProof challengeChainSpProof;
    private VDFProof challengeChainIpProof;
    private VDFProof rewardChainSpProof;
    private VDFProof rewardChainIpProof;
    private VDFProof infusedChallengeChainIpProof;
    private Foliage foliage;
    private FoliageTransactionBlock foliageTransactionBlock;
    private TransactionsInfo transactionsInfo;
    private Object transactionsGenerator; // SerializedProgram
    private List<Long> transactionsGeneratorRefList;
    private Bytes32 headerHash;

    public List<EndOfSubSlotBundle> getFinishedSubSlots() {
        return finishedSubSlots;
    }

    public RewardChainBlock getRewardChainBlock() {
        return rewardChainBlock;
    }

    public VDFProof getChallengeChainSpProof() {
        return challengeChainSpProof;
    }

    public VDFProof getChallengeChainIpProof() {
        return challengeChainIpProof;
    }

    public VDFProof getRewardChainSpProof() {
        return rewardChainSpProof;
    }

    public VDFProof getRewardChainIpProof() {
        return rewardChainIpProof;
    }

    public VDFProof getInfusedChallengeChainIpProof() {
        return infusedChallengeChainIpProof;
    }

    public Foliage getFoliage() {
        return foliage;
    }

    public FoliageTransactionBlock getFoliageTransactionBlock() {
        return foliageTransactionBlock;
    }

    public TransactionsInfo getTransactionsInfo() {
        return transactionsInfo;
    }

    public Object getTransactionsGenerator() {
        return transactionsGenerator;
    }

    public List<Long> getTransactionsGeneratorRefList() {
        return transactionsGeneratorRefList;
    }

    public Bytes32 getHeaderHash() {
        return headerHash;
    }
}
