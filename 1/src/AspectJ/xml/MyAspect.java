package AspectJ.xml;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    // JoinPoint接口,作为参数获取目标对象

    // 前置通知
    public void before(JoinPoint p)
    {
        System.out.println("前置通知:模拟权限控制");
    }

    // 后置通知
    public void after()
    {
        System.out.println("后置通知");
    }

    // 返回通知
    public void afterReturning(JoinPoint p)
    {
        System.out.println("后置返回通知:模拟删除临时文件");
    }

    // 异常通知
    public void exception(Throwable e) throws Throwable
    {
        System.out.println("异常通知"+"程序执行异常"+e.getMessage());
    }

    // 环绕通知
    public Object around(ProceedingJoinPoint pp) throws Throwable
    {
        System.out.println("环绕开始:执行方法目标前,模拟开启事务");
        Object obj = pp.proceed();
        System.out.println("环绕结束:执行方法目标后,模拟关闭事务");
        System.out.println("环绕通知");
        return obj;
    }


}
