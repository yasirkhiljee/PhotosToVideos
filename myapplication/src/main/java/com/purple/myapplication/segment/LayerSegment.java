package com.purple.myapplication.segment;

import com.purple.myapplication.segment.layer.MovieLayer;

/**
 * Created by huangwei on 2015/6/10.
 */
public class LayerSegment extends AbsLayerSegment {

    public LayerSegment(MovieLayer[] layers, int duration) {
        super(duration);
        mLayers = layers;
    }

    @Override
    protected MovieLayer[] initLayers() {
        return mLayers;
    }
}
