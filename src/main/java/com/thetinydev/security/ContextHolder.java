package com.thetinydev.security;

public class ContextHolder {


    private static final ThreadLocal<String> currentUserId = new ThreadLocal<>();

    public static void setCurrentUserId(String id) {
        currentUserId.set(id);
    }

    public static String getCurrentUserId() {
        return currentUserId.get();
    }
}
