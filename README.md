# TabLayoutDemo
design包下TabLayout的使用，这里使用了自定义tab的布局

使用TabLayout自带的添加文字，添加icon位置总是掌握不好，所以就使用setCustomView()添加自定义布局的tab
在自定义布局中只要给Imageview和TextView设置选择器，就可以根据我们的点击自己变换颜色，背景。
这样结合tablayout和自定义tab布局，我们既能得到我们想要的布局效果，又比抛弃tablayout自己写布局后代码逻辑简单

TabLayout的一些属性参考简书一篇文章的讲述：http://www.jianshu.com/p/2b2bb6be83a8
其中：
app:tabBackground="color"这个属性我试了一下，并不是改变tablayout的整体背景，而是每个tab的背景（可以自己写一个渐变的drawable试试）
app:tabIndicatorColor="@android:color/holo_orange_light"这个是指示器的颜色，如果不想要指示器，直接设为透明，可以直接去掉指示器的属性我没去找

