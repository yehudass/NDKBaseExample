#pragma once

#include <jni.h>
#include <string>

bool GetJString(JNIEnv *env, jstring& Xi_js, std::string& Xi_str);