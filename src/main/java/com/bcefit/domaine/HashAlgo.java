package com.bcefit.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HashAlgo {

    @Id
    private int HashAlgoId;
    private String HashAlgoName;

    public HashAlgo() {
    }

    public int getHashAlgoId() {
        return HashAlgoId;
    }

    public void setHashAlgoId(int hashAlgoId) {
        HashAlgoId = hashAlgoId;
    }

    public String getHashAlgoName() {
        return HashAlgoName;
    }

    public void setHashAlgoName(String hashAlgoName) {
        HashAlgoName = hashAlgoName;
    }
}
