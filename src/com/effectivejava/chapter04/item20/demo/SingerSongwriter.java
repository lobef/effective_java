package com.effectivejava.chapter04.item20.demo;

// 即使歌唱家又是作曲家
public interface SingerSongwriter extends Singer, Songwriter {

	AudioClip strum();

	void actSensitive();

}
