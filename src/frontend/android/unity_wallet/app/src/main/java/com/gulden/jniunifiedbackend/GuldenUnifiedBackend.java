// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from libunity.djinni

package com.gulden.jniunifiedbackend;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/** This interface will be implemented in C++ and can be called from any language. */
public abstract class GuldenUnifiedBackend {
    /** Interface constants */
    public static final int VERSION = 1;

    /** Start the library */
    public static int InitUnityLib(String dataDir, boolean testnet, GuldenUnifiedFrontend signals)
    {
        return CppProxy.InitUnityLib(dataDir,
                                     testnet,
                                     signals);
    }

    /** Create the wallet - this should only be called after receiving a `notifyInit...` signal from InitUnityLib */
    public static boolean InitWalletFromRecoveryPhrase(String phrase)
    {
        return CppProxy.InitWalletFromRecoveryPhrase(phrase);
    }

    /** Create the wallet - this should only be called after receiving a `notifyInit...` signal from InitUnityLib */
    public static boolean InitWalletLinkedFromURI(String linkedUri)
    {
        return CppProxy.InitWalletLinkedFromURI(linkedUri);
    }

    /** Check if a possible recovery phrase is valid or not */
    public static boolean IsValidRecoveryPhrase(String phrase)
    {
        return CppProxy.IsValidRecoveryPhrase(phrase);
    }

    /** Generate a new recovery mnemonic */
    public static String GenerateRecoveryMnemonic()
    {
        return CppProxy.GenerateRecoveryMnemonic();
    }

    /** Stop the library */
    public static void TerminateUnityLib()
    {
        CppProxy.TerminateUnityLib();
    }

    /** Generate a QR code for a string, QR code will be as close to widthHint as possible when applying simple scaling. */
    public static QrcodeRecord QRImageFromString(String qrString, int widthHint)
    {
        return CppProxy.QRImageFromString(qrString,
                                          widthHint);
    }

    /** Get a receive address from the wallet */
    public static String GetReceiveAddress()
    {
        return CppProxy.GetReceiveAddress();
    }

    /** Get a receive address from the wallet */
    public static String GetRecoveryPhrase()
    {
        return CppProxy.GetRecoveryPhrase();
    }

    /** Rescan blockchain for wallet transactions */
    public static void DoRescan()
    {
        CppProxy.DoRescan();
    }

    /** Check if text/address is something we are capable of sending money too */
    public static UriRecipient IsValidRecipient(UriRecord request)
    {
        return CppProxy.IsValidRecipient(request);
    }

    /** Attempt to pay a recipient */
    public static boolean performPaymentToRecipient(UriRecipient request)
    {
        return CppProxy.performPaymentToRecipient(request);
    }

    /** Get list of all transactions wallet has been involved in */
    public static ArrayList<TransactionRecord> getTransactionHistory()
    {
        return CppProxy.getTransactionHistory();
    }

    /** Get list of all address book entries */
    public static ArrayList<AddressRecord> getAddressBookRecords()
    {
        return CppProxy.getAddressBookRecords();
    }

    /** Add a record to the address book */
    public static void addAddressBookRecord(AddressRecord address)
    {
        CppProxy.addAddressBookRecord(address);
    }

    /** Delete a record from the address book */
    public static void deleteAddressBookRecord(AddressRecord address)
    {
        CppProxy.deleteAddressBookRecord(address);
    }

    /** Interim persist and prune of state. Use at key moments like app backgrounding. */
    public static void PersistAndPruneForSPV()
    {
        CppProxy.PersistAndPruneForSPV();
    }

    /**
     * Reset progress notification. In cases where there has been no progress for a long time, but the process
     * is still running the progress can be reset and will represent work to be done from this reset onwards.
     * For example when the process is in the background on iOS for a long long time (but has not been terminated
     * by the OS) this might make more sense then to continue the progress from where it was a day or more ago.
     */
    public static void ResetUnifiedProgress()
    {
        CppProxy.ResetUnifiedProgress();
    }

    private static final class CppProxy extends GuldenUnifiedBackend
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void _djinni_private_destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            _djinni_private_destroy();
            super.finalize();
        }

        public static native int InitUnityLib(String dataDir, boolean testnet, GuldenUnifiedFrontend signals);

        public static native boolean InitWalletFromRecoveryPhrase(String phrase);

        public static native boolean InitWalletLinkedFromURI(String linkedUri);

        public static native boolean IsValidRecoveryPhrase(String phrase);

        public static native String GenerateRecoveryMnemonic();

        public static native void TerminateUnityLib();

        public static native QrcodeRecord QRImageFromString(String qrString, int widthHint);

        public static native String GetReceiveAddress();

        public static native String GetRecoveryPhrase();

        public static native void DoRescan();

        public static native UriRecipient IsValidRecipient(UriRecord request);

        public static native boolean performPaymentToRecipient(UriRecipient request);

        public static native ArrayList<TransactionRecord> getTransactionHistory();

        public static native ArrayList<AddressRecord> getAddressBookRecords();

        public static native void addAddressBookRecord(AddressRecord address);

        public static native void deleteAddressBookRecord(AddressRecord address);

        public static native void PersistAndPruneForSPV();

        public static native void ResetUnifiedProgress();
    }
}
