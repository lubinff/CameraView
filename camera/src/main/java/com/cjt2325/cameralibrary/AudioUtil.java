package com.cjt2325.cameralibrary;

import android.content.Context;
import android.media.AudioManager;

/**
 * 作者: 陈嘉桐 on 2017/2/12
 * 邮箱: 445263848@qq.com.
 */
public class AudioUtil {
    public static void setAudioManage(Context context){
        AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        audioManager.setStreamMute(AudioManager.STREAM_SYSTEM, true);
        audioManager.setStreamMute(AudioManager.STREAM_MUSIC, true);
        audioManager.setStreamVolume(AudioManager.STREAM_ALARM, 0, 0);
        audioManager.setStreamVolume(AudioManager.STREAM_DTMF, 0, 0);
        audioManager.setStreamVolume(AudioManager.STREAM_NOTIFICATION, 0, 0);
        audioManager.setStreamVolume(AudioManager.STREAM_RING, 0, 0);
    }
}
