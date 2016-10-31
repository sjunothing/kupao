package com.tarena.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
//继承之view或view的子类就是自定义控件
public class CustomView extends View{
	
	int viewWidth,viewHeight;
//构选方法要两个参数Attribute属性
	//一个参数不能用，没有属性信息
//	public CustomView(Context context) {
//super(context);
//	}
	public CustomView(Context context,
			AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	//绘制界面
	@Override
	protected void onDraw(Canvas canvas) {
		//画背景
		//设置字号,color
		Paint paint=new Paint();
		paint.setColor(Color.RED);
		
		//画矩形
		Rect rect=new Rect(0, 0, viewWidth, viewHeight);
		
		//画图形，文字，图片
		canvas.drawRect(rect, paint);
		
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		viewHeight=h;
		viewWidth=w;
	}
	

}
