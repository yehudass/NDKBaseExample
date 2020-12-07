#include <jni.h>

#include "log.h"
#include "JniUtils.h"

extern "C"
JNIEXPORT int JNICALL
Java_com_y30_ndkbaseexample_JNIBridge_JNIDoSomething(JNIEnv *env, jclass, jstring hellostr)
{
	std::string helloJNI;
	if(!GetJString(env, hellostr, helloJNI))
	{
		LOGE("JNIDoSomething: Failed to get java string");
		return 1;
	}
	LOGD("JNIDoSomething: java hello string is: '%s'", helloJNI.c_str());
	return 0;
}