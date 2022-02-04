package com.purple.myapplication.opengl.animations;


import com.purple.myapplication.opengl.GLESCanvas;

public abstract class CanvasAnim extends Animation {

    public abstract int getCanvasSaveFlags();

    public abstract void apply(GLESCanvas canvas);
}
