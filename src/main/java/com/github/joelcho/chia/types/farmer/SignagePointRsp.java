// File created at: Friday, April 23, 2021
// File encoding  : UTF-8
// Line separator : LF
// Tab stop       : 4 spaces
// IDE            : IntelliJ IDEA community edition
package com.github.joelcho.chia.types.farmer;

import com.github.joelcho.chia.types.node.ProofOfSpace;
import lombok.Data;

import java.util.List;

/**
 * @author Joel
 */
@Data
public class SignagePointRsp {
    private NewSignagePoint signagePoint;
    private List<ProofOfSpace> proofs;
}
