#include "JniUtils.h"
#include "log.h"

bool GetJString(JNIEnv *env, jstring& Xi_js, std::string& Xi_str)
{
	if (!Xi_js)
	{
      LOGE("GetJString ERROR jstring is null");
		return false;
	}
   jboolean isCopy;
   const char* pValue = env->GetStringUTFChars(Xi_js, &isCopy);
   Xi_str = pValue;
   env->ReleaseStringUTFChars(Xi_js, pValue);
   return true;
}
