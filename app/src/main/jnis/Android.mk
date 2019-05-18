LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := Hello
LOCAL_LDFLAGS := -Wl,--build-id
LOCAL_SRC_FILES := \
	/Users/lannyxu/Desktop/androidSrc/pluginDev/JniHelloWorldTest1/app/src/main/jni/lanny_com_so_JniUtils.c \

LOCAL_C_INCLUDES += /Users/lannyxu/Desktop/androidSrc/pluginDev/JniHelloWorldTest1/app/src/main/jni
LOCAL_C_INCLUDES += /Users/lannyxu/Desktop/androidSrc/pluginDev/JniHelloWorldTest1/app/src/debug/jni

include $(BUILD_SHARED_LIBRARY)
