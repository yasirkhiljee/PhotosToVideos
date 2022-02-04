package com.purple.myapplication.moviefilter;

import com.purple.myapplication.PhotoMovie;
import com.purple.myapplication.opengl.FboTexture;

/**
 * Created by huangwei on 2018/9/5 0005.
 */
public interface IMovieFilter {
    void doFilter(PhotoMovie photoMovie,int elapsedTime, FboTexture inputTexture, FboTexture outputTexture);
    void release();
}
