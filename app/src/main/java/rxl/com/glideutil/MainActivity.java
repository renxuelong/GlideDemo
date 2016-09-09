package rxl.com.glideutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image);

//        Glide.with(this).load("http://jcodecraeer.com/uploads/20150327/1427445293711143.png").into(imageView); // 普通加载
//        Glide.with(this).load("http://jcodecraeer.com/uploads/20150327/1427445293711143.png").placeholder(R.mipmap.ic_launcher)
//                .error(R.mipmap.ic_launcher).into(imageView);  // 设置加载时动画和失败时动画
//        Glide.with(this).load("http://jcodecraeer.com/uploads/20150327/1427445293711143.png")
//                .skipMemoryCache(true).into(imageView); // 跳过内存缓存
//        Glide.with(this).load("http://jcodecraeer.com/uploads/20150327/1427445293711143.png")
//                .priority(Priority.NORMAL).into(imageView); // 设置优先级
//        Glide.with(this).load("http://jcodecraeer.com/uploads/20150327/1427445293711143.png")
//                .diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView); // 设置缓存策略 ALL Glide既缓存全尺寸又缓存其他尺寸

//        Glide.with(this).load("http://jcodecraeer.com/uploads/20150327/1427445293711143.png").animate(R.anim.animation).into(imageView); // 设置动画
//        Glide.with(this).load("http://jcodecraeer.com/uploads/20150327/1427445293711143.png").crossFade().into(imageView);

//        Glide.get(this).clearMemory();//清理内存缓存  可以在UI主线程中进行
    }
}
