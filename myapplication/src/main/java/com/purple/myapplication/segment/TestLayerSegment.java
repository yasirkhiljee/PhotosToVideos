package com.purple.myapplication.segment;

import com.purple.myapplication.segment.layer.MovieLayer;
import com.purple.myapplication.segment.layer.MovieTextLayer;
import com.purple.myapplication.segment.layer.TestBaseLayer;
import com.purple.myapplication.segment.layer.TestMuiltBitmapLayer;

/**
 * Created by huangwei on 2015/6/4.
 */
public class TestLayerSegment extends AbsLayerSegment {

    public TestLayerSegment() {
        super();
    }

    public TestLayerSegment(int duration) {
        super(duration);
    }

    @Override
    protected MovieLayer[] initLayers() {
        TestBaseLayer baseLayer = new TestBaseLayer();
        TestMuiltBitmapLayer testMuiltBitmapLayer = new TestMuiltBitmapLayer();
        testMuiltBitmapLayer.setParentLayer(baseLayer);
        MovieTextLayer movieTextLayer = new MovieTextLayer();
        return new MovieLayer[]{testMuiltBitmapLayer, baseLayer,movieTextLayer};
    }
}
