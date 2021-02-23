实验1：Android基本编程验证
一、实验目的
	熟练掌握Android开发环境搭建和Android Studio的使用；
	了解Android Studio中项目的文件目录结构；
	掌握基于Activity的Android APP的设计和编码方法，根据需求完成APP界面和Activity之间的数据传递功能。
	掌握基本的编程环境，在手机app上实现常见的教学小程序，验证Android的基本编程。
二、实验内容
	Android Studio安装与基本使用方法；
	编程实现helloworld
	编程实现百钱白鸡问题
	编程实现 1到100 的素数和
	编程实现求水仙花数
三、实验要求
	实现上述的基本功能要求。
	实验报告提交内容：1）结合系统界面（截图）介绍APP功能；2）核心实现代码（Java或Kotlin代码）和布局文件等。

实验2：Activity
一、实验目的
	掌握基于Activity的Android APP的设计和编码方法，根据需求完成APP界面和Activity之间的数据传递功能。
二、实验内容
	设计实现一个判断题题库Android APP，其基本功能包括：1）启动后显示第一个题目的界面，如图1-1所示，界面中包含了题目内容、“正确”、“错误”、“查看答案”和“下一个”按钮。点击“正确”或“错误”表示用于给出的答案，点击“下一个”进入下一个判断题；2）用户点击“查看”答案后，显示如图1-2所示的界面，其中显示提示信息“确定看答案？”和“答案”按钮。用户点击“答案”后，界面显示该题目的标准答案，如图1-3所示；3）用户如果在题目界面未选择答案而直接进入答案界面并查看了答案，再次回到题目界面（图1）点击“正确”或“错误”按钮，界面提示信息，如图1-4所示的“作弊是不对的”。
 
图1-1 题目界面	 
图1-2 查看“答案”界面
 
图1-3 查看答案	 
图1-4 提示信息界面
三、实验要求
	实现上述的基本功能要求。说明：题库内容可以写在代码中。在此基础上，可以进一步优化界面，也可以进一步添加其他功能。
	实验报告提交内容：1）结合系统界面（截图）介绍APP功能；2）核心实现代码（Java或Kotlin代码）和布局文件等。
实验3 Android UI 
一、实验目的
	熟练掌握基于UI控件、布局、Activity等技术的Android APP的界面实现技术，以及基于Android Studio的APP UI实现方法。
二、实验内容
	实现显示商品列表的APP界面，如图2-1所示。点击一个商品后，可以显示商品详情。
 
三、实验要求
	实现上述的基本功能要求。说明：商品内容可以写在代码中。在此基础上，可以进一步优化界面，也可以进一步添加其他功能。
	实验报告提交内容：1）结合系统界面（截图）介绍APP功能；2）核心实现代码（Java或Kotlin代码）和布局文件等。



实验4：Fragment
一、实验目的
	掌握Fragment的使用，体会如何更加合理地利用大屏幕平板电脑的空间。
	掌握Fragment的生命周期。
二、实验内容
	实现天哥视频教程中的案例
	参考网页：https://www.jianshu.com/p/a4c51309bc19，理解相关知识，并实现示例代码；
a)	静态加载的流程
•	定义Fragment的xml布局文件
•	自定义Fragment类，继承Fragment类或其子类，同时实现onCreate()方法，在方法中，通过inflater.inflate加载布局文件，接着返回其View
•	在需要加载Fragment的Activity对应布局文件中<fragment>的name属性设为全限定类名，即包名.fragment
•	最后在Activity调用setContentView()加载布局文件即可
b)	动态加载Fragment的流程：
•	获得FragmentManager对象，通过getSupportFragmentManager() 
•	获得FragmentTransaction对象，通过fm.beginTransaction() 
•	调用add()方法或者repalce()方法加载Fragment；
•	最后调用commit()方法提交事务
c)	传递数据给Fragment
•	在Activity中创建Bundle数据包，调用Fragment实例的setArguments()，将Bundle数据包传给Fragment
•	Fragment调用getArguments()获得Bundle对象，然后进行解析就可以
d)	 传递数据给Activity
•	在Fragment中定义一个内部回调接口，再让包含该Fragment的Activity实现该回调接口
•	Fragment通过回调接口传数据
	
	
三、实验要求
	实现上述的基本功能要求。在此基础上，可以进一步优化界面，也可以进一步添加其他功能。
	实验报告提交内容：1）结合系统界面（截图）介绍APP功能；2）核心实现代码（Java或Kotlin代码）和布局文件等。
实验5 Intent 
一、实验目的
	熟练掌握Intent用法。
二、实验内容
参考网页https://www.jianshu.com/p/67d99a82509b，完成如下实验
•	调用拨号程序
•	发送短信或彩信
•	通过浏览器打开网页
•	发送电子邮件
•	显示地图与路径规划
•	播放多媒体
•	选择图片
•	拍照
•	获取并剪切图片
•	打开手机应用市场
•	安装程序
•	卸载程序
•	进入设置界面

三、实验要求
	实现上述的基本功能要求。自定义界面和功能.
	实验报告提交内容：1）结合系统界面（截图）介绍APP功能；2）核心实现代码（Java或Kotlin代码）和布局文件等。

实验6 广播 
一、实验目的
	熟练掌握基于UI控件、布局、Activity等技术的Android APP的界面实现技术，以及基于Android Studio的APP UI实现方法。
二、实验内容
https://www.jianshu.com/p/fecc4023abb8
	实现显示商品列表的APP界面，如图2-1所示。点击一个商品后，可以显示商品详情。

三、实验要求
	实现上述的基本功能要求。说明：商品内容可以写在代码中。在此基础上，可以进一步优化界面，也可以进一步添加其他功能。
	实验报告提交内容：1）结合系统界面（截图）介绍APP功能；2）核心实现代码（Java或Kotlin代码）和布局文件等。
实验7 Service 
一、实验目的
	熟练掌握Service。
二、实验内容

https://www.jianshu.com/p/d48168c7ed2d?from=timeline

	。

三、实验要求
	实现上述的基本功能要求。说明：商品内容可以写在代码中。在此基础上，可以进一步优化界面，也可以进一步添加其他功能。
	实验报告提交内容：1）结合系统界面（截图）介绍APP功能；2）核心实现代码（Java或Kotlin代码）和布局文件等。
实验8 数据存储和共享 
一、实验目的
	熟练掌握Android网络数据库连接。
	掌握android 操作webService的方法。
二、实验内容
	Jdbc方式：https://blog.csdn.net/weixin_34326179/article/details/89596181。
	Webservice：https://www.runoob.com/w3cnote/android-tutorial-webservice.html
	

三、实验要求
	实现上述的基本功能要求。自定义界面和功能。
	实验报告提交内容：1）结合系统界面（截图）介绍APP功能；2）核心实现代码（Java或Kotlin代码）和布局文件等。
实验9 综合开发 
一、实验目的
	掌握合作开发一整个系统的过程。
二、实验内容
	实现一个学习计划和执行汇报的app系统。
	会员注册登录功能
	下达学习计划任务给某一个会员，包含操作打印机打印计划单，单子上含有二维码
	实现扫码汇报学习任务完成情况
	数据通过webservive和jdbc方式上传
	统计分类任务使用时间，并用条形图显示
	可以接收电子邮件
	可以批量发送电子邮件
	可以接收发送短信
	实现一个论坛，可以发帖；回复
	实现一个题库，包含判断、单选、多选题、编程题，可以组卷、可以自动改卷给出成绩
	可以提交题目

三、实验要求
	实现上述的基本功能要求。
	自定义界面功能。
	实验报告提交内容：1）结合系统界面（截图）介绍APP功能；2）核心实现代码（Java或Kotlin代码）和布局文件等。
