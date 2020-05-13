# TapAnimator-Sample
## Get

### Gradle

1. Add this to `build.gradle` of project gradle dependency

```groovy
allprojects {
	repositories {
		...
 		maven { url 'https://jitpack.io' }
	}
}
```

2. Add this to `build.gradle` of app gradle dependency

```groovy
dependencies {
	implementation ''
}
```
## Usage
#### Import render animations

```java
import render.animations.*
```

#### Start animation

```java
// Create Render Class
 val render = RenderAnimate(this)

// Set Animation
render.setAnimation(Slide().InUp(tv_hello))
render.start()
```

## Animations

To animate the view, add the class name and specific animation method name`setAnimation` to an view. You can include the method `setDuration` to specify duration of animation. Default value for `duration` is `1000 Milliseconds`. Finally you need to add one of the following classes to the view:

| Class Name  |             |             |             |             |             |		  |
| ----------- | ----------- | ----------- | ----------- | ----------- | ----------- | ----------- |
| `Attention` | `Bounce`    | `Fade`      | `Flip   `   | `Rotate`    | `Slide`     | `Zoom`      |

This android view animations library supports number of animations.
## Thanks
This library is based on https://github.com/daimajia/AndroidViewAnimations

