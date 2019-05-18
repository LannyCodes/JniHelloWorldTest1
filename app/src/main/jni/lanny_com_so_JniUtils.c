#include  "lanny_com_so_JniUtils.h"
JNIEXPORT jstring JNICALL Java_lanny_com_so_JniUtils_getString
        (JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "Hello Jianqiang");
}