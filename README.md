# I'm AOP Loggers Sample

This is a sample project showing how to use `I'm AOP Loggers`.

---

To run the project:

```
mvn spring-boot:run
```


You should be expecting something like the following in your console:

```
2021-11-11 16:17:01.785  INFO 11780 --- [   scheduling-1] im.aop.loggers.demo.foo.FooService       : Entering [Foo accept(Foo)] with parameters [foo=Foo[foo=abc]]
2021-11-11 16:17:01.786 DEBUG 11780 --- [   scheduling-1] i.a.l.advice.before.LogBeforeService     : [logBefore] elapsed [PT0.082415701S]
2021-11-11 16:17:01.813  INFO 11780 --- [   scheduling-1] im.aop.loggers.demo.DemoApplication      : FooService.accept(Foo) returned [Foo[foo=abc]]
2021-11-11 16:17:01.826  INFO 11780 --- [   scheduling-1] im.aop.loggers.demo.bar.BarService       : [Bar accept(Bar)] exited normally with return value [im.aop.loggers.demo.bar.Bar@941becf]
2021-11-11 16:17:01.827 DEBUG 11780 --- [   scheduling-1] i.a.l.a.a.r.LogAfterReturningService     : [logAfterReturning] elapsed [PT0.0016341S]
2021-11-11 16:17:01.827  INFO 11780 --- [   scheduling-1] im.aop.loggers.demo.DemoApplication      : BarService.accept(Bar) returned [im.aop.loggers.demo.bar.Bar@941becf]
2021-11-11 16:17:01.876 ERROR 11780 --- [   scheduling-1] im.aop.loggers.demo.baz.BazService       : [Baz accept(Baz)] exited abnormally with exception [type=IllegalArgumentException, message=Baz]

java.lang.IllegalArgumentException: Baz
  at im.aop.loggers.demo.baz.BazService.accept(BazService.java:16) ~[classes/:na]
  at im.aop.loggers.demo.baz.BazService$$FastClassBySpringCGLIB$$a99d4517.invoke(<generated>) ~[classes/:na]
  at org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218) ~[spring-core-5.3.5.jar:5.3.5]
  at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:779) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:750) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.validation.beanvalidation.MethodValidationInterceptor.invoke(MethodValidationInterceptor.java:123) ~[spring-context-5.3.5.jar:5.3.5]
  at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:750) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.aop.aspectj.AspectJAfterThrowingAdvice.invoke(AspectJAfterThrowingAdvice.java:64) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:175) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:750) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:750) ~[spring-aop-5.3.5.jar:5.3.5]
  at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:692) ~[spring-aop-5.3.5.jar:5.3.5]
  at im.aop.loggers.demo.baz.BazService$$EnhancerBySpringCGLIB$$f94f4d37.accept(<generated>) ~[classes/:na]
  at im.aop.loggers.demo.DemoApplication.runDemo(DemoApplication.java:47) ~[classes/:na]
  at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
  at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
  at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
  at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
  at org.springframework.scheduling.support.ScheduledMethodRunnable.run(ScheduledMethodRunnable.java:84) ~[spring-context-5.3.5.jar:5.3.5]
  at org.springframework.scheduling.support.DelegatingErrorHandlingRunnable.run(DelegatingErrorHandlingRunnable.java:54) ~[spring-context-5.3.5.jar:5.3.5]
  at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515) ~[na:na]
  at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305) ~[na:na]
  at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305) ~[na:na]
  at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128) ~[na:na]
  at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628) ~[na:na]
  at java.base/java.lang.Thread.run(Thread.java:829) ~[na:na]

2021-11-11 16:17:01.878 DEBUG 11780 --- [   scheduling-1] i.a.l.a.a.t.LogAfterThrowingService      : [logAfterThrowing] elapsed [PT0.0283789S]
2021-11-11 16:17:01.878  INFO 11780 --- [   scheduling-1] im.aop.loggers.demo.DemoApplication      : BazService.accept(Baz) thrown exception [Baz]
2021-11-11 16:17:01.912 DEBUG 11780 --- [   scheduling-1] i.a.l.a.a.t.LogAfterThrowingService      : [logAfterThrowing] elapsed [PT0.000038199S]
2021-11-11 16:17:01.913  INFO 11780 --- [   scheduling-1] im.aop.loggers.demo.DemoApplication      : BazService.accept(String) thrown exception [accept.message: must not be blank]
2021-11-11 16:17:01.915  INFO 11780 --- [   scheduling-1] im.aop.loggers.demo.qux.QuxService       : Entering [Qux accept(Qux)] with parameters [qux=Qux[qux=abc]]
2021-11-11 16:17:01.950  INFO 11780 --- [   scheduling-1] im.aop.loggers.demo.qux.QuxService       : [Qux accept(Qux)] exited normally with return value [Qux[qux=abc]]
2021-11-11 16:17:01.952  INFO 11780 --- [   scheduling-1] im.aop.loggers.demo.qux.QuxService       : [Qux accept(Qux)] elapsed [PT0.0339697S]
2021-11-11 16:17:01.954  WARN 11780 --- [   scheduling-1] im.aop.loggers.demo.qux.QuxService       : [Qux accept(Qux)] reached elapsed time limit [PT0.005S]
2021-11-11 16:17:01.954 DEBUG 11780 --- [   scheduling-1] i.a.l.advice.around.LogAroundService     : [logAround] elapsed [PT0.005440399S]
2021-11-11 16:17:01.954  INFO 11780 --- [   scheduling-1] im.aop.loggers.demo.DemoApplication      : QuxService.accept(Qux) returned [Qux[qux=abc]]
```
