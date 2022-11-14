package funwithshapesoo;
import org.json.simple.JSONObject;
public class ShapeFactory {
    public static Shape buildFromJSON(JSONObject obj) {
        String type = obj.get("shapetype").toString();
        double x = Double.parseDouble(obj.get("x").toString());
        double y = Double.parseDouble(obj.get("y").toString());
        double radius,length,width;
        if (type.equalsIgnoreCase("circle")) {
            radius = Double.parseDouble(obj.get("radius").toString());
            return new Circle(x,y,radius);
        } else if (type.equalsIgnoreCase("rect")) {
            length = Double.parseDouble(obj.get("length").toString());
            width = Double.parseDouble(obj.get("width").toString());
            return new Rectangle(x,y,length,width);
        } else {
            return null;
        }
    }
}
