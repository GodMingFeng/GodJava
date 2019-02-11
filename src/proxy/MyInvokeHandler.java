package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wujieshuai on 2019/1/24.
 **/
public class MyInvokeHandler<T> implements InvocationHandler {

    private T t;

    public MyInvokeHandler(T t) {
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before we need prepare");
        return method.invoke(t, args);
    }
}
