// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from libunity.djinni

package com.gulden.jniunifiedbackend;

/** This interface will be implemented in Java and ObjC and can be called from C++. */
public abstract class GuldenUnifiedFrontend {
    /**
     * Fraction of work done since session start or last progress reset [0..1]
     * Unified progress combines connection state, header and block sync
     */
    public abstract void notifyUnifiedProgress(float progress);

    public abstract boolean notifyBalanceChange(BalanceRecord newBalance);

    public abstract boolean notifyNewTransaction(TransactionRecord newTransaction);

    public abstract void notifyInitWithExistingWallet();

    public abstract void notifyInitWithoutExistingWallet();

    public abstract boolean notifyShutdown();

    public abstract boolean notifyCoreReady();

    public abstract void logPrint(String str);
}
