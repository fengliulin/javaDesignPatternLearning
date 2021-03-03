package cc.chengheng.七大原则.E开闭原则.改进;


public class Ocp {
    public static void main(String[] args) {
        // 使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

// 这是一个用于绘图的类[使用方]
class GraphicEditor {

    // 接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {
       s.draw();
    }
}

// Shape类， 基类
abstract class Shape {
    int m_type;

    protected abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增画三角形
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    public Triangle() {
        super.m_type = 3;
    }
}

// 新增一个图形
class OtherGraphic extends Shape {
    public OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}
