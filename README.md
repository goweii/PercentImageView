# PercentImageView
自由指定宽高比的ImageView

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
Step 2. Add the dependency

  从1.0.2版本开始，版本号前不加v，引用时需要注意。

	dependencies {
	        implementation 'com.github.goweii:PercentImageView:1.0.2'
	}
