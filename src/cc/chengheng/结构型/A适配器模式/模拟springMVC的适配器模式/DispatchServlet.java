package cc.chengheng.结构型.A适配器模式.模拟springMVC的适配器模式;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
        /*
         * 此处模拟SpringMVC从request取handler对象
         * 适配器可以获取到希望的Controller
         */
        AnnotationController controller = new AnnotationController();

        // 得到对应的适配器
        HandlerAdapter adapter = getHandler(controller);

        // 通过适配器执行对应的controller对应的方法
        adapter.handle(controller);
    }

    private HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}
