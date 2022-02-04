package com.purple.myapplication.segment.strategy;

import com.purple.myapplication.PhotoMovie;
import com.purple.myapplication.model.PhotoData;
import com.purple.myapplication.segment.MovieSegment;

import java.util.List;

/**
 * Created by Administrator on 2015/6/12.
 */
public class NotRetryStrategy implements RetryStrategy {
    @Override
    public List<PhotoData> getAvailableData(PhotoMovie photoMovie, MovieSegment movieSegment) {
        return movieSegment==null?null:movieSegment.getAllocatedPhotos();
    }
}
