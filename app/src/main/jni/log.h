#pragma once

#include <android/log.h>

#define MV_LOG_TAG "NDKBaseExampleJNI"
#define LOGE(...)  __android_log_print(ANDROID_LOG_ERROR, MV_LOG_TAG, ##__VA_ARGS__)
#define LOGD(...)  __android_log_print(ANDROID_LOG_DEBUG, MV_LOG_TAG, ##__VA_ARGS__)