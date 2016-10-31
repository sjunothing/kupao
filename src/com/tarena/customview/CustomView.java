package com.tarena.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
//�̳�֮view��view����������Զ���ؼ�
public class CustomView extends View{
	
	int viewWidth,viewHeight;
//��ѡ����Ҫ��������Attribute����
	//һ�����������ã�û��������Ϣ
//	public CustomView(Context context) {
//super(context);
//	}
	public CustomView(Context context,
			AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	//���ƽ���
	@Override
	protected void onDraw(Canvas canvas) {
		//������
		//�����ֺ�,color
		Paint paint=new Paint();
		paint.setColor(Color.RED);
		
		//������
		Rect rect=new Rect(0, 0, viewWidth, viewHeight);
		
		//��ͼ�Σ����֣�ͼƬ
		canvas.drawRect(rect, paint);
		
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		viewHeight=h;
		viewWidth=w;
	}
	

}
