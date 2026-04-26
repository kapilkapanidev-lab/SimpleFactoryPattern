package shape.factory;

import shape.*;

public class ShapeFactory {
    public static Shape getShape(SHAPE_ENUM shapeType) {
        if(shapeType.equals(SHAPE_ENUM.CIRCLE)) {
            return new Circle(2);
        }
        else if(shapeType.equals(SHAPE_ENUM.SQUARE)) {
            return new Square(3);
        }
        else if(shapeType.equals(SHAPE_ENUM.RECTANGLE)){
            return new Rectangle(3,4);
        }
        return null;
    }
}
