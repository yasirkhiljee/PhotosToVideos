package com.purple.myapplication.segment.strategy;

import com.purple.myapplication.PhotoMovie;
import com.purple.myapplication.model.PhotoData;
import com.purple.myapplication.segment.MovieSegment;

import java.util.List;

/**
 * Created by yellowcat on 2015/6/12.
 */
public interface RetryStrategy {
    List<PhotoData> getAvailableData(PhotoMovie photoMovie, MovieSegment movieSegment);
}
