cmake_minimum_required(VERSION 3.4.1)

add_library( NDKBaseExampleJNI SHARED
	ndkbaseexamplejni.cpp

	log.h
	JniUtils.h
	JniUtils.cpp
)

target_link_libraries(NDKBaseExampleJNI
	PRIVATE
	log
)