package com.y30.ndkbaseexample;

import android.content.Context;
import android.util.Log;

import com.getkeepsafe.relinker.MissingLibraryException;
import com.getkeepsafe.relinker.ReLinker;


public class JNIBridge {

    /////////////////////
    //    JNI Functions
    /////////////////////

    public static native int JNIDoSomething(String helloJavaStr);


    /////////////////////
    //    Library Loader
    /////////////////////

    private static String LIBRARY_NAME = "NDKBaseExampleJNI";
    private static boolean m_libraryIsLoaded = false;
    private static String TAG = "NDKBaseExampleLoader";
    
    public static boolean LoadLibrary(Context Xi_context) 
    {
        if (m_libraryIsLoaded) 
        {
            Log.d(TAG, "JNIBridge library: " + LIBRARY_NAME + " , already loaded.");
            return true;
        }

        Log.d(TAG, "JNIBridge start to loadLibrary: " + LIBRARY_NAME);
        try 
        {
            ReLinker.loadLibrary(Xi_context, LIBRARY_NAME);
        } 
        catch (MissingLibraryException | UnsatisfiedLinkError e) 
        {
            Log.d(TAG, "JNIBridge catch exception in loadLibrary: " + LIBRARY_NAME);
            //throw new UnsupportedOperationException("Failed to load native library " + LIBRARY_NAME, e);
            return false;
        }

        m_libraryIsLoaded = true;
        Log.d(TAG, "JNIBridge finished to loadLibrary: " + LIBRARY_NAME);

        return true;
    }

    public static boolean IsLoadLibraryLoaded() 
    {
        return m_libraryIsLoaded;
    }
}