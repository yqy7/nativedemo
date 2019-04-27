#include "com_github_yqy7_nativejni_TestJni.h"

JNIEXPORT void JNICALL Java_com_github_yqy7_nativejni_TestJni_print(JNIEnv *env, jobject jobj)
{
  printf("hello jni.\n");
}